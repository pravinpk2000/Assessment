package com.vastpro.Todaytest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WithdrawServlet
 */
@WebServlet("/WithdrawServlet")
public class WithdrawServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static int basic =25000;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WithdrawServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
//		pw.print("<body>\n"
//				+ "<form>\n"
//				+ "<table>\n"
//				+ "<tr><td>AMOUNT:<input type =\"text\" name=\"withdrawamount\" /><td></tr>\n"
//				+ "<tr><td><input type=\"submit\" value=\"proceed\" formaction=\"WithdrawServlet\">\n"
//				+"</table>\n"
//				+"\n"
//				+"\n"
//				+"</form>/n"
//				+"/n"
//				+"</body>");
		pw.print("basic :"+basic);
		String withdrawAmount=request.getParameter("withdrawamount");
		int a =Integer.parseInt(withdrawAmount);
		if(basic>a)
		{
			//pw.print("amount is available ");
			pw.print("you withdraw amount is: "+a);
			pw.print("<form><input type='hidden' name='withdraw' value=' "+a+"'/>");
			pw.print("<input type ='submit' value='checkbalance' formaction='BalanceServlet'/>");
			pw.print("<input type ='submit value='goback' formaction ='Bank.html'/></form>");
		}
		else
		{
			pw.print("unavailable amount");
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
