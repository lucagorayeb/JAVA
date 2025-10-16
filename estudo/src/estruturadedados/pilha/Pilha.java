public class Pilha{
    private static final int MAXSIZE = 100;
    private int size;

    public Pilha(){

    }

    public void push(int value){
        if (isFull()==true) {
            System.out.println("The stack is full");
        }else{

        }
    }

    public boolean isFull(){
        return size == MAXSIZE;
    }

    public boolean isEmpyt(){
        return size == MAXSIZE;
    }

    public void getSize(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }

    public int getMaxSize(){
        return MAXSIZE;
    }
}