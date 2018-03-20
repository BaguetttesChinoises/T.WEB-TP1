package FirstJavaServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondeServlet
 */
@WebServlet("/FormServlet")

public class FirstJavaServlet extends HttpServlet {
	
	/**
     * @see HttpServlet#HttpServlet()
     */
	public FirstJavaServlet() {
		super();
       // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<HTML>"); 
		out.println("<HEAD><TITLE>Our First Servlet</TITLE></HEAD>"); 
		out.println("<BODY>"); 
		out.println("<H1></H1>"); 
		out.println("</BODY></HTML>"); 
		//close the output stream 
		//out.close();
		out.println("Vous vous appelez " + request.getParameter("Nom") + " " + request.getParameter("Prénom")+"<br>");
		//out.println(request.getParameter("Prénom")+"<br>");
		out.println("Vous êtes né le " + request.getParameter("Date de Naissance")+"<br>");
		if (request.getParameter("SEX")== "Man")
			out.println("Et vous êtes un homme");
		else
			out.println("Et vous êtes une femme");
		out.close();*/
		

		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter(); 
		// Create Cookie
		//Cookie c = new Cookie("serverAdress", request.getRemoteAddr()); 
		Cookie adresse = new Cookie ("ServerAdress", request.getRemoteAddr());
		Cookie name = new Cookie("Name", request.getParameter("Nom"));
		Cookie lastname = new Cookie("Lastame", request.getParameter("Prénom"));
		Cookie birthday = new Cookie("Birthday", request.getParameter("Date de Naissance"));
		Cookie sex = new Cookie("Sex", request.getParameter("Sexe"));
	
		
		// Durée de vie d'un cookie
		adresse.setMaxAge(0);
		name.setMaxAge(60); 
		lastname.setMaxAge(60);
		birthday.setMaxAge(60);
		sex.setMaxAge(60);
		//c.setMaxAge(0);

		
		// Retrieve Cookie
		//Cookie[] cookies = request.getCookies();
		response.addCookie(adresse);
		response.addCookie(name);
		response.addCookie(lastname);
		response.addCookie(birthday);
		response.addCookie(sex);
		
		out.println("<HTML>");
		out.println("<Head><Title>MonServer TP1</title></head>");
		out.println("<body>");
		out.println("<table>");
		//if (cookies != null ) {
		//for (Cookie r_c : cookies) {
		out.print("<tr><td> Name </td><td>" + name.getValue() + "</td></tr>");
		out.print("<tr><td> Last Name </td><td>" + lastname.getValue() + "</td></tr>");
		out.print("<tr><td> Birthday </td><td>" + birthday.getValue() + "</td></tr>");
		out.print("<tr><td> Sexe </td><td>" + request.getParameter("Sexe") + "</td></tr>");
		//out.print("</td><td> <input type="submit" value="send"> </td></tr>");
		//	}
		//}
		out.println("</table>");
		out.println("</body></html>");
		out.close();
		
	}
}
