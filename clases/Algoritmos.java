package clases;

public class Algoritmos {
    // esPar()
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // esPrimo()
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // stringEnReversa
    public static String  stringEnReversa(String texto) {
        StringBuilder reversa = new StringBuilder(texto);
        return reversa.reverse().toString();
    }

    //esPalindromo
    public static Boolean esPalindromo(String texto){
    String textoReverso = stringEnReversa(texto);
    return texto.equals(textoReverso);
    }

    //secuenciaFizzBuzz
    public static void secuenciaFizzBuzz(int numero){
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}

