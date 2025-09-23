import java.util.Scanner;

public class TempoLivre{

	public static int dividir_string(String frase, int materias){
		int hora = 0;
		int minuto = 0;

		String[] partes = frase.split(" ");

		for (String parte : partes){
                        if(parte == partes[0] || parte == partes[3]){
                                if(parte.length() == 1){
                                        hora = Integer.parseInt(parte);
                                }else{
                                        minuto = Integer.parseInt(parte);
                                }
                        }
                }
		//System.out.println(hora + " " + minuto);
		return calcular_tempo_de_estudo(hora, minuto, materias);
	}

	public static int calcular_tempo_de_estudo(int hora, int minuto, int materias){
		int hora_em_minuto = hora * 60;
		int tempo_total = hora_em_minuto + minuto;
		int tempo_para_cada_materia = tempo_total / materias;

		return tempo_para_cada_materia;
	}

	public static String verificar_se_eh_hora_ou_minuto(int tempo_de_estudo){
		if(tempo_de_estudo > 60){
			return " horas.";
		}else if(tempo_de_estudo == 60){
			return " hora.";
		}else{
			return " minutos.";
		}
	}

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Quanto tempo você quer estudar? ");
		String tempo_de_estudo  = scanner.nextLine();


		System.out.print("Quantas matérias você quer estudar? ");
                int materias_de_estudo  = scanner.nextInt();
		
		int tempo_de_estudo_para_cada_materia  = dividir_string(tempo_de_estudo, materias_de_estudo);

		String hora_ou_minuto = verificar_se_eh_hora_ou_minuto(tempo_de_estudo_para_cada_materia);
		
		System.out.println("O tempo de estudo que você terá para cada matéria é de " + tempo_de_estudo_para_cada_materia  + hora_ou_minuto) ;
	}
}

