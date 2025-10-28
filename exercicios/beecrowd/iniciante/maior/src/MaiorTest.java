package beecrowd.iniciante.maior.test;

import beecrowd.iniciante.maior.domain.Maior;

public class MaiorTest{
	public static void main(String[] args){
		Maior maior = new Maior();
		double valor1 = 106;
		double valor2 = 7;
		double valor3 = 14;

		maior.init(valor1, valor2, valor3);
	}
}
