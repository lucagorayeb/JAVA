package beecrowd.iniciante.area.domain;

public class Area{
	final static double pi = 3.14159;

	public double calculaAreaTriangulo(double base, double altura){
		return (base * altura)/2;
	}

	public double calculaAreaCirculo(double raio){
		return pi * (raio * raio);
	}

	public double calculaAreaTrapezio(double baseMenor, double baseMaior, double altura){
		return ((baseMenor + baseMaior) * altura)/2;
	}

	public double calculaAreaQuadrado(double lado){
		return lado * lado;
	}

	public double calculaAreaRetangulo(double base, double altura){
		return base * altura;
	}

}
