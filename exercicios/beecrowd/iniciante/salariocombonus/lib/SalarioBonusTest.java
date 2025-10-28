package beecrowd.iniciante.salariocombonus.test;
import beecrowd.iniciante.salariocombonus.domain.SalarioBonus;

public class SalarioBonusTest{
	public static void main(String[] args){
		SalarioBonus salarioBonus = new SalarioBonus();

		String nome = "JOAO";
		double salario = 500.00;
		double valorVendas = 1230.30;

		salarioBonus.init(nome, valorVendas, salario);
	}
}
