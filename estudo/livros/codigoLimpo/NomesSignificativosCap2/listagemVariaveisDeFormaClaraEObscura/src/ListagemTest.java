import domain.ListagemVariaveisContextoClaro;
import domain.ListagemVariaveisContextoObscuro;

public class ListagemTest {
    public static void main(String[] args) {
        ListagemVariaveisContextoClaro listagemClara = new ListagemVariaveisContextoClaro();
        ListagemVariaveisContextoObscuro listagemObscuro = new ListagemVariaveisContextoObscuro();

        // Ambos os metodos funcionam, mas o metodo claro é muito mais fácil de entender e fácil de mexer 
        String exemplo = listagemClara.make('A', 3);
        System.out.println(exemplo);
        listagemObscuro.GuessStatisticsMessage('B', 4);
    }
}