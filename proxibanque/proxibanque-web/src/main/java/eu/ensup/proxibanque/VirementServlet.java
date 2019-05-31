package eu.ensup.proxibanque;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eu.ensup.proxibanque.service.ConseillerService;
import eu.ensup.proxibanque.domaine.*;

/**
 * Servlet implementation class VirementServlet
 */
@WebServlet("/VirementServlet")
public class VirementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public VirementServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			virement(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	protected void virement(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {
		
		Client debiteur = new Client();
		Client crediteur = new Client();
		Transaction transac = new Transaction();
		
		int numcre = Integer.parseInt(request.getParameter("numcre"));
		int numdeb = Integer.parseInt(request.getParameter("numdeb"));
		debiteur.setId(numdeb);
		crediteur.setId(numcre);
		double montant = Double.parseDouble(request.getParameter("montant"));
		

		ConseillerService conseillerService = new ConseillerService();

		RequestDispatcher dispatcher = null;

		conseillerService.faireVirement(debiteur, crediteur, montant);

		dispatcher.forward(request, response);

	}
}
