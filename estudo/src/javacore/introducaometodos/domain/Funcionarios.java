package javacore.introducaometodos.domain;

public class Funcionarios{
	private String nome;
	private int idade;
	private double[] salario;
	private double media;
	
	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}

	public void setIdade(int idade){
		this.idade = idade;
	}

	public int getIdade(){
		return idade;
	}

	public void setSalarios(double[] salarios){
		this.salarios = salarios;
	}

	public double getSalarios(){
		return salarios;
	}

	public double getMedia(){
		return media;
	}
		
	public void imprimirDados(){
		System.out.println(this.nome);
		System.out.println(this.idade);
		System.out.println(this.salario);
	}

	public float mediaSalarios(float sal1, float sal2, float sal3){
		float mediaSalarios = (sal1 + sal2 + sal3)/3;

		return mediaSalarios;
	}
}
