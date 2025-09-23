public class EstruturasCondicionais02{
	public static void main(String[] args){
		
		int idade = 20;
		boolean isAutorizadoComprarBebida = idade >= 18;

		if (isAutorizadoComprarBebida){
			System.out.println("Autorizado para comprar bebida alcólica");
		}else{
                        System.out.println("Não autorizado para comprar bebida alcólica");
                }

		if(idade < 15){

			System.out.println("Categoria infantil");

		}else if(idade >= 15 && idade < 18){

			System.out.println("Categoria juvenil");

		}else{

			System.out.println("Categoria adulto");

		}

	}
}
