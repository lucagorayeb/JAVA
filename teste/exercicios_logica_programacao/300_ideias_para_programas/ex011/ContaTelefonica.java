import java.util.Scanner;

public class ContaTelefonica{
	public static double valor_conta_telefonica(float assinatura, float interurbano, int impulsos, int ligacoes){
		double valor_total_conta = assinatura + interurbano + valor_impulsos(impulsos) + valor_ligacoes(ligacoes);
		return valor_total_conta;
	}

	public static double valor_impulsos(int impulsos){
		double valor_impulso = impulsos * 0.04;
		return valor_impulso;
	}

	public static double valor_ligacoes(int ligacoes){
		double valor_ligacoes = ligacoes * 0.2;
		return valor_ligacoes;
	}

	public static void main(String[] args){
		// Importa a classe a scanner que faz a entradas de dados 
		Scanner scanner = new Scanner (System.in);

		System.out.print("Qual o valor da assinatura? ");
		float assinatura = scanner.nextFloat();

		System.out.print("Qual o valor do interurbano? ");
		float interurbano = scanner.nextFloat();
		   
		System.out.print("Quantos impulsos foram feitos?  ");
		int impulsos = scanner.nextInt();

		System.out.print("Quantas ligaçoes foram feitas? ");
		int ligacoes = scanner.nextInt();

		System.out.println("O valor da sua conta telefônica é " + String.format("%.2f",valor_conta_telefonica(assinatura, interurbano, impulsos, ligacoes)));
	}
}

