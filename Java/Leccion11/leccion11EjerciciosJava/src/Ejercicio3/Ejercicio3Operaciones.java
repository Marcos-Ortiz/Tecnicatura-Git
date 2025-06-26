//Clase 11 Ejercicio 3: Leer 2 numeros, si son iguales que los multiplique, 
//si el primero es mayor que el segundo que los reste y si no que los sume
package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3Operaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, resultado;

        System.out.print("Digite dos numeros: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        if (num1 == num2) {
            resultado = num1 * num2;
        } else if (num1 > num2) {
            resultado = num1 - num2;
        } else {
            resultado = num1 + num2;
        }

        System.out.println("El resultado es: " + resultado);

    }
}

