package beecrowd.iniciante.bhaskara.domain;
import beecrowd.iniciante.bhaskara.domain.Baskara;
public class Main{
	public Baskara baskara = new Baskara();
	private double A;
	private double B;
	private double C;

	public void formulaBaskara(double A, double B, double C){
		this.A = A;
		this.B = B;
		this.C = C;
		double delta = baskara.calculaDelta(A,B,C);
		baskara.verificaValorDelta(delta,A,B);
	}

	public void setA(double A){
		this.A = A;
	}

	public double getA(){
		return A;
	}

	public void setB(double B){
		this.B = B;
	}

	public double getB(){
		return B;
	}

	public void setC(double C){
		this.C = C;
	}

	public double getC(){
		return C;
	}
}
