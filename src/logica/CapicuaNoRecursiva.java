package logica;
import java.util.Scanner;

public class CapicuaNoRecursiva {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numeroOriginal = teclado.nextInt(); // Ingresar por teclado un numero entero (positivo o negativo)

        boolean esCapicua = esCapicua(numeroOriginal);

        if (esCapicua) {
            System.out.println(numeroOriginal + " es un número capicúa.");
        } else {
            System.out.println(numeroOriginal + " no es un número capicúa.");
        }
    }

    // Método no recursivo para verificar si un número es capicúa
    public static boolean esCapicua(int numeroOriginal) {

        int numero = Math.abs(numeroOriginal); //saco el valor absoluto del numero entero ingresado (por si es negativo)

        String numeroStr = Integer.toString(numero); // paso el numero int ingresado a string
        int longitud = numeroStr.length(); // saco la cantidad de cifras q tiene el numero

        for (int i = 0; i < longitud / 2; i++) {
            char primerDigito = numeroStr.charAt(i); // charAt = posicion del caracter
            char ultimoDigito = numeroStr.charAt(longitud - 1 - i);

            if (primerDigito != ultimoDigito) {
                return false;
            }
        }

        return true;
    }
}
