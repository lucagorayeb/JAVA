package beecrowd.iniciante.cedulasmoedas.domain;

public class BankNotes{

	public double notes(double value){
		int note100 = 0;
		while(value >= 100){
			note100 += 1;
			value -= 100;
		}
		System.out.println(note100 + " Banknote(s) of U$ 100,00");

                int note50 = 0;
                while(value >= 50){
                        note50 += 1;
                        value -= 50;
                }
                System.out.println(note50 + " Banknote(s) of U$ 50,00");

                int note20 = 0;
                while(value >= 20){
                        note20 += 1;
                        value -= 20;
                }
                System.out.println(note20 + " Banknote(s) of U$ 20,00");

                int note10 = 0;
                while(value >= 10){
                        note10 += 1;
                        value -= 10;
                }
                System.out.println(note10 + " Banknote(s) of U$ 10,00");
       
       		int note5 = 0;
                while(value >= 5){
                        note5 += 1;
                        value -= 5;
                }
                System.out.println(note5 + " Banknote(s) of U$ 5,00");

                int note2 = 0;
                while(value >= 2){
                        note2 += 1;
                        value -= 2;
                }
                System.out.println(note2 + " Banknote(s) of U$ 2,00");
		return value;
	}
}
