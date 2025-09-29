package beecrowd.iniciante.consumo.domain;
import java.text.DecimalFormat;

public class Consumo{
	public DecimalFormat df = new DecimalFormat("#.###");
	private double distancia;
	private double litrosGasolina;
	
	public void init(double distancia, double litrosGasolina){
		this.distancia = distancia;
		this.litrosGasolina = litrosGasolina;
		ConsumoTotal(distancia, litrosGasolina);
	}

	public void ConsumoTotal(double distancia, double litrosGasolina){
		double consumo = distancia/litrosGasolina;
		String consumoFormatado = df.format(consumo);
		System.out.println( consumoFormatado + " km/l");
	}

	public void setDistancia(){
		this.distancia = distancia;
	}

	public double getDistancia(){
		return distancia;
	}

	public void setLitrosGasolina(){
		this.litrosGasolina = litrosGasolina;
	}

	public double getLitrosGasolina(){
		return litrosGasolina;
	}
}
