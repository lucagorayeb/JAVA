package beecrowd.iniciante.distancia.domain;

public class Distancia{
	private double distancia;
	
	public void init(double distancia){
		this.distancia = distancia;
		calculaTempo(distancia);
	}

	public void calculaTempo(double distancia){
		double tempo = distancia * 2;
		System.out.println(tempo + " minutos");
	}

	public void setDistancia(double distancia){
		this.distancia = distancia;
	}

	public double getDistancia(){
		return distancia;
	}
}
