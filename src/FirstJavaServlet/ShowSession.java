package FirstJavaServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class SecondeServlet
 */
@WebServlet("/Servlet ShowSession")

public class ShowSession extends HttpServlet {
	int cpt = 0;
	
	
	/**
     * @see HttpServlet#HttpServlet()
     */
	public ShowSession() {
		super();
       // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter show = response.getWriter();
		
		HttpSession t = request.getSession(true);
		

			show.println("<HTML>");
			show.println("<Head><Title>MonServer TP1</title></head>");
			show.println("<body>");
			if (t.isNew()== true) {
				show.println("<h1> Welcome on my site!</h1>");
				cpt +=1;
			}
			else {
				show.println("<h1> Welcome back </h1>");
				cpt +=1;
			}
			show.println("<br>");
			show.println("<h2> Il y a " + cpt + " visiteurs </h2>");
			show.println("</body></html>");
			show.close();		
		
		}
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


}
