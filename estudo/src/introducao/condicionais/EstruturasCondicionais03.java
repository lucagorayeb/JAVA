public class EstruturasCondicionais03{
	public static void main(String[] args){
		
		// Doar se salário maior que 5000

		double salario = 6000;
		String mensagemDoar = "Eu vou doar 500 para o DevDojo";
		String mensagemNaoDoar = "Eu ainda não tenho condições, mas vou ter!";
		String resultado;

		if(salario > 5000){
			resultado = mensagemDoar;
		}else{
			resultado = mensagemNaoDoar;
		}

		System.out.println(resultado);

		// Operador Ternário
		
		String resultado2 = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
		System.out.println(resultado2);
	}
}
