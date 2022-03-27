package dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Test;

import model.Produto;


public class ProdutoDaoTest {
	ProdutoDao produtoDao = new ProdutoDao();
	
	@Test
	public void inserirProdutoTest() {
		Produto produto = new Produto(20, "Produto Teste20", "Descricao Produto Teste20", 1, 2);
		produtoDao.inserirProdutoTest(produto);
		Produto produtoAux = produtoDao.lerProdutoById(20);
		int id = produtoAux.getId();
		assertNotNull(produtoAux);
		assertEquals(20, id);
	}
	
	@Test
	public void deletarProdutoTest() {
		Produto produto = new Produto(21, "Produto Teste21", "Descricao Produto Teste21", 1, 2);
		produtoDao.inserirProduto(produto);
		produtoDao.deletarProduto(21);
		Produto produtoAux = produtoDao.lerProdutoById(21);
		assertEquals(produtoAux.getId(), null);
	}
	
	@Test
	public void listaProdutosTest() {
		Produto produto = new Produto(22, "Produto Teste22", "Descricao Produto Teste22", 1, 2);
		produtoDao.inserirProduto(produto);
		ArrayList<Produto> listaProduto = produtoDao.listaProdutos();
		for(Produto p : listaProduto) {
			if(p.getId() == produto.getId()) {
				assertEquals(p.getId(), produto.getId());
			}
		}
	}
	
	@Test
	public void lerProdutoByIdTest() {
		Produto produto = new Produto(22, "Produto Teste22", "Descricao Produto Teste22", 1, 2);
		int id = produto.getId();
		produtoDao.inserirProdutoTest(produto);
		int idAux = produtoDao.lerProdutoById(id).getId();
		assertEquals(idAux, id);
		
	}
	
	@Test
	public void listaProdutosByMercadoTest() {
		String mercado_id1 = "1";
		ArrayList<Produto> listaProduto = produtoDao.listaProdutosByMercado(mercado_id1, null, null);
		for(Produto p : listaProduto) {
			int mercado_idAux = p.getMercado_id();
			assertEquals(mercado_idAux, Integer.parseInt(mercado_id1));
		}
	}
	
	@Test
	public void listaProdutosByTechTest() {
		String tecnologia_id1 = "1";
		ArrayList<Produto> listaProduto = produtoDao.listaProdutosByTech(tecnologia_id1, null, null, null, null, null, null, null);
		for(Produto p : listaProduto) {
			int tecnologia_idAux = p.getTecnologia_id();
			assertEquals(tecnologia_idAux, Integer.parseInt(tecnologia_id1));
		}
	}
}
