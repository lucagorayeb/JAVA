package beecrowd.iniciante.conversaotempo.domain;

public class ConversaoTempo{
	private int time;

	public void init(int time){
		this.time = time;
		convertTime(time);
	}

	public void convertTime(int time){
		int hour = 0;
		while(time >= 3600){
			hour += 1;
			time -= 3600;
		}

                int minute = 0;
                while(time >= 60){
                        minute += 1;
                        time -= 60;
                }

                int seconds = 0;
                while(time >= 1){
                        seconds += 1;
                        time -= 1;
                }

		System.out.println(hour + ":" + minute + ":" + seconds);
	}

	public void setTime(int time){
		this.time = time;
	}

	public double getTime(){
		return time;
	}
}
