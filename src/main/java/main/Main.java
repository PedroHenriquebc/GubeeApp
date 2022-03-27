package main;

import java.lang.reflect.Method;

import anotacoes.Transaction;
import dao.ProdutoDao;
import model.Produto;

public class Main {

	public static void main(String[] args) {
		ProdutoDao produtoDao = new ProdutoDao();
		
		//Criando produto com um Id de mercado alvo inexistente
		Produto produto = new Produto(15, "Produto Teste", "Descricao Produto Teste", 4, 2);
		String nomeMetodo;

		for (Method metodo : ProdutoDao.class.getDeclaredMethods()) {
			if (metodo.isAnnotationPresent(Transaction.class)) {
				nomeMetodo = metodo.getName();
				System.out.println("Iniciando execução do método '" + nomeMetodo + "'");
				produtoDao.inserirProduto(produto);
			}
		}
		
		System.out.println("------------------------------");
		
		//Criando um produto com Id de marcado alvo válido
		produto = new Produto(15, "Produto Teste", "Descricao Produto Teste", 1, 2);
		for (Method metodo : ProdutoDao.class.getDeclaredMethods()) {
			if (metodo.isAnnotationPresent(Transaction.class)) {
				nomeMetodo = metodo.getName();
				System.out.println("Iniciando execução do método '" + nomeMetodo + "'");
				produtoDao.inserirProduto(produto);
			}
		}
		
	}

}
