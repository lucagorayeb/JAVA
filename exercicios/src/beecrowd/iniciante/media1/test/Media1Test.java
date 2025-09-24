package beecrowd.iniciante.media1.test;
import beecrowd.iniciante.media1.domain.Media1;

public class Media1Test{
	public static void main(String[] args){
		Media1 media = new Media1();

		double nota1 = 5.0;
		double nota2 = 7.1;
		media.calcularMedia(nota1, nota2);
	}
}
