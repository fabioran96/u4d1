import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Per favore, inserisci almeno tre stringhe come argomenti.");
            return;
        }

        String str1 = args[0];
        String str2 = args[1];
        String str3 = args[2];

        String concatenate = str1 + str2 + str3;
        System.out.println("Concatenazione in ordine di inserimento: " + concatenate);

        String reverseConcatenate = str3 + str2 + str1;
        System.out.println("Concatenazione in ordine inverso: " + reverseConcatenate);
    }
}


