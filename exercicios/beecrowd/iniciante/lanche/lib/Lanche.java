package beecrowd.iniciante.lanche.domain;
import java.util.Scanner;

public class Lanche{
	private double totalPagar;
	Menu menu = new Menu();
	Scanner scanner = new Scanner(System.in);	

	public void mostrarTotalPagar(){
		double valor = calculaValorDoPedido();
		System.out.println("Total: R$ " + valor);
	}

	public double calculaValorDoPedido(){
		menu.menu();
		System.out.print("Faça seu pedido: ");
		int numPedido = scanner.nextInt();
		while(numPedido != 0){
			switch(numPedido){
				case 1: 
					totalPagar += 4.00;
					break;
				case 2: 
                                        totalPagar += 4.50;
                                        break;
				case 3: 
                                        totalPagar += 5.00;
                                        break;
				case 4:
                                        totalPagar += 2.00;
                                        break;
				case 5:
                                        totalPagar += 1.50;
                                        break;
				case 9:
					menu.menu();
					break;
				default: 
					System.out.print("Não existe essa opção");
					break;
			}
			if(numPedido != 0 ){
				System.out.print("Adicionar algo main? ");
				numPedido = scanner.nextInt();
			}
			
		}
		return totalPagar;
	}
		
	public double getTotalPagar(){
		return totalPagar;
	}

}
