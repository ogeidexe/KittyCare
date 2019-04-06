import javax.servlet.http.HttpServlet;
@SuppressWarnings("serial")
public class TesteServlet extends HttpServlet   {
	public void doGet(HttpServletRequest request, HttpServletResponse
	response) throws
	    ServletException, IOException {
		response.setContentType("text/html");
	      PrintWriter out = response.getWriter();
	      
	  }
	public void doPost(){
		
	}
	
}
