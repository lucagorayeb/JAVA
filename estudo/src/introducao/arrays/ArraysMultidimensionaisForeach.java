public class ArraysMultidimensionaisForeach{
	public static void main(String[] args){
		int[][] numeros = new int[5][5];

		for(int[] arrBase : numeros){
			for(int num : arrBase){
				System.out.print(num);
			}
			System.out.println();
		}
	}
}
