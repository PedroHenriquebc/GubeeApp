package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import conexao.Conexao;
import model.Mercado;

public class MercadoDao {

	private Connection con;
	
	public MercadoDao() {
		con = Conexao.Conectar();
	}
	
	public Mercado lerMercadoById(int id) {
		Mercado mercado = new Mercado();
		String lerId = "SELECT * FROM Mercado WHERE Id = ?";
		try {
			PreparedStatement pst = con.prepareStatement(lerId);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				mercado.setId(rs.getInt("Id"));
				mercado.setNome(rs.getString("Nome"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mercado;
	}
	
}
