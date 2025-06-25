//Ejercicio 1: Calcular estacion del año
let mes = 4;
let estacion; //Undefined

if(mes == 1 || mes == 2 || mes == 12) {
    estacion = "Verano";
    } 
    else if(mes == 3 || mes == 4 || mes == 5) {
        estacion = "Otoño";
    }
    else if(mes == 6 || mes == 7 || mes == 8) {
        estacion = "Invierno";
    }
    else if(mes == 9 || mes == 10 || mes == 11) {
        estacion = "Primavera";
    }
    else{
        estacion = "Valor Incorrecto";
    }
    console.log("El valor corresponde a la estacion de: ", estacion);
//Ejercicio 2: Hora del dia
/*
de 6 a 11 nos saluda: Good Morning
de 12 a 16 nos saluda: Good afternoon
de 17 a 19 nos saluda: Good evening
de 20 a 23 nos saluda: Good night
Trabajaremos con 24 hs
*/

let horaDia = 9;
let saludo; //Undefined
if(horaDia >= 6 && horaDia <= 11) {
    saludo = "Good Morning";
    } 
    else if(horaDia >= 12 && horaDia <= 16) {
        saludo = "Good afternoon";
    }
    else if(horaDia >= 17 && horaDia <= 19) {
        saludo = "Good evening";
    }
    else if(horaDia >= 20 && horaDia <= 23) {
        saludo = "Good night";
    }
    else{
        saludo = "Valor Incorrecto";
    }
    console.log("El valor corresponde a: ", saludo);
//Estrucutra Switch (La sintaxis es igual a Java)
switch(mes){//No solo se pueden utilizar numeros, tambien cadenas
    case 1: case 2: case 12://Si el mes es 1, 2 o 12
    estacion = "Verano";
    break;//Si no se pone el break, el programa seguirá ejecutando el siguient
    case 3: case 4: case 5://Si el mes es 3,4,5
    estacion = "Otoño";
    break;//Si no se pone el break, el programa seguirá ejecutando el sigu
    case 6: case 7: case 8://Si el mes es 6,7,8
    estacion = "Invierno";
    break;//Si no se pone el break, el programa seguirá ejecutando el sigu
    case 9: case 10: case 11://Si el mes es 9,10,11
    estacion = "Primavera";
    break;//Si no se pone el break, el programa seguirá ejecutando el sigu
    default:
        estacion = "Valor Incorrecto";
}
console.log("Bienvenido a la estacion de: ", estacion);