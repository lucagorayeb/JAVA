package beecrowd.iniciante.maior.domain;

public class Maior{
	private double valor1;
	private double valor2;
	private double valor3;
	private double maior;

	public void init(double valor1, double valor2, double valor3){
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
		mostraMaior(valor1,valor2,valor3);
	}

	public void mostraMaior(double valor1, double valor2, double valor3){
		this.maior = verificaOMaior(valor1,valor2,valor3);
		System.out.println(maior + " é o maior");
	}

	public double verificaOMaior(double valor1, double valor2, double valor3){
		if (valor1 > valor2){
			if(valor1 > valor3){
				return valor1;
			}else{
				return valor3;
			}
		}else if (valor2 > valor1){
			if(valor2 > valor3){
				return valor2;
			}else{
				return valor3;
			}
		}else{
			return valor3;
		}
	}
	
	public void setValor1(double valor1){
		this.valor1 = valor1;
	}

	public double getValor1(){
		return valor1;
	}

	public void setValor2(double valor2){
		this.valor2 = valor2;
	}

	public double getValor2(){
		return valor2;
	}

	public void setValor3(double valor3){
		this.valor3 = valor3;
	}

	public double getValor3(){
		return valor3;
	}

	public double getMaior(){
		return maior;
	}
}
