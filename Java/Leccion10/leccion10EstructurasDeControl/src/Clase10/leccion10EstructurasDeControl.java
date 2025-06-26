//Clase 10 Estructuras de Control
public class leccion10EstructurasDeControl {
    public static void main(String[] args) {
        var condicion = true;
        if (condicion){
            System.out.println("Condicion Verdadera");//Condicion Simple
        }
        else{
             System.out.println("Condicion Falsa");//Condicional Doble   
        }
        var numero = 2;
        var numeroTexto = "Numero desconocido";
        if(numero == 1){
            numeroTexto = "Numero Uno";
        }
        else if (numero == 2){
            numeroTexto = "Numero Dos";
        }
        else if (numero == 3){
            numeroTexto = "Numero Tres";
        }
        else if(numero == 4){
            numeroTexto = "numero Cuatro";
        }
        else{
            numeroTexto = "Numero no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
