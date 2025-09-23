package beecrowd.produtosimples.test;
import beecrowd.produtosimples.domain.ProdutoSimples;

public class ProdutoSimplesTest{
	public static void main(String[] args){
		ProdutoSimples produto = new ProdutoSimples();

		int numero1 = 3;
		int numero2 = 9;

		produto.init(numero1, numero2);
	}
}
