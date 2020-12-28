package nongsan.webmvc.controller.admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nongsan.webmvc.model.Boardnew;
import nongsan.webmvc.model.User;
import nongsan.webmvc.service.BoardnewService;
import nongsan.webmvc.service.impl.BoardnewServicesImpl;

/**
 * Servlet implementation class SearchNew
 */
@WebServlet("/SearchNew")
public class SearchNew extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BoardnewService newService = new BoardnewServicesImpl();     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchNew() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String searchNew = request.getParameter("searchNew");
		
		
		
//		getList
		List<Boardnew> boardnewList = newService.searchByName(searchNew);
//		setAttribute va do ra view
		request.setAttribute("boardnewlist", boardnewList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/view/admin/show-new.jsp");
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
