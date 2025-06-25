import java.util.Scanner;

public class leccion8Rectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos la base del recgtangulo al usuario
        System.out.print("Ingresa la base del rectangulo: ");
        double base = scanner.nextDouble();

        // Ahora pedimos la altura
        System.out.print("Ingresa la altura del rectangulo: ");
        double altura = scanner.nextDouble();

        // Creamos la variable area para calcularla
        double area = base * altura;

        // Hacemos lo mismo con el perimetro
        double perimetro = 2 * (base + altura);

        // Se muestran los resultados
        System.out.println("\nEl area del rectangulo es: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);

        scanner.close();
    }
}
