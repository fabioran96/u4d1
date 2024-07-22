public class Exercise3 {
    // Metodo per calcolare perimetro rettangolo
    public static double perimetroRettangolo(double lato1, double lato2) {
        return 2 * (lato1 + lato2);
    }

    // Metodo per determinare se un numero è pari o dispari
    public static int pariDispari(int num) {
        return (num % 2 == 0) ? 0 : 1;
    }

    // Metodo per calcolare l'area di un triangolo usando la formula di Erone
    public static double areaTriangolo(double lato1, double lato2, double lato3) {
        double semiPerimetro = (lato1 + lato2 + lato3) / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - lato1) * (semiPerimetro - lato2) * (semiPerimetro - lato3));
    }

    public static void main(String[] args) {
        if (args.length < 6) {
            System.out.println("Per favore, inserisci almeno sei argomenti: due per i lati del rettangolo, uno per il numero intero, e tre per i lati del triangolo.");
            return;
        }

        // Ottieni i lati del rettangolo dagli argomenti
        double lato1Rettangolo = Double.parseDouble(args[0]);
        double lato2Rettangolo = Double.parseDouble(args[1]);

        // Calcola e stampa il perimetro del rettangolo
        double perimetroRettangolo = perimetroRettangolo(lato1Rettangolo, lato2Rettangolo);
        System.out.println("Il perimetro del rettangolo è: " + perimetroRettangolo);

        // Ottieni il numero intero dagli argomenti
        int numero = Integer.parseInt(args[2]);

        // Determina e stampa se il numero è pari o dispari
        int risultatoPariDispari = pariDispari(numero);
        System.out.println("Il numero " + numero + " è " + (risultatoPariDispari == 0 ? "pari" : "dispari"));

        // Ottieni i lati del triangolo dagli argomenti
        double lato1Triangolo = Double.parseDouble(args[3]);
        double lato2Triangolo = Double.parseDouble(args[4]);
        double lato3Triangolo = Double.parseDouble(args[5]);

        // Calcola e stampa l'area del triangolo
        double areaTriangolo = areaTriangolo(lato1Triangolo, lato2Triangolo, lato3Triangolo);
        System.out.println("L'area del triangolo è: " + areaTriangolo);
    }
}
