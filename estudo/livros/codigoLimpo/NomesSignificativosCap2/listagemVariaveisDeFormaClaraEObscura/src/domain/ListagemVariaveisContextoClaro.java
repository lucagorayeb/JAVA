package domain;
public class ListagemVariaveisContextoClaro{
    // O nome da classe no exemplo do livro é GuessStatisticsMessage, mas eu vou deixar assim para efeitos de prática.
    private String number;
    private String verb;
    private String pluralModifier;

    public String make (char canditade, int count) {
        createPluralDependentMessageParts (count);
        return String.format("There %s %s %s%s", verb, number, canditade, pluralModifier);
    }

    private void createPluralDependentMessageParts (int count) {
        switch (count) {
            case 0 -> thereAreNoLetters ();
            case 1 -> thereIsOneLetters ();
            default -> thereAreManyLetters (count);
        }
    }

    private void thereAreManyLetters (int count) {
        number = Integer.toString(count);
        verb = "are";
        pluralModifier = "s";
    }

    private void thereIsOneLetters(){
        number = "1";
        verb = "is";
        pluralModifier = "";
    }

    private void thereAreNoLetters () {
        number = "no";
        verb = "are";
        pluralModifier = "s";
    }
}