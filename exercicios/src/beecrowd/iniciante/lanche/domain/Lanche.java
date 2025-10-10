package beecrowd.iniciante.lanche.domain;

public class Lanche{
	private double totalPagar;

	public void menu(){
		System.out.println("------------------------------------------")
		System.out.println("| CÓDIGO \t|  ESPECIFICAÇÃO  |\t| PREÇO  |")
		System.out.println("------------------------------------------")
		System.out.println("|  [1]   \t|  Cachorro Quente|\t| R$4.00 |")
		System.out.println("------------------------------------------")
		System.out.println("|  [2]   \t|  X-Salada       |\t| R$4.50 |")
		System.out.println("------------------------------------------")
		System.out.println("|  [3]   \t|  X-Bacon        |\t| R$5.00 |")
		System.out.println("------------------------------------------")
		System.out.println("|  [4]   \t|  Torrada Simples|\t| R$2.00 |")
		System.out.println("------------------------------------------")
		System.out.println("|  [5]   \t|  Refrigerante  |\t|  R$1.50 |")
		System.out.println("------------------------------------------")
		System.out.println("|  [0]   \t|  Finalizar Pedido           |")
		System.out.println("------------------------------------------")
	}

	public void setTotalPagar(){
		this.totalPagar = totalPagar;
	}

	public double getTotalPagar(){
		return totalPagar;
	}
}
