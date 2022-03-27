package model;

public class Produto {
	
	private Integer id;
	private String nome;
	private String descricao;
	private Integer mercado_id;
	private Integer tecnologia_id;
	
	public Produto(Integer id,String nome, String descricao, Integer mercado_id, Integer tecnologia_id) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.mercado_id = mercado_id;
		this.tecnologia_id = tecnologia_id;
	}
	
	public Produto(String nome, String descricao, Integer mercado_id, Integer tecnologia_id) {
		this.nome = nome;
		this.descricao = descricao;
		this.mercado_id = mercado_id;
		this.tecnologia_id = tecnologia_id;
	}

	public Produto() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String name) {
		this.nome = name;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getMercado_id() {
		return mercado_id;
	}

	public void setMercado_id(Integer mercado_id) {
		this.mercado_id = mercado_id;
	}

	public Integer getTecnologia_id() {
		return tecnologia_id;
	}

	public void setTecnologia_id(Integer tecnologia_id) {
		this.tecnologia_id = tecnologia_id;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
}
