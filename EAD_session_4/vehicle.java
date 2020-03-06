package ead_4;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class vehicle
 */
@WebServlet("/vehicle")
public class vehicle extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		PrintWriter show = response.getWriter();
		String vname=request.getParameter("vname");
		String vtype=request.getParameter("vtype");
		String vnumber=request.getParameter("vnumber");
		String empid=request.getParameter("employeeid");
		String desc=request.getParameter("description");
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root"); 
			PreparedStatement ps=con.prepareStatement("INSERT INTO vehicle VALUES(?,?,?,?,?);");
			ps.setString(1, vname);
			ps.setString(2, vtype);
			ps.setString(3, vnumber);
			ps.setString(5, empid);
			ps.setString(4, desc);
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
			if(vtype.equals("car"))
				{	
					show.print("hi...");
					response.sendRedirect("car.html");
				}
			else if(vtype.equals("cycle"))
				{
					response.sendRedirect("cycle.html");
				}
			else if(vtype.equals("motorcycle"))
				{
					response.sendRedirect("price.html");
				}
			else
				{
					response.sendRedirect("home.html");
				}
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
