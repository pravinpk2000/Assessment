package com.javatraining.Assessment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UpdateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		int empid = Integer.parseInt(request.getParameter("Empid"));
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String Design = request.getParameter("Designation");
		int phone = Integer.parseInt(request.getParameter("phone"));
		int salary = Integer.parseInt(request.getParameter("salary"));

		Employee emp = new Employee();
		emp.setEmpid(empid);
		emp.setDesignation(Design);
		emp.setSalary(salary);
		int status = EmployeeDetails.update(emp);

		if (status > 0) {
			pw.print("Record saved successfully");

		}

		else {
			pw.print("Sorry! unable to save record");
		}

		pw.close();

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
