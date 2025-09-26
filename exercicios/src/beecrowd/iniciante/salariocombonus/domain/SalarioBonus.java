package beecrowd.iniciante.salariocombonus.domain;
import java.text.DecimalFormat;

public class SalarioBonus{
	public DecimalFormat formato = new DecimalFormat("#.##");
	private String nome;
	private double salario;
	private double valorVendas;


	public void init(String nome, double valorVendas, double salario){
		this.nome = nome;
		this.salario = salario;
		this.valorVendas = valorVendas;
		calculaSalarioTotal(salario, valorVendas);
	}

	public double calculaBonus(double valorVendas){
		double bonus = valorVendas * 0.15;
		return bonus;
	}

	public void calculaSalarioTotal(double salario, double valorVendas){
		double bonus = calculaBonus(valorVendas);
		double salarioTotal = salario + bonus;
		String salarioTotalFormatado = formato.format(salarioTotal);
		System.out.println("TOTAL = R$ " + salarioTotalFormatado);
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return nome;
	}

	public void setSalario(double salario){
		this.salario = salario;
	}

	public double getSalario(){
		return salario;
	}

	public void setValorVendas(double valorVendas){
		this.valorVendas = valorVendas;
	}

	public double getValorVendas(){
		return valorVendas;
	}
}
