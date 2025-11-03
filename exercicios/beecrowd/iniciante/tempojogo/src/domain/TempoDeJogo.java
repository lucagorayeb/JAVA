package domain;

public class TempoDeJogo{
    private int horaInicial;
    private int horaFinal;

    public void tempoJogado(int horaInicial, int horaFinal){
        int tempoDeJogo;
        if (horaInicial > horaFinal) {
            tempoDeJogo = horaFinal + (24 - horaInicial);
            System.out.println("O jogo durou " + tempoDeJogo + " hora(s)");
        }else if (horaFinal > horaInicial) {
            tempoDeJogo = horaFinal - horaInicial;
            System.out.println("O jogo durou " + tempoDeJogo + " hora(s)");
        }else{
            System.out.println("O jogo durou 24 hora(s)");
        }
    }

    public void setHoraInicial(int horaInicial){
        this.horaInicial = horaInicial;
    }

    public int getHoraInicial(){
        return horaInicial;
    }

    public void setHoraFinal(int horaFinal){
        this.horaFinal = horaFinal;
    }

    public int getHoraFinal(){
        return horaFinal;
    }
}