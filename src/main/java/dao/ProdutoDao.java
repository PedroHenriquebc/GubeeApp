package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import conexao.Conexao;
import model.Produto;

public class ProdutoDao {

	private Connection con;

	public ProdutoDao() {
		con = Conexao.Conectar();
	}

	// POST
	public void inserirProduto(Produto produto) {
		String inserir = "INSERT INTO Produto(Nome, Descricao, Mercado_id, Tecnologia_id) VALUES (?,?,?,?)";

		try {
			PreparedStatement pst = con.prepareStatement(inserir);
			pst.setString(1, produto.getNome());
			pst.setString(2, produto.getDescricao());
			pst.setInt(3, produto.getMercado_id());
			pst.setInt(4, produto.getTecnologia_id());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// DELETE
	public void deletarProduto(int id) {
		String deletar = "DELETE FROM Produto WHERE Id = ?";
		try {
			PreparedStatement pst = con.prepareStatement(deletar);
			pst.setInt(1, id);
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// PUT
	public void alterarProduto(Produto produto) {
		String alterar = "UPDATE Produto SET Nome = ?, Descricao = ? WHERE Id = ?";
		try {
			PreparedStatement pst = con.prepareStatement(alterar);
			pst.setString(1, produto.getNome());
			pst.setString(2, produto.getDescricao());
			pst.setInt(3, produto.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// GET ALL
	public ArrayList<Produto> listaProdutos() {
		ArrayList<Produto> listaProdutos = new ArrayList<>();
		String produtos = "SELECT * FROM Produto ORDER BY Id";
		try {
			PreparedStatement pst = con.prepareStatement(produtos);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Produto produto = new Produto();
				produto.setId(rs.getInt("Id"));
				produto.setNome(rs.getString("Nome"));
				produto.setDescricao(rs.getString("Descricao"));
				produto.setMercado_id(rs.getInt("Mercado_id"));
				produto.setTecnologia_id(rs.getInt("Tecnologia_id"));
				listaProdutos.add(produto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaProdutos;
	}

	// GET BY ID
	public Produto lerProdutoById(int id) {
		Produto produto = new Produto();
		String lerId = "SELECT * FROM Produto WHERE Id = ?";
		try {
			PreparedStatement pst = con.prepareStatement(lerId);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				produto.setId(rs.getInt("Id"));
				produto.setNome(rs.getString("Nome"));
				produto.setDescricao(rs.getString("Descricao"));
				produto.setMercado_id(rs.getInt("Mercado_id"));
				produto.setTecnologia_id(rs.getInt("Tecnologia_id"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return produto;
	}
	
	public ArrayList<Produto> listaProdutosByMercado(String mercado_id1, String mercado_id2, String mercado_id3) {
		ArrayList<Produto> listaProdutos = new ArrayList<>();
		
		String produtos = "SELECT * FROM Produto WHERE Mercado_id = ? or Mercado_id = ? or Mercado_id = ?";
		try {
			PreparedStatement pst = con.prepareStatement(produtos);
			pst.setString(1, mercado_id1);
			pst.setString(2, mercado_id2);
			pst.setString(3, mercado_id3);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Produto produto = new Produto();
				produto.setId(rs.getInt("Id"));
				produto.setNome(rs.getString("Nome"));
				produto.setDescricao(rs.getString("Descricao"));
				produto.setMercado_id(rs.getInt("Mercado_id"));
				produto.setTecnologia_id(rs.getInt("Tecnologia_id"));
				listaProdutos.add(produto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaProdutos;
	}
	
	public ArrayList<Produto> listaProdutosByTech(String tecnologia_id1, String tecnologia_id2, String tecnologia_id3, String tecnologia_id4,
												 String tecnologia_id5, String tecnologia_id6, String tecnologia_id7, String tecnologia_id8) {
		ArrayList<Produto> listaProdutos = new ArrayList<>();
		
		String produtos = "SELECT * FROM Produto WHERE Tecnologia_id = ? or Tecnologia_id = ? or Tecnologia_id = ? or Tecnologia_id = ? "
												 + "or Tecnologia_id = ? or Tecnologia_id = ? or Tecnologia_id = ? or Tecnologia_id = ?";
		try {
			PreparedStatement pst = con.prepareStatement(produtos);
			pst.setString(1, tecnologia_id1);
			pst.setString(2, tecnologia_id2);
			pst.setString(3, tecnologia_id3);
			pst.setString(4, tecnologia_id4);
			pst.setString(5, tecnologia_id5);
			pst.setString(6, tecnologia_id6);
			pst.setString(7, tecnologia_id7);
			pst.setString(8, tecnologia_id8);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Produto produto = new Produto();
				produto.setId(rs.getInt("Id"));
				produto.setNome(rs.getString("Nome"));
				produto.setDescricao(rs.getString("Descricao"));
				produto.setMercado_id(rs.getInt("Mercado_id"));
				produto.setTecnologia_id(rs.getInt("Tecnologia_id"));
				listaProdutos.add(produto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listaProdutos;
	}
	
}
