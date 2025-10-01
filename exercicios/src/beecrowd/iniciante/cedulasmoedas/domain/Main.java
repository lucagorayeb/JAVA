package beecrowd.iniciante.cedulasmoedas.domain;
import beecrowd.iniciante.cedulasmoedas.domain.CoinsNotes;

public class Main{
	
	private double value;
	public CoinsNotes money = new CoinsNotes();

	public void init(double value){
		this.value = value;
		money.showQuantitOfNotesAndCoins(value);
	}

	public void setValue(double value){
		this.value = value;
	}

	public double getValue(){
		return value;
	}
}
