package com.vastpro.Todaytest;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BalanceServlet
 */
@WebServlet("/BalanceServlet")
public class BalanceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static int basic =45000;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
	   
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        public BalanceServlet() {
        	
        	
    	map.put("1245678925354862",10000);
    	
           
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<h1>Balance<h1>");
		pw.println("<body><form><table><tr><td>Card number:</td><td><input type='number'name='balance' placeholder='Enter the card number'/><td><tr>"
		           + "</tr><tr><td><input type ='submit' value = 'ok'</td><tr></table></form></body>");
		pw.print("basic :"+basic);
		           String card = request.getParameter("balance");
		           
		           
		           for(Map.Entry m : map.entrySet()) {
		        	   
		        	   if(card.equals(m.getKey())) {
		        		   pw.print("your balance -"+m.getValue());
		        		   
		        	   }
		        	  

		        	   else {
		        		   pw.print("Invalid number");
		        	   }
		        	   break;
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
