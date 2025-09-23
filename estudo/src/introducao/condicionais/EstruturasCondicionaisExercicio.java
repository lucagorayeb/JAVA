public class EstruturasCondicionaisExercicio{
	public static void main(String[] args){
		
		int salario = 20000;
		String taxa;
		double totalPagar;

		if(salario <= 34712){
			
			taxa = "Vai pagar imposto de 9,7%";
			totalPagar = (salario * 9.7)/100;

		}else if(salario > 34712 && salario <= 68507){
		        
			taxa = "Vai pagar imposto de 37,35%";
                        totalPagar = (salario * 37.35)/100;

		}else{
			taxa = "Vai pagar imposto de 49,5%";
                        totalPagar = (salario * 49.5)/100;
		}

		System.out.println(taxa + "\nO total a pagar é " + totalPagar);

	}
}
