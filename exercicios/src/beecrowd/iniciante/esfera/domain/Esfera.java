package beecrowd.iniciante.esfera.domain;

public class Esfera{
	private double raio;
	final static double pi = 3.14159;
	
	public void init(double raio){
		this.raio = raio;
		calculaVolumeEsfera(raio,pi);	
	}

	public void calculaVolumeEsfera(double raio, double pi){
		double volumeEsfera = (4.0/3) * pi * (raio*raio*raio);
		System.out.println("VOLUME = " + volumeEsfera);
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
