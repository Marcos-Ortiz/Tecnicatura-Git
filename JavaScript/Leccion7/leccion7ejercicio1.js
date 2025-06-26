// Ejercicio 1
//Pedir al usuario un numero limite
//prompt muestra un cuadro de dialogo para ingresar un valor
//parseint convierte valores String a entero
let limite = parseInt(prompt("Ingrese un numero limite: "));

//Verificar si la entrada es un numero valido

//IsNan(limite) verifica si el limite no es un numero (Nan = Not a number)
//limite < 1 -> verifica si el limite es menor a 1
// operador || (o) verifica que si cualquiera de las 2 condiciones es
// verdadera entonces el numero es invalido

if (isNaN(limite) || limite < 1 ) {
    console.log("Por favor ingrese un numero mayor a 0")
} else {
    //bucle for que empieza en 1 y termina en limite
    //i++ aumenta el valor de 1 en 1
    for (let i = 1; i <= limite; i++) {
        //Se usa modulo para saber si el numero i es divisible por 2
        //(o sea, si es par)
        if (i % 2 === 0) {
            console.log(i + " es par");

        } else {
            console.log(i + " es impar")
        }
    }
}
