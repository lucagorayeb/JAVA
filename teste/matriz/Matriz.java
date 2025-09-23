public class Matriz{

	public static void mostrar_matriz(){
		int[][] matriz = new int[3][3];
                int contador = 1;
                for (int linha = 0; linha < matriz.length; linha++ ){
                        for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                                matriz[linha][coluna] = contador;
                                contador++;
                        }
                }

                for (int linha = 0; linha < matriz.length; linha++ ){
                        for (int coluna = 0; coluna < matriz[linha].length; coluna++){
                                System.out.print(matriz[linha][coluna]);
                        }
                   System.out.println();
                }

	}
	public static void main(String[] args){
		mostrar_matriz();
	}
}
