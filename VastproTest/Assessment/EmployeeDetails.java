package com.javatraining.Assessment;

import java.sql.*;


import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeeDetails {
	public static final String DB_DRIVER_CLASS = "org.postgresql.Driver";
	public static String DB_URL = "jdbc:postgresql://localhost:5432/vastpro";
	public static String DB_USER = "postgres";
	public static String DB_PASSWORD = "postgres";
	public static String INSERT = "insert into employee1Servlet (empid,name,age,designation,phone,salary)values(?,?,?,?,?,?);";
	public static String UPDATE = "update  employee1Servlet set salary=?,designation=? where=empid=?;";
	public static String DELETE = "delete from  employee1Servlet empid=?;";

	public static Connection getConnection() throws SQLException {
		Connection con = null;
		{
			try {
				Class.forName(DB_DRIVER_CLASS);
				con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			}

			catch (Exception e) {
				System.out.println(e.getMessage());
			}

			return con;
		}
	}

	public static int insert(Employee e) {

		int res = 0;
		try {
			Connection con = EmployeeDetails.getConnection();
			PreparedStatement ps = con.prepareStatement(INSERT);
			
			ps.setInt(1, e.getEmpid());
			ps.setString(2, e.getName());
			ps.setInt(3, e.getAge());
			ps.setString(4, e.getDesignation());
			ps.setInt (5, e.getPhone());
			ps.setInt(6, e.getSalary());

			res = ps.executeUpdate();
			con.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return res;
	}



	public static int update(Employee e) {

		int status = 0;
		try {
			Connection con = EmployeeDetails.getConnection();
			PreparedStatement ps = con.prepareStatement(UPDATE);
			ps.setInt(1, e.getSalary());
			ps.setInt(3, e.getEmpid());
			ps.setString(2, e.getDesignation());
		
			status = ps.executeUpdate();
			con.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return status;
	}
	  public static int delete(int id)
	    {  
	        int status=0;  
	        try{  
	            Connection con=EmployeeDetails.getConnection();  
	            PreparedStatement ps=con.prepareStatement(DELETE);  
	            ps.setInt(1,id);  
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return status;  
	    }  
	  
	
}


