//Metodo que recibe un entero en formato decimal y devuelve un double en formato binario.
// NOTA: Tengo un problema y no encuentro la solucion.
// Si el numero que recibe es positivo, puedo devolver el double en formato binario
// Ahora, si el numero que recibe es negativo, por ej -3, devuelve 1001 en vez de 100.
// Por ese motivo, si se ingresa un

package logica;
import java.util.Scanner;

public class DecimalABinario {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);
        // Ingresar por teclado un numero entero (positivo o negativo)
        System.out.println("Ingrese un numero decimal: ");
        int numero = teclado.nextInt();

        // En caso de que el numero entero ingresado sea positivo
        if (numero >= 0) {

            Double numeroEnBinario = Double.valueOf(decimalPositivoABinario(numero));
            System.out.println("El numero decimal " + numero + " ,al ser positivo, corresponde al número binario = " + numeroEnBinario);

            // En caso de que el numero entero ingresado sea negativo
        } else {

            int numeroAbsoluto = Math.abs(numero); //saco el valor absoluto del numero entero negativo ingresado
            String binarioPositivo = String.valueOf(decimalPositivoABinario(numeroAbsoluto)); // convierto en una cadena de caracteres el numeroAbsoluto pasado a Binario
            Double complementoA1 = Double.valueOf(calcularComplementoA1(binarioPositivo));

            System.out.println("El numero decimal " + numero + " ,al ser negativo, corresponde al número binario en complemento a 1 = " + complementoA1);
        }

    }

// METODO PARA PASAR UN NUMERO ENTERO POSITIVO A NUMERO BINARIO.

    public static int decimalPositivoABinario(int numero) {
        int numeroEnBinario = 0;
        int potencia = 1; // Usado para construir el número en binario
        if (numero > 0) {
            while (numero > 0) {
                int digito = numero % 2;
                numeroEnBinario = (int) (numeroEnBinario + digito * potencia);
                potencia = potencia * 10;
                numero = numero / 2;
            }
        }
        return numeroEnBinario;

    }

    // METODO PARA PASAR UN STRING DE CARACTERES (CON 0s Y 1s) A SU COMPLEMENTO A1.
    public static String calcularComplementoA1(String numeroEnBinario) {
        // Como necesito invertir los 0s y 1s,creo un objeto vacio de la clase del tipo StringBuilder ya que si fuese un string no la podria modificar
        StringBuilder complementoA1 = new StringBuilder();

        // Invertir los bits (cambiar 0 por 1 y 1 por 0)
        for (char bit : numeroEnBinario.toCharArray()) {
            if (bit == '0') {
                complementoA1.append('1');
            } else if (bit == '1') {
                complementoA1.append('0');
            }
        }

        return 1 + complementoA1.toString();
    }
}

