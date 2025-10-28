package javacore.introducaometodos.test;
import javacore.introducaometodos.domain.Estudante;
import javacore.introducaometodos.domain.ImpressoraEstudante;


public class EstudanteTest01{
	public static void main(String[] args){
		Estudante estudante01 = new Estudante();
		Estudante estudante02 = new Estudante();
		ImpressoraEstudante imprimeEstudante = new ImpressoraEstudante();

		estudante01.nome = "Luca";
		estudante01.idade = 20;
		estudante01.sexo = 'M';
		
		estudante02.nome = "Larissa";
                estudante02.idade = 20;
                estudante02.sexo = 'F';

		imprimeEstudante.imprime(estudante01);
		imprimeEstudante.imprime(estudante02);

	}
}
