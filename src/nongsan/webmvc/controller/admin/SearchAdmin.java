package nongsan.webmvc.controller.admin;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nongsan.webmvc.model.Admin;
import nongsan.webmvc.model.User;
import nongsan.webmvc.service.AdminService;
import nongsan.webmvc.service.impl.AdminServicesImpl;

/**
 * Servlet implementation class SearchAdmin
 */
@WebServlet("/SearchAdmin")
public class SearchAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String searchAdmin = request.getParameter("searchAdmin");
		

		
		
		AdminService adminService = new AdminServicesImpl(); 
		ArrayList<Admin> adminList = null;
		adminList = adminService.searchByName(searchAdmin); 
		request.setAttribute("adminlist", adminList); 
		RequestDispatcher dispatcher = request.getRequestDispatcher("/view/admin/admin.jsp"); 
		dispatcher.forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
