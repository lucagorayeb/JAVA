package javacore.introducaometodos.test;

import javacore.introducaometodos.domain.Pessoa;

public class PessoaTest01{

	public static void main(String[] args){
		Pessoa pessoa = new Pessoa();

        	pessoa.setNome("Luca");
		pessoa.setIdade(20);
        	pessoa.imprime();
	}
}
