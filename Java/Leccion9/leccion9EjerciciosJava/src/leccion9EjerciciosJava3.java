//Clase 9 Ejercicio 3
import java.util.Scanner;

public class leccion9EjerciciosJava3 {
    public static void main(String[] args) {
        final double SALARIO_BASE = 1000.0;
        final double COMISION_POR_CARRO = 150.0;
        final double PORCENTAJE_VENTA = 0.05;

        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario la cantidad de carros vendidos
        System.out.print("Ingrese la cantidad de carros vendidos en el mes: ");
        int carrosVendidos = scanner.nextInt();

        // Pedir el valor total de ventas realizadas
        System.out.print("Ingrese el valor total de ventas de los carros: ");
        double valorVentas = scanner.nextDouble();

        // Calcular el salario total
        double salarioTotal = SALARIO_BASE + (carrosVendidos * COMISION_POR_CARRO) + (valorVentas * PORCENTAJE_VENTA);

        // Imprimir el salario mensual
        System.out.println("El salario mensual del vendedor es: $" + salarioTotal);
    }
}
