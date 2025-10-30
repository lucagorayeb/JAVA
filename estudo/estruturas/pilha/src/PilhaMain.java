package pilha;
import pilha.lib.Pilha;

public class PilhaMain{
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        System.out.println("Lista depois de adicionar números");
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.showStack();
        System.out.println(pilha.getSize());

        System.out.println("Lista depois de apagar o último a entrar");
        pilha.pop();
        pilha.showStack();
        System.out.println(pilha.getSize());
    }
}
