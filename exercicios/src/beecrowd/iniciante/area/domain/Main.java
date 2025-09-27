package beecrowd.iniciante.area.domain;
import beecrowd.iniciante.area.domain.Area;

public class Main{
        private double A;
        private double B;
        private double C;
	public Area area = new Area();

	public void init(double A, double B, double C){
		this.A = A;
		this.B = B;
		this.C = C;
		exibirArea(A,B,C);
	}
	
	public void exibirArea(double A, double B, double C){
		System.out.println("TRIANGULO: " + area.calculaAreaTriangulo(A,C));
		System.out.println("CIRCULO: " + area.calculaAreaCirculo(C));
		System.out.println("TRAPEZIO: " + area.calculaAreaTrapezio(A,B,C));
		System.out.println("QUADRADO: " + area.calculaAreaQuadrado(B));
		System.out.println("RETANGULO: " + area.calculaAreaRetangulo(A,B));
	}
        public void setA(double A ){
                this.A = A ;
        }

        public double get(){
                return A;
        }

        public void setB(double B ){
                this.B = B;
        }

        public double getB(){
                return B ;
        }

	        public void setC(double C){
                this.C = C;
        }

        public double getC(){
                return C;
	}
}
