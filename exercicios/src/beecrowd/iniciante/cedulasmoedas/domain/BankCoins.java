package beecrowd.iniciante.cedulasmoedas.domain;

public class BankCoins{
	public double coins(double value){
		int coin1 = 0;
		while(value >= 1){
			coin1 += 1;
			value -= 1;
		}
		System.out.println(coin1 + " Bankcoin(s) of U$ 1,00");

                int coin50C = 0;
                while(value >= 0.50){
                        coin50C += 1;
                        value -= 0.50;
                }
                System.out.println(coin50C + " Bankcoin(s) of U$ 0,50");

		int coin25C = 0;
                while(value >= 0.25){
                        coin25C += 1;
                        value -= 0.25;
                }
                System.out.println(coin25C + " Bankcoin(s) of U$ 0,25");

                int coin10C = 0;
                while(value >= 0.10){
                        coin10C += 1;
                        value -= 0.10;
                }
                System.out.println(coin10C + " Bankcoin(s) of U$ 0,10");

                int coin5C = 0;
                while(value >= 0.05){
                        coin5C += 1;
                        value -= 0.05;
                }
                System.out.println(coin5C + " Bankcoin(s) of U$ 0,05");

                int coin1C = 0;
                while(value >= 0.01){
                        coin1C += 1;
                        value -= 0.01;
                }
                System.out.println(coin1C + " Bankcoin(s) of U$ 0,01");
		return value;
	}
}
