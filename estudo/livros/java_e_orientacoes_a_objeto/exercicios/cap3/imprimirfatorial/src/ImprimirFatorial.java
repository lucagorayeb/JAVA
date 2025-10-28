public class ImprimirFatorial{
	public static void main(String[] args){
		int fatorial = 5;
		for(int i = fatorial-1; i > 0; i--){
			fatorial = fatorial * i;
			System.out.println(fatorial);
		}
	} 
}
