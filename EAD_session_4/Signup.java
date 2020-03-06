package ead_4;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class Signup
 */
@WebServlet("/Signup")

public class Signup extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		String fstname=request.getParameter("fullname");
		String gender=request.getParameter("gender");
		String organization=request.getParameter("organization");
		String email=request.getParameter("email");
		String pass=request.getParameter("password");
		String cpass=request.getParameter("cpassword");
		String mobile_no=request.getParameter("mobile_no");
		String empid=request.getParameter("empid");
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root"); 
			PreparedStatement ps=con.prepareStatement("	INSERT INTO user VALUES(?,?,?,?,?,?,?,?);");
			ps.setString(1, fstname);
			ps.setString(2, gender);
			ps.setString(3, organization);
			ps.setString(4, email);
			ps.setString(5, pass);
			ps.setString(6, cpass);
			ps.setString(7, mobile_no);
			ps.setString(8, empid);
			int x = ps.executeUpdate();
			if (x > 0)
			{
				System.out.println("Successfully Inserted");
			} 
			else 
			{
				System.out.println("Insert Failed");
			}
			con.close();
			HttpSession session = request.getSession();
			session.setAttribute("empId", empid);
			response.sendRedirect("vehicle.html");
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.setStackTrace(null);
		}
	}
}


