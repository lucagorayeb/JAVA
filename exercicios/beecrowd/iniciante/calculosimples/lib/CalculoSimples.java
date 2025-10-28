package beecrowd.iniciante.calculosimples.domain;

public class CalculoSimples{
	private int codigoPeca1;
	private int codigoPeca2;
	private int quantidadePeca1;
	private int quantidadePeca2;
	private double valorPeca1;
	private double valorPeca2;
	private double valorTotal;
	
	public void init(int codigoPeca1, int codigoPeca2, int quantidadePeca1, int quantidadePeca2, double valorPeca1, double valorPeca2){
		
		this.codigoPeca1 = codigoPeca1;
		this.codigoPeca2 = codigoPeca2;
		this.quantidadePeca1 = quantidadePeca1;
		this.quantidadePeca2 = quantidadePeca2;
		this.valorPeca1 = valorPeca1;
		this.valorPeca2 = valorPeca2;

		calculaValorTotalPeca(quantidadePeca1,valorPeca1,quantidadePeca2,valorPeca2);
	}

	public double calculaValorPrimeiraPeca(int quantidadePeca1, double valorPeca1){
		return quantidadePeca1 * valorPeca1;
	}

        public double calculaValorSegundaPeca(int quantidadePeca2, double valorPeca2){
                return quantidadePeca2 * valorPeca2;
        }

	public void calculaValorTotalPeca(int quantidadePeca1, double valorPeca1, int quantidadePeca2, double valorPeca2){
		
		double valorPrimeiraPeca = calculaValorPrimeiraPeca(quantidadePeca1,valorPeca1);
                double valorSegundaPeca = calculaValorSegundaPeca(quantidadePeca2,valorPeca2);

		double valorTotalPeca = valorPrimeiraPeca + valorSegundaPeca;
		System.out.println("VALOR A PAGAR: R$ " + valorTotalPeca);
	}

	public void setCodigoPeca1(int codigoPeca1){
		this.codigoPeca1 = codigoPeca1;
	}

	public int getCodigoPeca1(){
		return codigoPeca1;
	}

        public void setCodigoPeca2(int codigoPeca2){
		this.codigoPeca2 = codigoPeca2;
        }

        public int getCodigoPeca2(){
                return codigoPeca2;
        }

        public void setQuantidadePeca1(int quantidadePeca1){
		this.quantidadePeca1 = quantidadePeca1;
        }

        public int getQuantidadePeca1(){
                return quantidadePeca1;
        }


        public void setQuantidadePeca2(int quantidadePeca2){
		this.quantidadePeca2 = quantidadePeca2;
        }

        public int getQuantidadePeca2(){
            return quantidadePeca2;
        }


        public void setValorPeca1(double valorPeca1){
		this.valorPeca1 = valorPeca1;
        }

        public double getValorPeca1(){
                return valorPeca1;
        }


        public void setValorPeca2(double valorPeca2){
		this.valorPeca2 = valorPeca2;
        }

        public double getValorPeca2(){
                return valorPeca2;
        }

        public double getValorTotal(){
                return valorTotal;
        }




}
