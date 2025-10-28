package javacore.introducaometodos.test;

import javacore.introducaometodos.domain.Calculadora;

public class CalculadoraTest02{
	public static void main(String[] args){
		Calculadora calculadora = new Calculadora();

		int num = 20;
		int num2 = 2;

		double result = calculadora.divideDoisNumeros(num, num2);
		System.out.println(result);

		calculadora.alteraDoisNumeros(num, num2);
	}
}
