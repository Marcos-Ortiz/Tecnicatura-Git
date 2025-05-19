
import java.util.Scanner; // Importamos Scanner para leer datos
public class TiendaDeLibros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in); // Creamos objeto Scanner para leer datos
                
                // Mensaje inicial
                System.out.println("Por favor, ingrese los datos del libro");
                
                // Pedimos nombre del libro
                System.out.println("Ingrese el nombre del libro: ");
                String nombre = scanner.nextLine(); // Creamos una variable tipo String
                
                // Pedimos el id
                System.out.println("Ingrese ID del libro");
                int id = scanner.nextInt(); // Creamos una variable tipo int
                
                // Le pedimmos al usuario el precio del libro
                System.out.println("Precio del Libro");
                double precio = scanner.nextDouble(); // Creamos variable tipo double
                
                // Preguntamos si el envio es gratuito
                System.out.println("El envio es gratuito? True/False");
                boolean envioGratuito = scanner.nextBoolean(); // Creamos un booleano
                
                // Mostarmos los datos
                
                System.out.println("---Datos del Libro---");
                System.out.println("Nombre: " + nombre);
                System.out.println("ID: " + id);
                System.out.println("Precio: " + precio);
                System.out.println("El envio es gratuito? " + envioGratuito);
                
                scanner.close();
    }
}
