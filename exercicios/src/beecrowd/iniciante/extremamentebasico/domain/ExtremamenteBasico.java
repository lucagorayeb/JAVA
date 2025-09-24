package beecrowd.iniciante.extremamentebasico.domain;
public class ExtremamenteBasico{
	private int numero1;
	private int numero2;

	public void init(int numero1, int numero2){
		this.numero1 = numero1;
		this.numero2 = numero2;
		mostrarNumeros(numero1, numero2);
		calcular(numero1,numero2);
	}

	public void mostrarNumeros(int numero1, int numero2){
		System.out.println(numero1);
		System.out.println(numero2);
	}

	public void calcular(int numero1, int numero2){
		int soma = numero1 + numero2;
		System.out.println("X = " + soma);
	}

	public void setNumero1(int numero1){
		this.numero1 = numero1;
	}

	public int getNumero1(){
		return numero1;
	}

	public void setNumero2(int numero2){
		this.numero2 = numero2;
	}

	public int getNumero2(){
		return numero2;
	}
}
