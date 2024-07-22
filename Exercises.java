public class Exercises {
    //Moltiplicazione di due numeri interi

    public static int multiply (int a, int b) {
        return a * b;
    }

    //Concatenazione di stringa e numero
    public static String concatenate (String str, int num) {
        return str + num;
    }

    //Metodo per inserire una stringa in un array di stringhe
    public static String[] insertArray(String[] arr, String str) {
        if (arr.length != 5) {
            throw new IllegalArgumentException("L'array deve essere di 5 elementi.");
        }

        String[] newArr = new String[6];

        newArr[0] = arr[0];
        newArr[1] = arr[1];

        newArr[2] = str;

        newArr[3] = arr[2];
        newArr[4] = arr[3];
        newArr[5] = arr[4];

        return newArr;

    }




    //Console logs
    public static void main(String[] args) {
        int resultMultiply = multiply(2, 4);
        System.out.println("Result of multiplying (a,b): " + resultMultiply);

        String resultConcatenate = concatenate("Number: ", 5);
        System.out.println("Result of concatenate string + number: " + resultConcatenate);

        String[] originalArray = {"uno", "due", "tre", "quattro", "cinque"};
        String[] newArray = insertArray(originalArray, "nuovo");
        System.out.println("Risultato di insertArray:");
        for (String s : newArray) {
            System.out.println(s);
        }
    }
}







