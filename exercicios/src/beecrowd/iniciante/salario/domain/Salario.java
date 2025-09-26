package beecrowd.iniciante.salario.domain;

public class Salario{
	private int numeroFuncionario;
	private int horasTrabalhadas;
	private double valorHora;

	public void init(int numeroFuncionario, int horasTrabalhadas, double valorHora){
		this.numeroFuncionario = numeroFuncionario;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;

		calculaSalario(horasTrabalhadas, valorHora);
	}

	public void calculaSalario(int horasTrabalhadas, double valorHora){
		double salario = (double) horasTrabalhadas * valorHora;
		System.out.println("NUMBER = " + getNumeroFuncionario());
		System.out.println("SALARIO = U$ " + salario);
	}
	
	public void setNumeroFuncionario(int numeroFuncionario){
		this.numeroFuncionario = numeroFuncionario;
	}

	public int getNumeroFuncionario(){
		return numeroFuncionario;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas){
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public int getHorasTrabalhadas(){
		return horasTrabalhadas;
	}

	public void setValorHora(double valorHora){
		this.valorHora = valorHora;
	}

	public double getValorHora(){
		return valorHora;
	}
}
