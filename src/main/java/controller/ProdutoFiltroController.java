package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProdutoDao;
import model.Produto;

@WebServlet(name = "FiltroProdutos", urlPatterns = { "/ProdutoFiltroController" })
public class ProdutoFiltroController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String filtrar = "/filtroProduto.jsp";
	private static String listaFiltrada = "/listaFiltrada.jsp";
	private ProdutoDao produtoDao = new ProdutoDao();

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward = "";
		String action = request.getParameter("action");
		
		if (action.equals("filter")) {
			forward = filtrar;
		}	
		RequestDispatcher rd = request.getRequestDispatcher(forward);
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Produto> listaProdutos = new ArrayList<>();
		listaProdutos.addAll(produtoDao.listaProdutosByMercado(request.getParameter("mercado1"), request.getParameter("mercado2"), request.getParameter("mercado3")));
		listaProdutos.addAll(produtoDao.listaProdutosByTech(request.getParameter("tech1"), request.getParameter("tech2"), request.getParameter("tech3"), request.getParameter("tech4"), 
													        request.getParameter("tech5"), request.getParameter("tech6"), request.getParameter("tech7"), request.getParameter("tech8")));
		RequestDispatcher rd = request.getRequestDispatcher(listaFiltrada);
        request.setAttribute("produtos", listaProdutos);
        rd.forward(request, response);
	}
}
