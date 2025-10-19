package estruturas.pilha;

public class Pilha{
    public int maxSize = 100;
    private int size;
    public Integer[] stack = new Integer[maxSize];

    public void push(int value){
        if (isFull()==true) {
            System.out.println("The stack is full");
        }else{
            for(int i = 0; i <= stack.length; i++){
                if(stack[i] == null){
                  stack[i] = value;
                  sizeGrow();
                  break;
                }
            }
        }
    }

    public void pop(){
        if (isEmpyt() == true) {
            System.out.println("The stack is empyt");
        }else{
            for(int i = 0; i <= stack.length; i++){
                if(stack[i] == null){
                  stack[i-1] = null;
                  sizeDown();
                  break;
                }
            }
        }
    }

    public void showStack(){
        for (Integer stack1 : stack) {
            if (stack1 != null) {
                System.out.println(stack1);
            }
        }
    }

    public void sizeGrow(){
        this.size += 1;
    }

    public void sizeDown(){
        this.size -= 1;
    }

    public boolean isFull(){
        return size == maxSize;
    }

    public boolean isEmpyt(){
        return size == maxSize;
    }

    public int getSize(){
        return size;
    }

    public int getMaxSize(){
        return maxSize;
    }
}
