package beecrowd.iniciante.idadedias.domain;

public class IdadeDias{
	private int days;
	
	public void init(int days){
		this.days = days;
		convertDaysInAge(days);
	}

	public void convertDaysInAge(int days){
		int years = 0;
		while(days >= 365){
			years +=1;
			days -= 365;
		}
		System.out.println(years + " anos(s)");

                int months = 0;
		while(days >= 30){
			months +=1;
			days -= 30;
		}
		System.out.println(months + " meses(s)");		
		System.out.println(days + " dia(s)");
	}

	public void setDays(int days){
		this.days = days;
	}

	public int getDays(){
		return days;
	}

}
