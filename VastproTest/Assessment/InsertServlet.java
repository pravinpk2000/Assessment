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
 * Servlet implementation class InsertServlet
 */
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		int empid=Integer.parseInt(request.getParameter("Empid"));
		String name=request.getParameter("name");
		int age=Integer.parseInt(request.getParameter("age"));
		String Desin=request.getParameter("Designation");
		int phone=Integer.parseInt(request.getParameter("phone"));
		int salary=Integer.parseInt(request.getParameter("salary"));
	
		Employee e=new Employee();
		e.setEmpid(empid);
		e.setName(name);
		e.setAge(age);
		e.setDesignation(Desin);
		e.setPhone(phone);
		e.setSalary(salary);
		
		int res=EmployeeDetails.insert(e);  
		
        if(res>0){  
            pw.print("Record saved successfully");  
            RequestDispatcher rd=request.getRequestDispatcher("index.html");
    		rd.include(request, response);
    }
        
	else{  
            pw.print("Sorry! unable to save record");  
        }  
          
        pw.close();  
    }  
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
