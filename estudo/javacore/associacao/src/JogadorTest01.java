package javacore.associacao.test;
import javacore.associacao.domain.Jogador;

public class JogadorTest01{
	public static void main(String[] args){
		Jogador jogador1 = new Jogador("Rayan");
	        Jogador jogador2 = new Jogador("Robert Renan");
       		Jogador jogador3 = new Jogador("Philipe Coutinho");
 		Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};
		//Jogador[] jogadores = new Jogador[3];
		//Jogador[] jogadores = {jogador1, jogador2, jogador3};			
		for (Jogador jogador : jogadores){
			jogador.imprime();
		}	
	}
}
