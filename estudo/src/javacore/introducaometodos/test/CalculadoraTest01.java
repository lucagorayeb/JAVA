package javacore.introducaometodos.test;

import javacore.introducaometodos.domain.Calculadora;

public class CalculadoraTest01{
	public static void main(String[] args){
		Calculadora calculadora = new Calculadora();

		calculadora.somaDoisNumeros();
		calculadora.subtraiDoisNumeros();
		calculadora.multiplicaDoisNumeros(10, 20);
		System.out.println("Finalizando");
	}
}
