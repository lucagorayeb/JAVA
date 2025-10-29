package beecrowd.iniciante.multiplos.domain;

public class Multiplos{
    private int num1;
    private int num2;

    public boolean verificaMultiplo(int num1, int num2){
        return num1 % num2 == 0 || num2 % num1 == 0;
    }

    public void mostra(int num1, int num2){
        boolean verificador = verificaMultiplo(num1,num2);
        if(verificador == true){
            System.out.println("São Múltiplos");
        }else{
            System.out.println("Não são Múltiplos");
        }
    }

    public void setNum1(int num1){
        this.num1 = num1;
    }

    public int getNum1(){
        return num1;
    }

        public void setNum2(int num2){
        this.num2 = num2;
    }

    public int getNum2(){
        return num2;
    }
}