public class EstruturasCondicionais01{
	public static void main(String[] args){
		
		int idade = 20;
		boolean isAutorizadoComprarBebida = idade >= 18;

		if (isAutorizadoComprarBebida){
			System.out.println("Autorizado para comprar bebida alcólica");
		}

		if (!isAutorizadoComprarBebida){
                        System.out.println("Não autorizado para comprar bebida alcólica");
                }

	}
}
