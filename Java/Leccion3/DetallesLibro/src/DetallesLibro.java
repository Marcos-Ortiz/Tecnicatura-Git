import java.util.Scanner;

public class DetallesLibro {
    public static void main(String[] args) {
        
        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite el nombre del libro: ");
        var libro = entrada.nextLine();
        System.out.println("libro = " + libro);
        System.out.println("Escriba el autor del libro: ");
        var autor = entrada.nextLine();
        System.out.println("autor = " + autor);
        System.out.println(libro + " fue escrito por " + autor);
        
    }
    
}
