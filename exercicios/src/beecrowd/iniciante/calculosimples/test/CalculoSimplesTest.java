package beecrowd.iniciante.calculosimples.test;
import beecrowd.iniciante.calculosimples.domain.CalculoSimples;

public class CalculoSimplesTest{
	public static void main(String[] args){
		CalculoSimples calculo = new CalculoSimples();
		int codigoPeca1 = 12;
        	int codigoPeca2 = 16;
        	int quantidadePeca1 = 1;
        	int quantidadePeca2 = 2;
        	double valorPeca1 = 5.30;
        	double valorPeca2 = 5.10;
	        
		calculo.init(codigoPeca1,codigoPeca2,quantidadePeca1,quantidadePeca2,valorPeca1,valorPeca2);
        }
}
