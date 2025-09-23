import java.util.Scanner;
public class CondicionalSwitch{
	public static void main(String[] args){
		Scanner leitor = new Scanner (System.in);
		System.out.println("Escolha uma música para tocar:");
		System.out.println("[1] - War Pigs (Black Sabbath)");
		System.out.println("[2] - Dream On (Aerosmith)");
		System.out.println("[3] - Black Summer (RHCP)");
		System.out.print("\nEscolha uma opção: ");
		int numero_musica = leitor.nextInt();

		switch (numero_musica){
			case 1:
				System.out.println("Tocando War Pigs de Black Sabbath");
				break;
			case 2: 
				System.out.println("Tocando Dream On de Aerosmith");
				break;
			case 3:
				System.out.println("Tocando Black summer de Red Hot Chili Peppers");
				break;
			default:
				System.out.println("Não existe está opção");

		}
	}
}
