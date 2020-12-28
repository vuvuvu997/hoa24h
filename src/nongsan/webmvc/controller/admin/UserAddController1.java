package nongsan.webmvc.controller.admin;

import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import nongsan.webmvc.model.User;
import nongsan.webmvc.service.UserService;
import nongsan.webmvc.service.impl.UserServicesImpl;

/**
 * Servlet implementation class UserAddController1
 */
@WebServlet("/UserAddController1")
public class UserAddController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserService userService = new UserServicesImpl();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserAddController1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/view/admin/adduser.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		String user_name = request.getParameter("user-name");
		String user_email = request.getParameter("user-email");
		String user_phone = request.getParameter("user-phone");
		String user_userName = request.getParameter("user-userName");
		String user_password = md5(request.getParameter("user-password"));
		String user_created = request.getParameter("user-created");
		
		
		User user = new User();
		user.setName(user_name);
		user.setEmail(user_email);
		user.setPhone(user_phone);
		user.setUsername(user_userName);
		user.setPassword(user_password);
		user.setCreated(user_created);
		
		System.out.println(user.getEmail());
		System.out.println(user.getName());
		System.out.println(user.getPassword());
		System.out.println(user.getPhone());
		System.out.println(user.getCreated());
		System.out.println(user.getUsername());
		
		List<User> userList = null;
		userService.insert(user);
		
	
		userList = userService.getAll(); 
		
		
		request.setAttribute("userlist", userList); 
//		response.sendRedirect(request.getContextPath() + "/list_nv.jsp"); 
		RequestDispatcher dispatcher = request.getRequestDispatcher("/view/admin/user.jsp"); 
		dispatcher.forward(request, response);
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

}
