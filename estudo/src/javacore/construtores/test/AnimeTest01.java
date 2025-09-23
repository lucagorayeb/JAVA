package javacore.construrores.test;
import javacore.construtores.domain.Anime;

public class AnimeTest01{
	public static void main(String[] args){
		Anime anime = new Anime();
		anime.init("Naruto","TV",12);
		anime.init("Naruto","TV",12,"Luta");
		anime.imprime();
	}
}
