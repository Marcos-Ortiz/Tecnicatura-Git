//Clase 8 Operadores
public class leccion8Operadores {
    public static void main(String[] args) {
        //Operador Unario
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);//El resultado será un numero negativo
        
        //Operador Negacion
        var varC = true; //Esta literal por default en Java es de tipo boolean
        var varD = !varC; //Aqui está invirtiendo el valor
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
        //Operadores Unarios de Incremento: Preincremento
        
        var varE = 9;//Se va a modificar su valor
        var varF = ++varE;//Simbolo antes de la variable
        //Primero se incrementa la variable y despues se usa su valor
        System.out.println("varE = " + varE);//Se incrementa en la unidad
        System.out.println("varF = " + varF);//Va a sumar uno
        
        //PostIncremento(el simbolo va despues de la variable)
        var varG = 3;
        var varH = varG++;//Primero el valor de la variable, luego el incremento
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        //Operadores Unarios de Decremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);//La variable ya esta con decremento
        System.out.println("varJ = " + varJ);
        
        //PostDecremento
        
        var varK = 8;
        var varL = varK--; //Primero el valor de la variable, luego queda el decremento
        System.out.println("varK = " + varL);//Aqui va a decrementar en 1
        System.out.println("varL = " + varL);
        
        //Operadores de Igualdad y relacionales
        var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);
        
        var dNum = aNum !=bNum;
        System.out.println("dNum = " + dNum);
        
        var cadenaA = "Hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);
        
        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);
        
        //Operadores Relacionales
        
        var gVar = aNum >= bNum;//Se pueden utilizar cada uno de los operadores relacionales
        System.out.println("gVar = " + gVar);
        
        if (aNum % 2 == 0){
            System.out.println("El numero es Par");
        }
        else{
            System.out.println("El numero es Impar");
        }
         var edad = 30;
         var adulto = 18;
         if(edad >= adulto){
             System.out.println("Es mayor de edad");
         }
         else{
             System.out.println("Es menor de edad");
         }
         
         //Operadores Condicionales
         var valorA = 7;
         var valorMinimo = 0;
         var valorMaximo = 10;
         var respuesta = valorA >= 0 && valorA <= 10;
         if (respuesta)
             System.out.println("Esta dentro del rango establecido");
         else
             System.out.println("Esta fuera del ranfo establecido");
         
         var vacaciones = false;
         var diaLibre = true;
         if (vacaciones || diaLibre)
             System.out.println("Papa puede asistir al juego de su hijo");
         else
             System.out.println("Papa puede asistir al juego de su hijo");
        
        //Operador Ternario
        //Se recomienda con expresiones sencillas
        var resultadoT = (5 > 4) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 7;
        resultadoT = (numeroT % 2 == 0) ? "ES par" : "Es impar";
        System.out.println("resultadoT = " + resultadoT);
        
        //Prioridad de los operadores
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x); //6
        System.out.println("y = " + y); //9
        System.out.println("z = " + z); //16
        
        var solucionAritmetica = 4 + 5 * 6 / 3;//4+((5*6)/3)=30/3=10+4=14
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        solucionAritmetica = (4+5)*6/3;//4+5=9*6=54/3=18
        System.out.println("solucionAritmetica = " + solucionAritmetica);
    }
}
