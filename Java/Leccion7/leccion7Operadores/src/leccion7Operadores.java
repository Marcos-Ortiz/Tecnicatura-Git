//Clase 7 Operadores
public class leccion7Operadores {
    public static void main(String[] args) {
        
        int num1 = 5; 
        int num2 = 4;
        var solucion = num1 + num2;
        System.out.println("solucion de la suma = " + solucion);
        
        solucion = num1 - num2;
        System.out.println("solucion de la resta = " + solucion);
        
        solucion = num1 * num2;
        System.out.println("solucion de la multiplicaion = " + solucion);
        
        solucion = num1 / num2;
        System.out.println("solucion de la division = " + solucion);
        
        var solucion2 = 3.4 / num2;
        System.out.println("solucion2 resultado de la division = " + solucion2);
        
        solucion = num1 % num2; //Guarda el residuo entero de la division
        System.out.println("solucion = " + solucion);
        
        // Si usamos la estructura if-else con solo una linea de codigo no hacen falta llaves
        if (num1 % 2 == 0)
            System.out.println("Es un numero Par");
        else
            System.out.println("Es un numero Impar");
        
        if (num2 % 2 == 0)
            System.out.println("Es un numero Par");
        else
            System.out.println("Es un numero Impar");
        
        //Operadores de Asignacion
        int varNum1 = 1, varNum2 = 4;
        var varNum3 = varNum1 + 6 - varNum2; //Una operacion
        System.out.println("varNum3 = " + varNum3);
        
        varNum1 += 1; //varNum1 = varNum1 + 1;
        System.out.println("varNum1 = " + varNum1);
        
        varNum2 -= 2;
        System.out.println("varNum2 = " + varNum2);
        varNum1 *= 5;
        System.out.println("varNum1 = " + varNum1);
        varNum3 /= 4;
        System.out.println("varNum3 = " + varNum3);
        varNum1 %= 6;
        System.out.println("varNum1 = " + varNum1);
        
    }
}
