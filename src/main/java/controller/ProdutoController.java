package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ProdutoDao;
import model.Produto;

@WebServlet(name = "Produtos", urlPatterns = { "/ProdutoController" })
public class ProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ProdutoDao produtoDao = new ProdutoDao();
	private static String listaProdutos = "/listaProdutos.jsp";
	private static String editar = "/editarProduto.jsp";
	private static String inserir = "/inserirProduto.jsp";
	

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String forward = "";
		String action = request.getParameter("action");

		if (action.equals("listaProdutos")) {
			forward = listaProdutos;
			request.setAttribute("produtos", produtoDao.listaProdutos());
		} else if (action.equals("delete")) {
			int id = Integer.parseInt(request.getParameter("id"));
			produtoDao.deletarProduto(id);
			forward = listaProdutos;
			request.setAttribute("produtos", produtoDao.listaProdutos());
		} else if (action.equals("edit")) {
			forward = editar;
			int id = Integer.parseInt(request.getParameter("id"));
			Produto produto = produtoDao.lerProdutoById(id);
			request.setAttribute("produto", produto);
		} else if (action.equals("insert")) {
			forward = inserir;
		} 
		
		RequestDispatcher rd = request.getRequestDispatcher(forward);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Produto produto = new Produto();
		produto.setNome(request.getParameter("nome"));
		produto.setDescricao(request.getParameter("descricao"));
		produto.setMercado_id(Integer.parseInt(request.getParameter("mercado_id")));
		produto.setTecnologia_id(Integer.parseInt(request.getParameter("tecnologia_id")));
		String id = request.getParameter("id");
		if(id == null || id.isEmpty()) {
			produtoDao.inserirProduto(produto);
		} else {
			produto.setId(Integer.parseInt(id));
			produtoDao.alterarProduto(produto);
		}
		RequestDispatcher rd = request.getRequestDispatcher(listaProdutos);
        request.setAttribute("produtos", produtoDao.listaProdutos());
        rd.forward(request, response);
    }
	
}
