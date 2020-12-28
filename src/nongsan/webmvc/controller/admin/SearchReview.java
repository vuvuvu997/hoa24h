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

import nongsan.webmvc.model.Product;
import nongsan.webmvc.model.Review;
import nongsan.webmvc.model.User;
import nongsan.webmvc.service.ProductService;
import nongsan.webmvc.service.ReviewService;
import nongsan.webmvc.service.impl.ProductServiceImpl;
import nongsan.webmvc.service.impl.ReviewServicesImpl;

/**
 * Servlet implementation class SearchReview
 */
@WebServlet("/SearchReview")
public class SearchReview extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ReviewService reviewService = new ReviewServicesImpl();  
	ProductService productService = new ProductServiceImpl();    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchReview() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String searchReview = request.getParameter("searchReview");
		
		
		
		List<Review> reviewList = reviewService.searchByName(searchReview);
		request.setAttribute("reviewlist", reviewList);
		List<Product> productList = productService.getAll();
		request.setAttribute("productlist", productList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/view/admin/show-review.jsp");
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
