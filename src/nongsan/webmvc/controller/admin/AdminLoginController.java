package nongsan.webmvc.controller.admin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.json.JSONObject;

import nongsan.webmvc.dao.AdminLoginDao;
import nongsan.webmvc.model.Admin;


@WebServlet("/AdminLoginController")
public class AdminLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
           
    public AdminLoginController() {
        super();    
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/view/admin/login.jsp");
    	dispatcher.forward(request, response);
    }
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	   response.setContentType("text/html");   
		 
		String username = request.getParameter("admin-username");
		String password = md5((request.getParameter("admin-password")));
		System.out.println(username);
		System.out.println(password);
		Admin admin = new Admin();
		admin.setName(request.getParameter("name"));
		
		if(AdminLoginDao.checkAdminLogin(username,password) && isCaptchaValid("6Lfyi-AZAAAAANHnNU8doSXt7-ehvs-0tsdlHL2k", request.getParameter("g-recaptcha-response"))) {
			HttpSession session = request.getSession();
			session.setAttribute("admin-username", username);
			session.setAttribute("admin-password", password);
			response.sendRedirect(request.getContextPath() + "/HomeController2"); 
		}
		else if(!isCaptchaValid("6Lfyi-AZAAAAANHnNU8doSXt7-ehvs-0tsdlHL2k", request.getParameter("g-recaptcha-response")))
		{
			request.setAttribute("errorMessage", "Ban chua dien capcha !!!");
            RequestDispatcher rd = request.getRequestDispatcher("/view/admin/login.jsp");
            rd.forward(request, response);   
		}
		else {
            request.setAttribute("errorMessage", "Tai khoan cua ban nhap sai !!!");
            RequestDispatcher rd = request.getRequestDispatcher("/view/admin/login.jsp");
            rd.forward(request, response);     
		}
		
	}
    
    public static String md5(String str){
		String result = "";
		MessageDigest digest;
		try {
			digest = MessageDigest.getInstance("MD5");
			digest.update(str.getBytes());
			BigInteger bigInteger = new BigInteger(1,digest.digest());
			result = bigInteger.toString(16);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return result;
	}
	
    
    public synchronized boolean isCaptchaValid(String secretKey, String response) {
        try {
            String url = "https://www.google.com/recaptcha/api/siteverify",
                    params = "secret=" + secretKey + "&response=" + response;

            HttpURLConnection http = (HttpURLConnection) new URL(url).openConnection();
            http.setDoOutput(true);
            http.setRequestMethod("POST");
            http.setRequestProperty("Content-Type",
                    "application/x-www-form-urlencoded; charset=UTF-8");
            OutputStream out = http.getOutputStream();
            out.write(params.getBytes("UTF-8"));
            out.flush();
            out.close();

            InputStream res = http.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(res, "UTF-8"));

            StringBuilder sb = new StringBuilder();
            int cp;
            while ((cp = rd.read()) != -1) {
                sb.append((char) cp);
            }
            JSONObject json = new JSONObject(sb.toString());
            res.close();

            return json.getBoolean("success");
        } catch (Exception e) {
            //e.printStackTrace();
        }
        return false;
    }
	

}
