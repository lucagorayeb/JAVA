package javacore.associacao.test;
import javacore.associacao.domain.Professor;
import javacore.associacao.domain.Escola;

public class EscolaTest01{
	public static void main(String[] args){
		Professor professor = new Professor("Roberto");
		Professor[] professores = {professor};
		Escola escola = new Escola("Classe A", professores);

		escola.imprime();
	}
}
