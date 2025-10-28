//package beecrowd.iniciante.sort_simples.test;

public class SortTest{
    public static void ordenaValores(int[] array){
		int pivo = array.length/2;
	    for(int i = 0; i < pivo; i++){
			if(array[pivo] < array[i]){ 
                int ref = array[pivo];
                array[pivo] = array[i];
                array[i] = ref;
            }
            for(int j = pivo; j < array.length; j++){
                if(array[pivo] > array[j]){ 
                    int ref = array[pivo];
                    array[pivo] = array[j];
                    array[j] = ref;
                }
            }
		}
        mostraArray(array);
	}

    public static void ordenaValores2(int[] array){
        int pivo = array.length/2;
        
    }

    public static void mostraArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
		}
    }
    public static void main(String[] args) {
        int[] vetor = {6,7,2,9,1};
        ordenaValores(vetor);
    }
	
}