public class EstruturasSwitch{
	public static void main(String[] args){
		
		// Imprim dia da Semana 

		byte dia = 5;
		String diaSemana;

		switch(dia){
			case 1:
				diaSemana = "Domingo";
				break;

			case 2:
				diaSemana = "Segunda";
				break;

			case 3: 
				diaSemana = "Terça";
				break;

			case 4: 
				diaSemana = "Quarta";
				break;

			case 5: 
				diaSemana = "Quinta";
				break;

			case 6:
				diaSemana = "Sexta";
				break;

			case 7: 
				diaSemana = "Sabádo";
				break;

			default:
				diaSemana = "Dia inválido";
				break;
		}		
		
		System.out.println(diaSemana);
	}
}
