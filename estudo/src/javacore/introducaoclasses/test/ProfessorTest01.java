package javacore.introducaoclasses.test;
import javacore.introducaoclasses.domain.Professor;

public class ProfessorTest01{
	public static void main(String[] args){
		Professor professor = new Professor();

		professor.nome = "Maria";
		professor.idade = 41;
		professor.sexo = 'F';

		System.out.print("Nome: " + professor.nome);
		System.out.print(" Idade: " + professor.idade);
		System.out.println(" Sexo: " + professor.sexo);
	}
}
