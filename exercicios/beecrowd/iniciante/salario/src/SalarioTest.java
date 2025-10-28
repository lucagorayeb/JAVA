package beecrowd.iniciante.salario.test;
import  beecrowd.iniciante.salario.domain.Salario;

public class SalarioTest{
	public static void main(String[] args){
		Salario salario = new Salario();
		
		int numeroFuncionario = 25;
		int horasTrabalhadas = 100;
		double valorHora = 5.50;
		salario.init(numeroFuncionario, horasTrabalhadas, valorHora);
	}
}
