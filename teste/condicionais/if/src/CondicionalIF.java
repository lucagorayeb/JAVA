import java.util.Scanner;
public class CondicionalIF{
	public static void main(String[] args){
		Scanner leitor = new Scanner (System.in);
		System.out.print("Digite a sua idade: ");
		int idade = leitor.nextInt();

		if (idade >= 18){
			System.out.println("É maior de idade");
		}else{
			System.out.println("É menor de idade");
		}
	}
}
