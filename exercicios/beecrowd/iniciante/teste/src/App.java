import domain.lista.Lista;
import domain.soma.Soma;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Soma soma = new Soma();
        Lista lista = new Lista();
        int valor = soma.somaSimples();
        System.out.println(valor);
        int valor2 = lista.somaSimples();
        System.out.println(valor2);
    }
}
