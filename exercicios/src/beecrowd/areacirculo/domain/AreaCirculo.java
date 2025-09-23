package beecrowd.areacirculo.domain;

public class AreaCirculo{
	private double raio;
	private static final double pi = 3.14159;
	
	public void init(double raio){
		this.raio = raio;
		calcularAreaCirculo(raio);	
	}

	public void calcularAreaCirculo(double raio){
		double area = pi * (raio*raio);
		System.out.println("A=" + area);
	}

	public void setRaio(double raio){
		this.raio = raio;
	}

	public double getRaio(){
		return raio;
	}

	public double getPi(){
		return pi;
	}
}
