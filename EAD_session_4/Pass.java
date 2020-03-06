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
 * Servlet implementation class Pass
 */
@WebServlet("/Pass")
public class Pass extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		// TODO Auto-generated method stub
		PrintWriter show = response.getWriter();
		String currency=request.getParameter("finalPay");
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root"); 
			PreparedStatement ps=con.prepareStatement("insert into passvalue values(?);");
			ps.setString(1, currency);
			int x = ps.executeUpdate();
			if (x > 0)
			{
				System.out.println("pass Successfully Inserted");
			} 
			else 
			{
				System.out.println("Insert Failed");
			}
			con.close();
			show.println("<script type=\"text/javascript\">");
			show.println("alert('Successfully Plan Is Excuted..........!');");
			show.println("</script>");
			
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
