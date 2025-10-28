package beecrowd.iniciante.consumo.test;
import beecrowd.iniciante.consumo.domain.Consumo;

public class ConsumoTest{
	public static void main(String[] args){
		Consumo consumo = new Consumo();
		consumo.init(500.0, 35.0);
	}
}
