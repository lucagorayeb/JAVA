package beecrowd.produtosimples.domain;

public class ProdutoSimples{
	private int numero1;
	private int numero2;
	
	public void init(int numero1, int numero2){
		this.numero1 = numero1;
		this.numero2 = numero2;
		calcularProduto(numero1, numero2);	
	}

	public void calcularProduto(int numero1, int numero2){
		int produto = numero1 * numero2;
		System.out.println("PROD = " + produto);	
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
