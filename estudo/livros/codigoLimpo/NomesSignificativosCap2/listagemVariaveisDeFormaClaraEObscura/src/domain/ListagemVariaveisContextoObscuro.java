package domain;

public class ListagemVariaveisContextoObscuro {
    // No livro esse código é somente um metódo, mas aqui eu vou colocar ele dentro de uma classe para efeitos de estudo

    public void GuessStatisticsMessage (char canditade, int count) {
        String number;
        String verb;
        String pluralModifier;
        switch (count) {
            case 0 -> {
                number = "no";
                verb = "are";
                pluralModifier = "s";
            }
            case 1 -> {
                number = "1";
                verb = "is";
                pluralModifier = "";
            }
            default -> {
                number = Integer.toString(count);
                verb = "are";
                pluralModifier = "s";
            }
        }

        String guessMessage = String.format("There %s %s %s%s", verb, number, canditade, pluralModifier);
        System.out.println(guessMessage);
    }
}