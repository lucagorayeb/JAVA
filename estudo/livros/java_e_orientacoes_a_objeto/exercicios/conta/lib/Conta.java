class Conta{
	int numero;
	double saldo;
	double limite;
	Cliente titular;

	public boolean sacar(double valor){
		if(valor > saldo){
			System.out.println("Saldo insuficiente");
			return false;
		}else{
			this.saldo = saldo - valor;
			return true;
		}
	}

	public void depositar(double valor){
		this.saldo = saldo + valor;
	}

	public boolean transfere(Conta destino, double valor){
		boolean retirou = this.sacar(valor);
		if(retirou == false){
			return false;
		}else{
			destino.depositar(valor);
			return true;
		}
	}

}
