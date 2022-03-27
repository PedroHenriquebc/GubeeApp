package model;

public class Tecnologia {
	private Integer id;
	private String nome;
	
	public Tecnologia(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public Tecnologia() {
		
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
