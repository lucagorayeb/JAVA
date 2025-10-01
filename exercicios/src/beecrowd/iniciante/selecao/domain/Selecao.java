package beecrowd.iniciante.selecao.domain;

public class Selecao{
	private int A;
	private int B;
	private int C;
	private int D;
	
	public void verificaSeEhAceito(int A, int B, int C, int D){
		if(B > C && D > A && C + D > A + B && C >= 0 && D >= 0 && A%2 == 0){
			System.out.println("Valores Aceitos");
		}else{
			System.out.println("Valores Não Aceitos");
		}
	}

	public void setA(int A){
		this.A = A;
	}

	public int getA(){
		return A;
	}

	public void setB(int B){
		this.B = B;
	}

	public int getB(){
		return B;
	}

	public void setC(int C){
		this.C = C;
	}

	public int getC(){
		return C;
	}

        public void setD(int D){
                this.D = D;
        }

        public int getD(){
                return D;
        }
}
