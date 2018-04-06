package helloworld;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/")
public class Hell2World extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String message;

	   public void init() throws ServletException {
	      // Do required initialization
	      message = "Hello2World";
	   }

	   public void doGet(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
	      
	      // Set response content type
	      response.setContentType("text/html");

	      // Actual logic goes here.
	      PrintWriter out = response.getWriter();
	      out.println("<h1>" + message + "</h1>");
	   }

	   public void destroy() {
	      // do nothing.
	   }
}