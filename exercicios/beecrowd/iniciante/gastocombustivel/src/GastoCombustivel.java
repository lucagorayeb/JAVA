package beecrowd.iniciante.gastocombustivel.domain;
import java.text.DecimalFormat;

public class GastoCombustivel{
	private double time;
	private double speed;
	private double carFuelConsuming = 12;
	public DecimalFormat df = new DecimalFormat("#.###");

	public void init(double time, double speed){
		this.time = time;
		this.speed = speed;
		String value = formatValue(time,speed);
		System.out.println(value);
	}

	public String formatValue(double time, double speed){
		double consuming = fuelSpendCalculator(time,speed);
		return df.format(consuming);
	}
	
	public double fuelSpendCalculator(double time, double speed){
		 return distanceCalculator(time,speed) / getCarFuelConsuming();
	}

	public double distanceCalculator(double time, double speed){
		return time * speed;
	}

	public void setTime(double time){
		this.time = time;
	}

	public double getTime(){
		return time;
	}

        public void setSpeed(double speed){
                this.speed = speed;                                                                           }
	
	public double getSpeed(){
               return speed;
	}
	
	public double getCarFuelConsuming(){
		return carFuelConsuming;
	}

}
