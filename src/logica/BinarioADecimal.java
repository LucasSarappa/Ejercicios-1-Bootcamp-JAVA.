// Metodo que recibe un double en formato binario y devuelve un entero en formato decimal.

package logica;
import java.util.Scanner;

public class BinarioADecimal {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        // Ingresar por teclado un numero binario
        System.out.println("Ingrese un numero binario: ");
        double numero = teclado.nextInt();

        if (esBinario(numero)) {
            int numeroEnDecimal = binarioADecimal(numero);
            System.out.println("El numero binario: " + numero + " corresponde al numero decimal: " + numeroEnDecimal + ".");
        } else {
            System.out.println("Error: El numero " + numero + " ingresado no es binario.");
        }
    }


// METODO PARA PASAR UN NUMERO BINARIO A NUMERO ENTERO.

    public static int binarioADecimal(double numero) {
        int numeroEnDecimal = 0;
        int base = 2;

        String numCadena = Integer.toString((int) numero);

        for (int i = 0; i < numCadena.length(); i++) { // numCadena = 111

            char caracter = numCadena.charAt(i); // caracter = '1'
            int exponente = numCadena.length() - i - 1; // exponente = 3 - 0 - 1 = 2
            int potencia = (int) Math.pow(base, exponente);

            int valorNumerico = caracter - '0'; // Restar el valor ASCII de '0' para obtener el valor numérico.
            numeroEnDecimal += (valorNumerico * potencia); // Acumular el valor calculado en númeroEnDecimal.
        }
        return numeroEnDecimal;
    }

// METODO PARA COMPROBAR QUE EL NUM INGRESADO ES BINARIO.
    public static boolean esBinario(double numero) {

        String numCadena = Integer.toString((int) numero);

        for (int i = 0; i < numCadena.length(); i++) {
            char caracter = numCadena.charAt(i);
            if (caracter != '0' && caracter != '1') {
                return false;
            }
        }
        return true;
    }
}



