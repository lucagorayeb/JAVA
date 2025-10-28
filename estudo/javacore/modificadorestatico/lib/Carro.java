package javacore.modificadorestatico.domain;

public class Carro{
	private String nome;
	private double velocidadeMaxima;
	// Pelo uso do static o atributo pertence a
	// classe carro e não mais ao objeto
	// e todos os objetos vão ter o mesmo valor
	private static double velocidadeLimite = 250;

	public Carro(String nome, double velocidadeMaxima){
		this.nome = nome;
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void imprime(){
		System.out.println("----------------------");
		System.out.println("Nome: " + this.nome);
		System.out.println("Velocidade Máxima: " + this.velocidadeMaxima);
		System.out.println("Velocidade Limite: " + Carro.velocidadeLimite);
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima){
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public double getVelocidadeMaxima(){
		return velocidadeMaxima;
	}
	
	// Metodos estaticos vão existir sem a obrigatóriedade da
	// existencida de objetos pois eles pertencem a classe
	public static void setVelocidadeLimite(double velocidadeLimite){
		Carro.velocidadeLimite = velocidadeLimite;
	}

	public static double getVelocidadeLimite(){
		return velocidadeLimite;
	}
}
