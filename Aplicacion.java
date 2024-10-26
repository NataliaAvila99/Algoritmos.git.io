import clases.Algoritmos;

public class Aplicacion {

    public static void main(String[] args) {
        // esPar()
        System.out.println("¿El 6 es par? " + Algoritmos.esPar(6));
        System.out.println("¿El 3 es par? " + Algoritmos.esPar(3));

        // esPrimo()

        System.out.println("¿El 9 es primo? " + Algoritmos.esPrimo(9));
        System.out.println("¿El 3 es primo? " + Algoritmos.esPrimo(3));

        // stringReversa
        System.out.println("Reversa de 'Bienvenido' es: " + Algoritmos.stringEnReversa("Bienvenido")); // aloH

        // esPalindromo
        System.out.println("¿'reconocer' es un Palindromo?" + Algoritmos.esPalindromo("reconocer"));
        System.out.println("¿'amor' es un Palindromo?" + Algoritmos.esPalindromo("amor"));

        //secuenciaFizzBuzz
        System.out.println("Secuencia FizzBuzz hasta 15:");
        Algoritmos.secuenciaFizzBuzz(15);  
    }

}
