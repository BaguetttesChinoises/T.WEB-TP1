package lab.mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lab.mvc.model.Person;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Controller() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// reads a person’s information passed through the HTML form
		String Nom = request.getParameter("Nom");
		String Prénom = request.getParameter("Prénom");
		String Date_de_Naissance = request.getParameter("Date_de_Naissance");
		String Sex = request.getParameter("Sex");
		// uses these information to create an instance of the bean Person
		Person person = new Person (Nom, Prénom, Date_de_Naissance, Sex);
		// adds the created bean to the request (using request.setAttribute(..,..))
		request.setAttribute("person", person);		
		// forwards the request the appropriate JSP page
		RequestDispatcher dispatcher=getServletContext().getRequestDispatcher("/young.jsp");
		dispatcher.include(request, response);
	}

}
