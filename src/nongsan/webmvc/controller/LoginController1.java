package nongsan.webmvc.controller;

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

import nongsan.webmvc.model.User;
import nongsan.webmvc.service.LoginBO;
import nongsan.webmvc.service.impl.LoginBOimpl;

/**
 * Servlet implementation class LoginController1
 */
@WebServlet("/LoginController1")
public class LoginController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/view/client/login.jsp");
    	dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		String username = request.getParameter("username");
		String password = md5(request.getParameter("password"));
		System.out.println(password);
		LoginBO checkBO=new LoginBOimpl();
	
		try {
		User u = checkBO.checkLogin(username, password);
		if(u != null && isCaptchaValid("6Lfyi-AZAAAAANHnNU8doSXt7-ehvs-0tsdlHL2k", request.getParameter("g-recaptcha-response"))) {
			HttpSession session = request.getSession();
            session.setAttribute("username", username);
            response.sendRedirect(request.getContextPath() + "/HomeController1"); 
		}
		else if(!isCaptchaValid("6Lfyi-AZAAAAANHnNU8doSXt7-ehvs-0tsdlHL2k", request.getParameter("g-recaptcha-response")))
		{
			request.setAttribute("errorMsg", "Ban chua dien capcha !!!");
			 RequestDispatcher rd = request.getRequestDispatcher("/view/client/login.jsp");
	         rd.forward(request, response);
		}
		else {
			 request.setAttribute("errorMsg", "Tai Khoan Bi sai roi !!!");
			 RequestDispatcher rd = request.getRequestDispatcher("/view/client/login.jsp");
	         rd.forward(request, response);
		}
	} catch (Exception e) {
		e.printStackTrace();
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
