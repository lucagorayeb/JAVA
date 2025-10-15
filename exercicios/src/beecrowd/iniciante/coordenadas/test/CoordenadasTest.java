package beecrowd.iniciante.coordenadas.test;
import beecrowd.iniciante.coordenadas.domain.Coordenadas;

public class CoordenadasTest{
	public static void main(String[] args){
		Coordenadas ponto = new Coordenadas();
	
		double[] x = {0, 1, 0, 1, -1, -1, -1};
		double[] y = {0, 0, 1, 1, 1, -1, 1};
	
		for(int i = 0; i < 7; i++){
			ponto.mostrarLocalPonto(x[i], y[i]);
		}
	}
}
