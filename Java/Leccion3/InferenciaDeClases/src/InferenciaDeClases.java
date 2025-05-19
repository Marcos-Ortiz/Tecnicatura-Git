
import java.util.Scanner;

public class InferenciaDeClases {

    public static void main(String[] args) {

        // Var - inferencia de tipos en Java
        var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando";
        //soutv + tab
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        System.out.println("miVariableEntera2 = " + miVariableEntera2);

        //Reglas para definir una variable en Java:
        //Siempre utilizar CamelCase (variable siempre empieza con minuscula 
        //y termina con minuscula)
        //La variable no puede empezar con numeros ni con caracteres especiales
        //(excepto el guion bajo y el signo pesos)
        //Se pueden usar acentos pero no es recomendable
        
        // Ejercicio de concatenacion
        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));

        //Ejercicio: Caracteres Especiales con Java
        var nombre = "Natalia";
        //diagonal inversa y letra n
        System.out.println("\nNueva Linea : \n" + nombre);
        //Tabulador
        System.out.println("Tabulador: \t" + nombre);
        //Muchas veces se usa para generar un menu (Se puede usar varias veces)
        System.out.println("\t\t. Menu: ");
        //Caracter de retroceso
        System.out.println("Retroceso: \b\b" + nombre);
        //Comillas Simples
        System.out.println("Comillas Simples: \'" + nombre + "\'");
        //Comillas Dobles
        System.out.println("Comillas Dobles: \"" + nombre + "\"");

        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("titulo2 = " + titulo2);
        System.out.println("Resultado: " + titulo2 + " " + usuario2);
        

    }
}
