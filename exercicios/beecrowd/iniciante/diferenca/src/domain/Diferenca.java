package lib;

public class Diferenca{
	private int numero1;
	private int numero2;
	private int numero3;
	private int numero4;

	public void init(int numero1, int numero2, int numero3, int numero4){
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.numero3 = numero3;
		this.numero4 = numero4;
		calculaDiferenca(numero1,numero2,numero3,numero4);

	}
	
	public int multiplicaDoisPrimeirosNumeros(int numero1, int numero2){
		int produto = numero1 * numero2;
		return produto;
	}

	public int multiplicaDoisUltimosNumeros(int numero3, int numero4){
		int produto = numero3 * numero4;
		return produto;
	}

	public void calculaDiferenca(int numero1, int numero2, int numero3, int numero4){
		int produtoDosPrimeiros = multiplicaDoisPrimeirosNumeros(numero1, numero2);
		
		int produtoDosUltimos = multiplicaDoisUltimosNumeros(numero3, numero4);
		
		int diferenca = produtoDosPrimeiros - produtoDosUltimos;

		System.out.println("DIFERENCA = " + diferenca);
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

        public void setNumero3(int numero3){
                this.numero3 = numero3;
        }

        public int getNumero3(){
                return numero3;
        }

        public void setNumero4(int numero4){
                this.numero4 = numero4;
        }

        public int getNumero4(){
                return numero4;
        }

}
