
import java.util.Scanner;

public class leccion9EjerciciosJava1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir las tres calificaciones
        System.out.print("Ingrese la primera calificacion: ");
        double calificacion1 = scanner.nextDouble();

        System.out.print("Ingrese la segunda calificacion: ");
        double calificacion2 = scanner.nextDouble();

        System.out.print("Ingrese la tercera calificacion: ");
        double calificacion3 = scanner.nextDouble();

        // Calcular la suma
        double suma = calificacion1 + calificacion2 + calificacion3;

        // Imprimir el resultado
        System.out.println("La suma de las tres calificaciones es: " + suma);
        
        scanner.close();
    }
    
}
