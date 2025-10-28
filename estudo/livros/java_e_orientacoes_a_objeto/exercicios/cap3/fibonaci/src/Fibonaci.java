public class Fibonaci{
	public static void main(String[] args){
		int n1 = 0;
		int n2 = 1;
		int soma;
		for(int i = 3; i <= 7; i++){
			if(i == 3){
				System.out.println(n1);
				System.out.println(n2);
			}
			soma = n1 + n2;
			n1 = n2;
			n2 = soma;
			System.out.println(soma);
		}
	} 
}
