package beecrowd.iniciante.triangulo.domain;

public class Triangulo{
    private double lado1;
    private double lado2;
    private double lado3;

    public boolean verificaExistenciaDoTriangulo(double lado1, double lado2, double lado3){
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado3 + lado2 > lado1;
    }

    public void calculaPerimetro(double lado1, double lado2, double lado3){
        boolean verificador = verificaExistenciaDoTriangulo(lado1,lado2,lado3);
        if( verificador == true){
            double perimetro = lado1 + lado2 + lado3;
            System.out.println("Perimetro:" + perimetro);
        }else{
            double area_trapezio = ((lado1 + lado2) * lado3)/2;
            System.out.println("As condições de existência do triângulo não foram satisfeitas.");
            System.out.println("Área do Trapézio:" + area_trapezio);
        }
    }

    public void setLado1(double lado1){
        this.lado1 = lado1;
    }

    public double getLado1(){
        return lado1;
    }

    public void setLado2(double lado2){
        this.lado2 = lado2;
    }

    public double getLado2(){
        return lado2;
    }

    public void setLado3(double lado3){
        this.lado3 = lado3;
    }

    public double getLado3(){
        return lado3;
    }
}