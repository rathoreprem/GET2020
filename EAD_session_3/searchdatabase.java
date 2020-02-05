package EadAssignment3;

import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class searchdatabase
 */
@WebServlet("/searchdatabase")
public class searchdatabase extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
			// TODO Auto-generated method stub
	{
				PrintWriter show = response.getWriter();
				String firstName = request.getParameter("studentFirstName");
				String lastName = request.getParameter("studentLastName");
				try 
				{
					
					Class.forName("com.mysql.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root"); 
					PreparedStatement ps=con.prepareStatement(" select *from sdatabase;");
					ResultSet resultSet = ps.executeQuery();
					
					show.print("<html><head><title>Students</title></head><body>");
					show.print("<table border = '2'>");
					show.print("<tr><th>FirstName</th><th>LastName</th><th>Father'sName</th><th>Email</th><th>Age</th><th>Class</th></tr" + ">");
					while (resultSet.next()) 
					{ 
						if(resultSet.getString(1).equals(firstName) && resultSet.getString(2).equals(lastName))
						{
						show.print("<tr><form action = 'UpdateStudentDetails'><td>" + resultSet.getString(1) + "</td><td>"
								+ resultSet.getString(2) + "</td><td>" + resultSet.getString(3) + "</td><td >"
								+ resultSet.getString(4) + "</td><td>" + resultSet.getString(5) + "</td><td>"
		                        + resultSet.getString(6) +  "</td><td></form><button> <a href='update.html'</a>update</button></td></tr>");
						}
					}
					show.print("</table>" + "<br><br><a href='homepage.html'>Home Page </a><br>" + "</body></html>");
					show.close();
				
				}catch (SQLException e) 
				{
					e.printStackTrace();
				}
				catch (ClassNotFoundException e)
				{
					e.setStackTrace(null);
				}
		}
}

