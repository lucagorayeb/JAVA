package javacore.introducaoclasses.test;

import javacore.introducaoclasses.domain.Carro;

public class CarroTest01{
	public static void main(String[] args){
		Carro carro = new Carro();
		Carro carro2 = new Carro();

		carro.nome = "Fusca";
		carro.modelo = "1600S";
		carro.ano = 1990;

		System.out.print("Meu carro é um " + carro.nome);
		System.out.print(", modelo " + carro.modelo);
		System.out.println(", ano " + carro.ano);

		carro2.nome = "Ranger";
                carro2.modelo = "XL";
                carro2.ano = 2010;

                System.out.print("Meu carro é uma " + carro2.nome);
                System.out.print(", modelo " + carro2.modelo);
                System.out.println(", ano " + carro2.ano);
	}
}
