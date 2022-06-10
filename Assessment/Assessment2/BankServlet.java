package com.vastpro.Todaytest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.source.tree.PatternTree;

/**
 * Servlet implementation class BankServer
 */
@WebServlet("/BankServlet")
public class BankServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BankServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
			response.setContentType("text/Html");
			PrintWriter pw=response.getWriter();
			String Cardnumber=request.getParameter("Card");
			String Atm=request.getParameter("pin");
			
			if(Pattern.matches("[0-9]{16}",Cardnumber))
			{
			pw.println("cardnumber is : "+ Cardnumber+"/n");
			pw.println("cardpin is : "+ Atm+"/n");
	}
			else {
				pw.print("invalid cardnumber");
			}
	}	
			
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
