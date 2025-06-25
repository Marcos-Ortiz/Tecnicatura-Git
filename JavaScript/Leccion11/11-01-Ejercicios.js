//Evitar repetir tu codigo
//Try dont repeat yoursealf
let days = 1
switch (days){
    case 1:
        console.log("hoy es Lunes");
        break;
    case 2:
        console.log("hoy es Martes");
        break;
    case 3:
        console.log("hoy es Miercoles");
        break;
    case 4:
        console.log("hoy es Jueves");
        break;
    case 5:
        console.log("hoy es Viernes");
        break;
    case 6:
        console.log("hoy es Sabado");
        break;
    case 7:
        console.log("hoy es Domingo");
        break;
    default:
        console.log("Error en el ingreso del dia de la semana")
        break;
}
//Esta es la version mejorada
let days2 = ["Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"]
function getDay(n){
    if(n < 1 || n > 7){
        throw new Error("out of range");
    }
    return days2[n-1];
}
console.log(getDay(5));

// Hacer un ejercicio similar al que esta hecho, pero ahora con los
// meses del año, debes hacerlo con la estructura switch y luego con
// la función en la opción mejorada

// Versión con switch
let month = 3; // Puede variar para probar diferentes meses

switch (month) {
    case 1:
        console.log("El mes es Enero");
        break;
    case 2:
        console.log("El mes es Febrero");
        break;
    case 3:
        console.log("El mes es Marzo");
        break;
    case 4:
        console.log("El mes es Abril");
        break;
    case 5:
        console.log("El mes es Mayo");
        break;
    case 6:
        console.log("El mes es Junio");
        break;
    case 7:
        console.log("El mes es Julio");
        break;
    case 8:
        console.log("El mes es Agosto");
        break;
    case 9:
        console.log("El mes es Septiembre");
        break;
    case 10:
        console.log("El mes es Octubre");
        break;
    case 11:
        console.log("El mes es Noviembre");
        break;
    case 12:
        console.log("El mes es Diciembre");
        break;
    default:
        console.log("Error: Ingresa un número de mes válido (1-12)");
        break;
}

// Esta es la versión mejorada con función y array
let months = ["Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"];

function getMonth(n) {
    if (n < 1 || n > 12) {
        throw new Error("Error: El número de mes está fuera de rango (1-12)");
    }
    return months[n - 1]; // Restamos 1 porque los arrays son de base 0
}

// Ejemplos de uso de la versión mejorada
try {
    console.log("El mes es " + getMonth(7)); // Imprimirá "El mes es Julio"
    console.log("El mes es " + getMonth(1)); // Imprimirá "El mes es Enero"
    console.log("El mes es " + getMonth(12)); // Imprimirá "El mes es Diciembre"
    // console.log(getMonth(0)); // Esto lanzará un error
    // console.log(getMonth(13)); // Esto lanzará un error
} catch (error) {
    console.error(error.message);
}