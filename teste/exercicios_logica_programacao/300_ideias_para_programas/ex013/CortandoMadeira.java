import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class CortandoMadeira{
	
	// Função que mostra para o usuário quais as opções de viga disponiveis
	public static void menu(){
		System.out.println("----------------------------------------");
		System.out.println("|     TAMANHOS DAS VIGAS DE MADEIRA    |");
                System.out.println("|        [1] - Viga de 3 metros        |");
                System.out.println("|        [2] - Viga de 4 metros        |");
		System.out.println("|        [3] - Viga de 5 metros        |");
		System.out.println("----------------------------------------");
	}
	
	// Função que pede para o usuário escolher qual o tamanho de viga ele vai querer
	public static int seleciona_uma_opcao(){
		
		Scanner scanner = new Scanner(System.in);	
		boolean verificador;
		int tamanho_da_viga = 0;

		do{
			System.out.print("Escolha uma opção: ");
			int opcao = scanner.nextInt();
			
			switch(opcao){
				case 1: 
					System.out.println("Você selecionou a vida de 3 metros");
					tamanho_da_viga = 3;
					verificador = true;
					break;
				case 2: 
					System.out.println("Você selecionou a vida de 4 metros");
                                        tamanho_da_viga = 4;
                                        verificador = true;
					break;
				case 3:
					System.out.println("Você selecionou a vida de 5 metros");
                                        tamanho_da_viga = 5;
                                        verificador = true;
					break;
				default:
					System.out.println("Essa opção não válida. Tente novamente!");
					System.out.println();
					menu();
					verificador = false;
					break;
			}
		}while(verificador == false);	
		
		return tamanho_da_viga;
	}
	
	
	// Verifica se o corte da viga vai ser feito ou não
	public static void verifica_se_vai_cortar_a_viga(int tamanho_da_viga){
		
		boolean verificador;
		Scanner scanner = new Scanner(System.in);	
		do{
			System.out.print("Vai querer cortar a sua viga de " + tamanho_da_viga + " metros? ");
                	String resposta = scanner.nextLine();
			
			switch(resposta){
				case "Sim": case "sim": case "SIM":
					especificacoes_de_como_cortar_viga(tamanho_da_viga);	
					verificador = true;
					break;

				case "Não": case "NÃO": case "não": case "nao": case "Nao": case "NAO":
					System.out.println("Obrigado por comprar conosco. Aqui está a sua viga de madeira de " + tamanho_da_viga + " metros");
					verificador = true;
					break;
				default:
					System.out.println("Essa opção não válida. Tente novamente!");
					System.out.println();
					verificador = false;
					break;
					
			}
		}while(verificador == false);
	}
	
	// Apenas um menu mostrando as opções que tem para fazer o corte com a viga
	public static void menu_pedacos_madeira(){
		System.out.println("----------------------------------------");
		System.out.println("|     *--------------------------*     |"); 
		System.out.println("|     | CORTE DA VIGA DE MADEIRA |     |");
		System.out.println("|     *--------------------------*     |");
		System.out.println("|  [Informe a quantidade de pedaços]   |");
		System.out.println("|  [Informe o tamanho dos pedaços  ]   |");
		System.out.println("|                                      |");
		System.out.println("|     *--------------------------*     |");
		System.out.println("|     |      MEDIDAS ACEITAS     |     |");
		System.out.println("|     *--------------------------*     |");
		System.out.println("|   [             Metro            ]   |");
		System.out.println("|   [           Decímetro          ]   |");
		System.out.println("|   [           Centímetro         ]   |");
		System.out.println("|   [           Milímetro          ]   |");
		System.out.println("----------------------------------------");
	}

	// Função que pede as espicificações de como deve ser feito o corte das vigas de madeira
	public static void especificacoes_de_como_cortar_viga(int tamanho_da_viga){
		Scanner scanner = new Scanner(System.in);
		menu_pedacos_madeira();
		System.out.println();

		System.out.print("Quer cortar a viga em quantos pedaços? ");
		int pedacos = scanner.nextInt();

		System.out.println();
		String frase = scanner.nextLine();	
		
		System.out.print("Qual o tamanho dos pedaços? ");
                String frase2 = scanner.nextLine();

		separa_os_numeros_e_as_medidas_vetores(tamanho_da_viga, pedacos, frase2);
		
	}
	
	// Função que separa os valores de medidas e de números
	public static void separa_os_numeros_e_as_medidas_vetores(int tamanho_da_viga, int pedacos, String tamanhos){
		String[] partes = tamanhos.split(" | de | e |,");
		List<String> numeros = new ArrayList<>();
		List<String> medidas = new ArrayList<>();
		
		for(String parte : partes){
			if(parte.matches("^\\d+$")){

				numeros.add(parte);
			}else if (parte.matches(".....+")){
				medidas.add(parte);
			}
		}

		junta_os_vetores_na_ordem_correta(numeros, medidas, tamanho_da_viga, pedacos);
	}

	public static void junta_os_vetores_na_ordem_correta(List<String> numeros, List<String> medidas, int tamanho_da_viga, int pedacos){
		List<String> numeros_medidas = new ArrayList<>();
		int c = 0;
		int k = 2;
		for(String medida : medidas){
			for(int i = c; i < k; i++){
        			numeros_medidas.add(numeros.get(i));	
			}
			numeros_medidas.add(medida);
			k += 2;
			c += 2;			
		}
		verifica_qual_a_medida_e_envia_os_valores_para_o_calculo(numeros_medidas, tamanho_da_viga, pedacos);
	}

	public static void verifica_qual_a_medida_e_envia_os_valores_para_o_calculo(List<String> numeros_medidas, int tamanho_da_viga, int pedacos){
		String num1;
		String num2;

		float t1, t2;
		int p1, p2;

		for(int i = 0; i < numeros_medidas.size(); i++){
			switch(numeros_medidas.get(i)){
        			case "centimetros": case "cm": case "centimetro":
					num1 = numeros_medidas.get(i-2);
					num2 = numeros_medidas.get(i-1);
					t1 = centimetro_para_metro(num1,num2);
	   				p1 = Integer.parseInt(num1);

       				case "metros": case "m": case "metro":
					num1 = numeros_medidas.get(i-2);
                                        num2 = numeros_medidas.get(i-1);
        				t2 = metro(num1,num2);
					p2 = Integer.parseInt(num1);
        
				default:
        				continue;
        
			}
		}
		
		verifica_se_a_quantidade_de_pedacos_esta_correta(p1,p2,pedacos, tamanho_da_viga);
		verifica_se_o_tamanho_da_viga_esta_correto(t1, t2, tamanho_da_viga);		
	}
			
			
	//Função de base para os calculos eu prevejo que serão 4 pois tem que converter as unidades e são 4 unidades aceitas
	public static float centimetro_para_metro(String num1, String num2){
                float n1 = Integer.parseInt(num1);
                float n2 = Integer.parseInt(num2);
		
		float operacao = (n1*n2)/100;
		return operacao;
	}	

	public static float milimetro_para_metro(String num1, String num2){
		float n1 = Integer.parseInt(num1);
                float n2 = Integer.parseInt(num2);

		float operacao = (n1*n2)/1000;
		return operacao;
        }

	public static float decimetro_para_metro(String num1, String num2){
                float n1 = Integer.parseInt(num1);
                float n2 = Integer.parseInt(num2);
		
		float operacao = (n1*n2)/10;
		return operacao;
        }

	public static float metro(String num1, String num2){
		float n1 = Integer.parseInt(num1);
		float n2 = Integer.parseInt(num2);
		
		float operacao = (n1*n2);
		return operacao;

        }

	public static void verifica_se_a_quantidade_de_pedacos_esta_correta(int p1, int p2, int pedacos, int tamanho_da_viga){
		int soma = p1 + p2;
		
		if(soma == pedacos){
			System.out.println();
		}else{
			System.out.println("Você digitou a quantidade de pedaços errada. Tente novamente!");
			especificacoes_de_como_cortar_viga(tamanho_da_viga);
		}
	}
	

	//Função que vai verificar se o tamanho da viga está de acordo e vai informar se sobrou, se foi totalmente usada e caso seja necessário uma viga maior, o usuário vai escolher se pode trocar a viga ou refazer o corte.
	public static void verifica_se_o_tamanho_da_viga_esta_correto(float t1, float t2,int tamanho_da_viga){
		
		float soma = t1 + t2; 

		if(tamanho_da_viga == 3 && soma > 3){
			
			System.out.println("Você precisa de uma viga maior!");
			menu();
        	        verifica_se_vai_cortar_a_viga(seleciona_uma_opcao());
		
		}else if(tamanho_da_viga == 4 && soma > 4){
		
			System.out.println("Você precisa de uma viga maior!");
                        menu();
                        verifica_se_vai_cortar_a_viga(seleciona_uma_opcao());
		
		}else if(tamanho_da_viga == 5 && soma > 5){
		
			System.out.println("Você precisa de uma viga maior!");
                        System.out.println("Nós somos temos as vigas que estão no menu.");
			System.out.println();
			menu();
			System.out.println();
			menu_caso_a_viga_seja_grande_demais();
			escolher_o_que_fazer_se_a_viga_for_muito_grande();
		}else{
			System.out.println("Obrigado por cortar conosco.");
		}
	}
	
	public static void menu_caso_a_viga_seja_grande_demais(){
		System.out.println("ESCOLHA UMA OPÇÃO");
		System.out.println("[1] - Terminar o atendimento");
		System.out.println("[2] - Alterar o corte");
		
	}

	public static void escolher_o_que_fazer_se_a_viga_for_muito_grande(){
		
		Scanner scanner = new Scanner(System.in);
                boolean verificador;
		System.out.println("Escolha uma opção: ");
                int opcao = scanner.nextInt();
		
		do{
			switch(opcao){
				case 1:
					System.out.println("Obrigado pelo seu tempo. Volte sempre.");
					break;
				case 2:
					verifica_se_vai_cortar_a_viga(seleciona_uma_opcao());
					break;
				default:
				       	verificador = false;	
					break;	
			}

		}while(verificador == false);
		
	}



	public static void main(String[] args){
		menu();
		verifica_se_vai_cortar_a_viga(seleciona_uma_opcao());
	}
}
