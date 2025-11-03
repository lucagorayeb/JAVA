package domain;
public class TiposTriangulo{
    private double lado1;
    private double lado2;
    private double lado3;

    public boolean verificaSeFormaTriangulo(double lado1, double lado2, double lado3){
        return lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado2 + lado1;
    }

    public boolean verificaSeEhRetangulo(double lado1, double lado2, double lado3){
        return lado1*lado1 == lado2*lado2 + lado3*lado3 || lado2*lado2 == lado1*lado1 + lado3*lado3 || lado3*lado3 == lado2*lado2 + lado1*lado1;
    }

    public boolean verificaSeEhObtuso(double lado1, double lado2, double lado3){
        return lado1*lado1 > lado2*lado2 + lado3*lado3 || lado2*lado2 > lado1*lado1 + lado3*lado3 || lado3*lado3 > lado2*lado2 + lado1*lado1;
    }

    public boolean verificaSeEhAgudo(double lado1, double lado2, double lado3){
        return lado1*lado1 < lado2*lado2 + lado3*lado3 || lado2*lado2 < lado1*lado1 + lado3*lado3 || lado3*lado3 < lado2*lado2 + lado1*lado1;
    }

    public boolean verificaSeEhEquilatero(double lado1, double lado2, double lado3){
        return lado1 == lado2 && lado2 == lado3;
    }

    public boolean verificaSeEhIsoceles(double lado1, double lado2, double lado3){
        return lado1 == lado2 || lado2 == lado3 || lado1 == lado3;
    }

    public String mostraSeEhRetanguloOuObtusoOuAgudo(double lado1, double lado2, double lado3){
        boolean verificaRetangulo = verificaSeEhRetangulo(lado1,lado2,lado3);
        boolean verificaObtuso = verificaSeEhObtuso(lado1, lado2, lado3);
        boolean verificaAgudo = verificaSeEhAgudo(lado1, lado2, lado3);

        if(verificaRetangulo == true){
            return "Triangulo Retangulo";
        }else if (verificaObtuso == true) {
            return "Triangulo Obtusangulo";
        }else if (verificaAgudo == true) {
            return "Triangulo Acutangulo";
        }else{
            return "Inseriu dados de forma errada";
        }
    }

    public String mostraSeEhEquilateroOuIsoceles(double lado1, double lado2, double lado3){
        boolean verificaEquilatero = verificaSeEhEquilatero(lado1,lado2,lado3);
        boolean verificaIsoceles = verificaSeEhIsoceles(lado1, lado2, lado3);

        if(verificaEquilatero == true){
            return "Triangulo Equilatero";
        }else if(verificaIsoceles == true){
            return "Triangulo Isoceles";
        }else{
            return "Inseriu dados de forma errada";
        }
    }

    public void mostrarSaida(double lado1, double lado2, double lado3){
        boolean verificador = verificaSeFormaTriangulo(lado1,lado2,lado3);
        if(verificador == true){
            String tipoAngulo = mostraSeEhRetanguloOuObtusoOuAgudo(lado1, lado2, lado3);
            System.out.println(tipoAngulo);
            String tipoLado = mostraSeEhEquilateroOuIsoceles(lado1, lado2, lado3);
            System.out.println(tipoLado);
        }else{
            System.err.println("Não forma triângulo");
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