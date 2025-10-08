package beecrowd.iniciante.bhaskara.domain;
import java.text.DecimalFormat;

public class Baskara{
	public DecimalFormat df = new DecimalFormat("#.#####");
	
	public double calculaDelta(double A, double B, double C){
                return (B*B) -4 * A * C;
        }

	public void verificaValorDelta(double delta, double A, double B){
		if(delta < 0){
			System.out.println("Impossivel calcular");
		}else{
			double raiz = calculaRaiz(delta);
			calculaR1(raiz, A, B);
			calculaR2(raiz, A, B);
		}
	}

	public double calculaRaiz(double delta){
		return Math.sqrt(delta);
	}

	public void calculaR1(double raiz, double A, double B){
		double R1 = (-B + raiz)/(2 * A);
		System.out.println("R1 = " + df.format(R1));
	}

        public void calculaR2(double raiz, double A, double B){
                double R2 = (-B - raiz)/(2 * A);
		System.out.println("R2 = " + df.format(R2));
        }


}
