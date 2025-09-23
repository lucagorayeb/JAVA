import java.util.Scanner;

public class ConverteTemperatura{
	
	public static Scanner scanner = new Scanner(System.in);

  	public static void menu_de_conversao_de_temperatura(){
	
		System.out.println("    CONVERTER TEMPERATURA");
		System.out.println("[1] - Celcius para Fahrenheit");
		System.out.println("[2] - Fahrenheit para Celcius");
		System.out.println("[0] - Encerar operação");

		escolhe_a_conversao();
	}

	public static void escolhe_a_conversao(){
		System.out.println();
		System.out.print("Escolha uma opção: ");
                int opcao = scanner.nextInt();
		
		do{
			switch(opcao){
				case 1:
					System.out.println("Convertendo para a temperatura para Fahrenheit");
					menu_de_conversao_de_temperatura();
					System.out.println();
					break;
				case 2:
					System.out.println("Convertendo para a temperatura para Celcius");
					menu_de_conversao_de_temperatura();
					System.out.println();
					break;
				case 0: 
					System.out.println("Operação encerrada");
					break;

			}
		}while(opcao != 0);

	}
	
	public static void main(String[] args){
		menu_de_conversao_de_temperatura();
	}
}
