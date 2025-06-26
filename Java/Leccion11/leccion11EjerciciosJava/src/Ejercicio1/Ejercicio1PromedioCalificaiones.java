//Clase 11 Ejercicio 1: Determinar si un alumno aprueba o reprueba un curso, 
//sabiendo que aprobara si su promedio de tres calificaciones 
//es mayor o igual a 70, reprueba caso contrario
package Ejercicio1;
import java.util.Scanner;
public class Ejercicio1PromedioCalificaiones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, nota3, promedio;
        System.out.println("Digite las 3 calificaciones:");
        nota1 = scanner.nextDouble();
        nota2 = scanner.nextDouble();
        nota3 = scanner.nextDouble();
        promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 70) {
            System.out.println("El alumno esta aprobado: " + promedio);
        } else {
            System.out.println("El alumno esta desaprobado: " + promedio);
            scanner.close();
        }
    }
}

