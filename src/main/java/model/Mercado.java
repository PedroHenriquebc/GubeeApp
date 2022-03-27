package model;

public class Mercado {
	
	private Integer id;
	private String nome;
	
	public Mercado(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Mercado() {
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
