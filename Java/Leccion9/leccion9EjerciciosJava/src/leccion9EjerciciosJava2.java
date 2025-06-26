//Clase 9 Ejercicio 2
import java.util.Scanner;

public class leccion9EjerciciosJava2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la cantidad de dinero de Guillermo
        System.out.print("Ingrese la cantidad de dinero que tiene Guillermo (N): ");
        double guillermo = scanner.nextDouble();

        // Calcular el dinero de Luis y Juan
        double luis = guillermo / 2;
        double juan = (guillermo + luis) / 2;

        // Calcular el total
        double total = guillermo + luis + juan;

        // Imprimir el resultado
        System.out.println("La cantidad total de dinero entre los tres es: $" + total);
    }
}
