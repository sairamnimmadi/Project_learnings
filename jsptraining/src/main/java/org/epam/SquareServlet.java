package org.epam;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/square")
public class SquareServlet extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int sum = (int) request.getAttribute("sum");
		
		sum*=sum;
		
		PrintWriter out = response.getWriter();
		
		out.print("The square of the sum of two numbers is "+ sum);
		
	}
	
}
