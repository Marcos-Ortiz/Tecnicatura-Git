//Clase 8 Ejercicio Mayor de 2 Numeros
import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ingresamos el primer numero
        System.out.print("Ingresa el primer numero: ");
        int numero1 = scanner.nextInt();

        // Ingresamos el segundo
        System.out.print("Ingresa el segundo numero: ");
        int numero2 = scanner.nextInt();

        // Con el operador ternario vemos cual de los numeros es mayor
        int mayor = (numero1 > numero2) ? numero1 : numero2;

        // Mostramos el resultado en el caso de que sean iguales
        if (numero1 == numero2) {
            System.out.println("\nAmbos numeros son iguales: " + numero1);
        } else {
            System.out.println("\nEl mayor de los dos numeros es: " + mayor);
        }
    }
}
