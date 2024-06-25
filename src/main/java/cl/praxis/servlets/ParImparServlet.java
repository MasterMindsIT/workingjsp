package cl.praxis.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.praxis.verified.ParImpar;

@WebServlet("/ParImparServlet")
public class ParImparServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ParImpar parImpar = new ParImpar();
    public ParImparServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("El número <<"+request.getParameter("valor")+">> es ").append(parImpar.parImpar(Integer.parseInt(request.getParameter("valor"))));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
