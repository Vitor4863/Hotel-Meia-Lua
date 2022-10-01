package exercicioHotel;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hotel
 */
@WebServlet("/Hotel")
public class Hotel extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Hotel() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String Hotel = request.getParameter("Hotel");
		
		int lua = Integer.parseInt(Hotel);
		double conta = 0;

		try (PrintWriter out = response.getWriter()) {
			out.println("<!DOCTYPE html>");
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Hotel</title>");
			out.println("<link rel=\"stylesheet\" href=\"estilo.css\">");
			out.println("<style> background-image: url(\"img/Hotel.png\");   </style>");
			out.println("</head>");
			out.println("<body>");
			out.println("<center>");
			out.println("<h1>Hotel Meia Lua"+ "</h1>");
			for (int i = 1; i <= lua; i++) {
				conta += (100 / i);
			}
			out.println("Valor da Conta :" +conta + "<br />");
			out.println("</center>");
			out.println("</body>");
			out.println("</html>");

		
		}
		
	}

}
