import  java.util.Scanner;

public class LeituraDoTecladoTest02{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IO.print("O grande software de previsão do futuro");
        IO.print("Digite sua pergunta e eu responderei sim ou não");
        String pergunta = scanner.nextLine();

        if(pergunta.charAt(0) == ' '){
            IO.print("SIM");
        }

    }
}