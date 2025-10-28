package javacore.modificadorestatico.domain;

public class Anime{
	private String nome;
	private static int[] episodios;
	
	// Blocos de inicialização staticos são executados apenas umas vezquando a classe é carregada
	static {
		System.out.println("Dentro do bloco de inicialização");
		episodios = new int[100];
		for(int i = 0; i < episodios.length; i++){
			episodios[i] = i+1;
			System.out.print(episodios[i] + " " );
		}
	}

	public Anime(String nome){
		this.nome = nome;
	}

	public Anime(){

	}

	public String getNome(){
		return nome;
	}
}
