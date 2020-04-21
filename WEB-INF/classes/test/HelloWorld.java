package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HelloWorld extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse
			response) throws ServletException, IOException
	        {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.println("<html><head><title>");
				out.println("this is my first servlet");
				out.println("</title></head><body>");
				out.println("<h1>hello world!</h1>");
				out.println("</body></html>");
	        }
}
