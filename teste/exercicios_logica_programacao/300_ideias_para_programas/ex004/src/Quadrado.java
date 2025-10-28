public class Quadrado{
	public static void main(String[] args){
		// Manual 
		System.out.println("XXXXX");
		System.out.println("X   X");
		System.out.println("X   X");
		System.out.println("X   X");
		System.out.println("XXXXX");

		// Usando um for 
		for(int x = 0; x < 13; x++){
			 if(x < 5){
			 	System.out.print("X");
			 }else if(x >= 5 && x < 8){
				 if (x == 5){
				 	System.out.println();
				 }
			 	System.out.println("X   X");
			 }else{
			 	System.out.print("X");
			 }
		}
	}
}
