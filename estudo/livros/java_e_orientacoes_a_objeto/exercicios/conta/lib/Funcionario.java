public class Funcionario{
	String nome;
	String departamento;
	double salario;
	Data dataDeEntrada = new Data;
	String rg;
	
	public void recebeAumento(double aumento){
		this.salario = salario * (aumento/100);
		System.out.println(salario);
	}

	public double calculaGanhoAnual(){
		System.out.println(this.salario * 12);
	}

	public void mostra(){
		System.out.println("Nome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario: " + this.salario);
		System.out.println("Data de Entrada: " + dataDeEntrada.mostra());
		System.out.println("RG: " + this.rg);
	}
}
