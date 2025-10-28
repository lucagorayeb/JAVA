package javacore.sobrecargametodos.domain;

public class Anime{
	private String tipo;
	private int episodio;
	private String nome;
	private String genero;

	//Sobrecarga de métodos usando o metodo init
	public void init(String nome, String tipo, int episodio){
		this.nome = nome;
		this.tipo = tipo;
		this.episodio = episodio;
	}
	
	public void init(String nome, String tipo, int episodio, String genero){
	init(nome, tipo, episodio);
	this.genero = genero;
	}

	public void imprime(){
		System.out.println(this.nome);
		System.out.println(this.tipo);
		System.out.println(this.episodio);
		System.out.println(this.genero);
	}
	
	public void setGenero(String genero){
		this.genero = genero;
	}

	public String getGenero(){
		return genero;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}

	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public String getTipo(){
		return tipo;
	}

	public void setEpisodio(int episodio){
		this.episodio = episodio;
	}

	public int getEpisodio(){
		return episodio;
	}
}
