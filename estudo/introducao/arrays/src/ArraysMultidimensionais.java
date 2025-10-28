public class ArraysMultidimensionais{
	public static void main(String[] args){
		int[][] dias = new int[5][5];

		for(int i = 0; i < dias.length; i++){
			for(int j = 0; j < dias[i].length; j++){
				dias[i][j] = j;
				System.out.print(dias[i][j]);
			}
			System.out.println();
		}
	}
}
