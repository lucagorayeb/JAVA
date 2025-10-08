public class Fibonaci{
	public static void main(String[] args){
		int n1 = 0;
		int n2 = 1;
		for(int i = 0; i < 7; i++){
			if(n1 == 0){
				System.out.println(n1);
				System.out.println(n2);
			}
			for(int j = 0; j < 1; j++){
				n2 = n2 + n1;
			}
			n1 = n2 - n1;
			System.out.println(n2);
		}
	} 
}
