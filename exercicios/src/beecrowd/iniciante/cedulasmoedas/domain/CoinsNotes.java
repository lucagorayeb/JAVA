package beecrowd.iniciante.cedulasmoedas.domain;
import beecrowd.iniciante.cedulasmoedas.domain.BankNotes;
import beecrowd.iniciante.cedulasmoedas.domain.BankCoins;

public class CoinsNotes{
	public BankNotes notes = new BankNotes();
	public BankCoins coins = new BankCoins();

	public void showQuantitOfNotesAndCoins(double value){
		value = notes.notes(value);
		coins.coins(value);
	}
}
