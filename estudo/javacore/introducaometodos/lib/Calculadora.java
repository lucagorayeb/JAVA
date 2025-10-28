package javacore.introducaometodos.domain;

public class Calculadora{
	
	public void somaDoisNumeros(){
		System.out.println(10 + 10);
	}

	public void subtraiDoisNumeros(){
		System.out.println(21 - 2);
	}

	public void multiplicaDoisNumeros(int num, int num2){
		System.out.println(num * num2);
	}

	public double divideDoisNumeros(double num, double num2){
		if (num2 == 0){
			return 0;
		}else{
			return num/num2;
		}
	}
	
	public void alteraDoisNumeros(int num, int num2){
		num = 99;
		num2 = 88;
		
		System.out.println(num + " " + num2);

	}

	public void somaArray(int[] numeros){
		int soma = 0;

		for(int num : numeros){
			soma += num;
		}
		System.out.println(soma);
	}

	public void somaVarArgs(int... numeros){
                int soma = 0;

                for(int num : numeros){
                        soma += num;
                }
                System.out.println(soma);

	}
}
