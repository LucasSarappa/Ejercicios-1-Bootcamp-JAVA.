// 	Metodo que recibe un entero y devuelve el factorial del mismo (¿lo podemos hacer también con tipos genéricos?)
package logica;
import java.util.Scanner;



public class Factorial {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        // Ingresar por teclado un numero binario
        System.out.println("Ingrese un numero decimal al que quiera calcularle su factorial: ");
        int numero = teclado.nextInt();

        int factorial = calcularFactorial (numero);
        System.out.println("El factorial de " + numero + " es:  " + factorial);
    }


    public static int calcularFactorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos");
        }

        if (numero == 0 || numero == 1) {
            return 1; // El factorial de 0 y 1 es 1
        }

        int factorial = 1;
        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
