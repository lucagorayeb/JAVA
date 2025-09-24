package beecrowd.iniciante.media2.test;
import beecrowd.iniciante.media2.domain.Media2;

public class Media2Test{
	public static void main(String[] args){
		Media2 media = new Media2();
		double nota1 = 5.0;
		double nota2 = 6.0;
		double nota3 = 7.0;
		
		media.init(nota1, nota2);
		media.init(nota1, nota2, nota3);

	}
}
