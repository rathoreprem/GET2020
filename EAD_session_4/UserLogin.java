package ead_4;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserLogin
 */
@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
   /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		PrintWriter show = response.getWriter();
		String email = request.getParameter("username");
		String password = request.getParameter("password");
		int flag=0;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root"); 
			PreparedStatement ps=con.prepareStatement(" select * from user left join vehicle on user.empid=vehicle.empid;");
			ResultSet resultSet = ps.executeQuery();
			show.print("<html><head><title>Students</title></head><body>");
			show.print("<table border = '2'>");
			show.print("<tr>"+ 
							"<th>FullName</th>"+ 
							"<th>Gender</th>"+ 
							"<th>Email</th>"+ 
							"<th>Organization</th>"+ 
							"<th>Password</th>"+ 
							"<th>Mobile No.</th>"+ 
							"<th>Vehicle_cname</th>"+ 
							"<th>Vehicle Type</th>"+ 
							"<th>Vehicle no</th>"+ 
							"<th>Description</th>"+ 
							"<th>empid</th>"+ 
						"</tr>");
			show.print("<html>"+"<body>"+"<a href='friend.html'>Employee</a>"+"</body>"+"</html>");
			while (resultSet.next())
			{
				flag++;
				if(resultSet.getString(4).equals(email) && resultSet.getString(5).equals(password))
					{	
						
						show.print("<tr>"+"<form >"+
											"<td>" + resultSet.getString(1)+ 
											"</td><td>" + resultSet.getString(2)+ 
											"</td><td>" + resultSet.getString(4)+
											"</td><td>" + resultSet.getString(3)+
											"</td><td>" + resultSet.getString(5)+
											"</td><td>" + resultSet.getString(7)+ 
											"</td><td>" + resultSet.getString(9)+
											"</td><td>" + resultSet.getString(10)+
											"</td><td>" + resultSet.getString(11)+
											"</td><td>" + resultSet.getString(12)+
											"</td><td>" + resultSet.getString(13)+
											"</td><td>"+"</form>"+"</td></tr>");
						HttpSession s=request.getSession();
						s.setAttribute("company",resultSet.getString(3));
						flag=0;
					}
					else if(flag==0)
					{	
						show.println("<script type=\"text/javascript\">");
						show.println("alert('Invalid Username or Password');");
						show.println("</script>");
						
					}
			}
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
