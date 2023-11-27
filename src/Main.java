public class Main {
    public static String printUnicodeCharacterAtIndex(String text, int index) {
        StringBuilder result = new StringBuilder();

        if (index < text.length() && index >= 0) {
            result.append("Il carattere alla posizione ").append(index).append(" è: ").append(text.charAt(index));
        } else {
            result.append("L'indice ").append(index).append(" non è valido per la stringa fornita.");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String testo = "Hola!";
        int indice = 2;

        String risultato = printUnicodeCharacterAtIndex(testo, indice);
        System.out.println(risultato);
    }
}