package isep.lab1.bean;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Person
 */
@WebServlet("/Person")
public class Person extends HttpServlet {
	
    private String Nom;
    private String Prénom;
    private String Date_de_Naissance;
    private String Sex;
    
    
    
    public String getNom() {
        return Nom;
    }
    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    
    public String getPrénom() {
        return Prénom;
    }
    public void setPrénom(String Prénom) {
        this.Prénom = Prénom; 
    }
    public String getDate_de_Naissance() {
        return Date_de_Naissance;
    }
    public void setDate_de_Naissance(String Date_de_Naissance) {
        this.Date_de_Naissance = Date_de_Naissance;
    }
    public String getSex() {
        return Sex;
    }
    public void setSex(String Sex) {
        this.Sex = Sex; 
    }

	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		this.Nom = request.getParameter("name");
		request.setAttribute("Nom", Nom);
		this.Prénom = request.getParameter("Last Name");
		request.setAttribute("Prénom", Prénom);
		this.Date_de_Naissance = request.getParameter("Date_de_Naissance");
		request.setAttribute("Date de Naissance", Date_de_Naissance);
		this.Sex = request.getParameter("Sex");
		request.setAttribute("Sexe", Sex);
		this.getServletContext().getRequestDispatcher("/Bean.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
