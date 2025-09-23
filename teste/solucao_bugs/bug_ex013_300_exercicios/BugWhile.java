import java.util.Scanner;

public class BugWhile{
	
	public static Scanner scanner = new Scanner(System.in);	
	// Verifica se o corte da viga vai ser feito ou não
        public static void verifica_se_vai_cortar_a_viga(int tamanho_da_viga){

                boolean verificador;

                do{
                        System.out.print("Vai querer cortar a sua viga de " + tamanho_da_viga + " metros?");
                        String resposta = scanner.nextLine();

                        switch(resposta){
                                case "Sim": case "sim": case "SIM":
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

	public static void main(String[] args){
		int tamanho = 5;
		verifica_se_vai_cortar_a_viga(tamanho);
	}
}
