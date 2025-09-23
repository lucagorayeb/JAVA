import java.util.Scanner;

public class MediaEscolar{
	
	public static Scanner scanner = new Scanner(System.in);

	public static float calcular_media(float nota1, float nota2){
		float media = (nota1 + nota2)/2;
		return media;
	}

	public static float pergunta_notas_do_aluno(){
		System.out.print("Qual a nota da primeira prova? ");
		float nota1 = scanner.nextFloat();

		System.out.print("Qual a nota da segunda prova? ");
		float nota2 = scanner.nextFloat();

		return calcular_media(nota1, nota2);
	}

	public static void verifica_se_o_aluno_foi_aprovado(float media){
		System.out.println("A sua média final foi " + media);
		
		if(media >= 7){

			System.out.println("Você foi aprovado");

		}else if(media >= 4 && media < 7){

			System.out.println("Você está de final");

		}else{
			System.out.println("Você foi reprovado");
		}
	}

	public static void funcao_que_chama_as_outras_funcoes(){
		verifica_se_o_aluno_foi_aprovado(pergunta_notas_do_aluno());
	}

	public static void main(String[] args){
		funcao_que_chama_as_outras_funcoes();
	}
}

