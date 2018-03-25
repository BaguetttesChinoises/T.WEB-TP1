package lab.mvc.model;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class Person
 */
@WebServlet("/Person")
public class Person extends HttpServlet {
	
    private String Nom;
    private String Pr�nom;
    private String Date_de_Naissance;
    private String Sex;
    
    public String getNom() {
        return Nom;
    }
    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    
    public String getPr�nom() {
        return Pr�nom;
    }
    public void setPr�nom(String Pr�nom) {
        this.Pr�nom = Pr�nom; 
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
	public Person(String nom, String pr�nom, String date_de_Naissance, String sex) {
		super();
		Nom = nom;
		Pr�nom = pr�nom;
		Date_de_Naissance = date_de_Naissance;
		Sex = sex;
	}
    
    

}
