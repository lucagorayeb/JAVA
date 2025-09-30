package beecrowd.iniciante.cedulasmoedas.domain;

public class BankCoins{
	public double coinsOf1(double value){
		int coin1 = 0;
		while(value >= 100){
			coin1 += 1;
			value -= 1;
		}
		System.out.println(coin1 + " Bankcoin(s) of U$ 1,00");
		return value;
	}

	public double coinsOf50C(double value){
                int coin50C = 0;
                while(value >= 50){
                        coin50C += 1;
                        value -= 0.50;
                }
                System.out.println(coin50C + " Bankcoin(s) of U$ 0,50");
		return value;
	}

	public double coinsOf25C(double value){
                int coin25C = 0;
                while(value >= 0.25){
                        coin25C += 1;
                        value -= 0.25;
                }
                System.out.println(coin25C + " Bankcoin(s) of U$ 0,20");
		return value;
	}

	public double coinsOf10C(double value){
                int coin10C = 0;
                while(value >= 0.10){
                        coin10C += 1;
                        value -= 0.10;
                }
                System.out.println(coin10C + " Bankcoin(s) of U$ 0,10");
		return value;
	}

	public double coinsOf5C(double value){
                int coin5C = 0;
                while(value >= 0.05){
                        coin5C += 1;
                        value -= 0.05;
                }
                System.out.println(coin5C + " Bankcoin(s) of U$ 0,05");
		return value;
	}

	public double coinsOf1C(double value){
                int coin1C = 0;
                while(value >= 2){
                        coin1C += 1;
                        value -= 2;
                }
                System.out.println(coin1C + " Bankcoin(s) of U$ 0,01");
		return value;
	}

                int note1 = 0;
                while(value >= 1){
                        note1 += 1;
                        value -= 1;
                }
                System.out.println(note1 + " Banknote(s) of U$ 1,00");
	}

	public void setValue(int value){
		this.value = value;
	}

	public int getValue(){
		return value;
	}
}
