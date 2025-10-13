package beecrowd.iniciante.media3.domain;

public class Media{
	private double nota1;
	private double nota2;
	private double nota3;
	private double nota4;
	private double mediaFinal;

	public double calculaMedia(double nota1, double nota2, double nota3, double nota4)
	{
		return (nota1 + nota2 + nota3 + nota4)/4;
	}

	public String verificaMedia(double media){
		if(media >= 7.0){
			return "Aluno Aprovado";
		}else if(media >= 5.0 &&  media < 7.0 ){
			return "Aluno em Exame";
		}else{
			return "Aluno Reprovado";
		}
	}

	public void verificaSeFicouDeExame(String alunoStatus){
		if(alunoStatus == "Aluno em Exame"){
			
		}
	}

	public double calculaMediaFinal(double media, double notaExameFinal){
		return (media + notaExameFinal)/2;
	}

	public String verificaMediafinal(double mediaFinal){
		if(mediaFinal >= 7.0){
			return "Aluno Aprovado";
		}else{
			return "Aluno Reprovado";
		}
	}

	public void mostrar(double nota1, double nota2, double nota3, double nota4){
		double media = calculaMedia(nota1, nota2, nota3, nota4);
		System.out.prinln("Media:" + media);
		String alunoStatus = verificaMedia(media);
		System.out.prinln(alunoStatus);
		
	}

	public void setNota1(double nota1){
		this.nota1 = nota1;
	}

	public double getNota1(){
		return nota1;
	}

	public void setNota2(double nota2){
		this.nota2 = nota2;
	}

	public double getNota2(){
		return nota2;
	}

	public void setNota3(double nota3){
		this.nota3 = nota3;
	}

	public double getNota3(){
		return nota3;
	}

	public void setNota4(double nota4){
		this.nota4 = nota4;
	}

	public double getNota4(){
		return nota4;
	}
}
