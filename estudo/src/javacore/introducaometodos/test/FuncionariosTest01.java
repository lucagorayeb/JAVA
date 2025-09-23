package javacore.introducaometodos.test;

import javacore.introducaometodos.domain.Funcionarios;

public class FuncionariosTest01{
	public static void main(String... args){
		
		Funcionarios funcionario = new Funcionarios();

		funcionario.nome = "Luca";
		funcionario.idade = 23;
		float salario1 = funcionario.salario = 40850.82F;
		funcionario.imprimirDados();

		funcionario.nome = "José";
                funcionario.idade = 50;
                float salario2 = funcionario.salario = 70230.12F;
                funcionario.imprimirDados();

		funcionario.nome = "Maria";
                funcionario.idade = 45;
		float salario3 = funcionario.salario = 60630.65F;

                funcionario.imprimirDados();

		float mediaSalarial = funcionario.mediaSalarios(salario1, salario2, salario3);
		
		System.out.println(mediaSalarial);
	}
}
