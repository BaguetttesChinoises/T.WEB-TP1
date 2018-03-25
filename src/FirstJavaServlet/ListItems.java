package src.FirstJavaServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;

/**
 * Servlet implementation class ListItems
 */
@WebServlet("/ListItems")
public class ListItems extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListItems() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	    HttpSession l = request.getSession(true);
        PrintWriter List = response.getWriter();
        
        if (l.isNew()) {
            ArrayList<String> ListItem = new ArrayList<>();
            l.setAttribute("itemsList", ListItem);
        }

        this.displayList(List, l);

        List.close();
    }
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		response.setContentType("text/html");
		PrintWriter List = response.getWriter();
		
		HttpSession l = request.getSession(true);

		List.println("<HTML>");
		List.println("<Head><Title>List Item</title></head>");
		List.println("<body>");
		
		if (l.isNew()== true){
			ArrayList<String> ListItem = new ArrayList<>();		
			ListItem.add(request.getParameter("newItem"));
			l.setAttribute("itemsList",  ListItem);
			List.println("<h1> Welcome on my site!</h1>");
		}
		
		else {
			ArrayList<String> temporaire = (ArrayList<String>)l.getAttribute("itemsList");
			
			if (temporaire != null) {
				temporaire.add(request.getParameter("newItem"));
				l.setAttribute("itemsList", temporaire);
			}
			else {
				ArrayList<String> ListItem = new ArrayList<>();
				ListItem.add(request.getParameter("newItem"));
				l.setAttribute("itemsList", ListItem);
			}

		}
		List.println("<br>");
		List.println("</body></html>");
		List.close();
	}
	
    private void displayList(PrintWriter List, HttpSession s) {
        ArrayList<String> temporaire = (ArrayList<String>) s.getAttribute("itemsList");

        List.println("<html>");
        List.println("<head><title>Your Items List</title></head><body>");
        List.println("<h1>List content :</h1>");

        if (temporaire != null && temporaire.size() > 0) {
            for (String item: temporaire) {
                List.println("<h4>" + item + "</h4>");
            }
        } else {
            List.println("<h4>No items to display</h4>");
        }

        List.println("     <a style=\"border: solid 1px #5EABFF; border-radius: 5px; background: #ff5e96; color: white; padding: 1rem; text-decoration: none;\" href=\"/T.WEB-TP1/items.html\">Add a new item</a>  ");

        List.println("</body></html>");
    }

}

