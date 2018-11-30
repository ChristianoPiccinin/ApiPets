package br.com.univille.petsapi.model;

public class Pets {
	
	private int id;
	private String nome;
	private String especie;
	private String sexo;
	
	public Pets() {}
	
	public Pets(int id, String nome, String especie, String sexo) {
		this.id = id;
		this.nome = nome;
		this.especie = especie;
		this.sexo = sexo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pets [id=" + id + ", nome=" + nome + ", especie=" + especie + ", sexo=" + sexo + "]";
	}
	
	
}

