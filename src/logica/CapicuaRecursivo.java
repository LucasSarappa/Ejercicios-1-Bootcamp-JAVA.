package logica;
import java.util.Scanner;

public class CapicuaRecursivo {

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

    // Método recursivo para verificar si un número es capicúa
    public static boolean esCapicua(int numeroOriginal) {

        int numero = Math.abs(numeroOriginal); //saco el valor absoluto del numero entero ingresado (por si es negativo)
        String numeroStr = Integer.toString(numero);// paso el numero int ingresado a string

        return esCapicuaRecursiva(numeroStr, 0, numeroStr.length() - 1); // 121,0,2 //
    }

    private static boolean esCapicuaRecursiva(String numeroStr, int inicio, int fin) {
        // Caso base: Si solo queda un dígito o ninguno, es capicúa
        if (inicio >= fin) {
            return true;
        }

        // Comprobar si los dígitos en los extremos son iguales
        if (numeroStr.charAt(inicio) == numeroStr.charAt(fin)) {
            // Llamar recursivamente para el siguiente par de dígitos
            return esCapicuaRecursiva(numeroStr, inicio + 1, fin - 1);
        }

        // Si los dígitos en los extremos no son iguales, no es capicúa
        return false;
    }
}