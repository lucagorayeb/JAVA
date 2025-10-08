package javacore.associacao.test;
import javacore.associacao.domain.Jogador;
import javacore.associacao.domain.Time;

public class JogadorTest03{
	public static void main(String[] args){
		Jogador jogador = new Jogador("Rayan");
	        Jogador[] jogadores = {jogador};
		Time time = new Time("Vasco");
		jogador.setTime(time);
		jogador.imprime();
		time.setJogadores(jogadores);
		time.imprime();
		
	}
}
