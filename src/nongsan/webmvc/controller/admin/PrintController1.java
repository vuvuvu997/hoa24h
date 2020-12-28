package nongsan.webmvc.controller.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;  
import java.util.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
//import com.darwinsys.spdf.PDF;  
//import com.darwinsys.spdf.Page;  
//import com.darwinsys.spdf.Text;  
//import com.darwinsys.spdf.MoveTo; 
/**
 * Servlet implementation class PrintController1
 */
@WebServlet("/PrintController1")
public class PrintController1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrintController1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();  
		response.setContentType("application/pdf");  
		  
		response.setHeader("Content-disposition","inline; filename='javatpoint.pdf'");  
//		  
//		PDF p = new PDF(out);  
//		Page p1 = new Page(p);  
//		p1.add(new MoveTo(p, 200, 700));  
//		p1.add(new Text(p, "www.javatpoint.com"));  
//		p1.add(new Text(p, "by Sonoo Jaiswal"));  
//		          
//		p.add(p1);  
//		p.setAuthor("Ian F. Darwin");  
//		  
//		p.writePDF();  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
