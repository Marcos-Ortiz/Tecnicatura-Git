//Hoy ya no se usa var, se utiliza let y const
let nombre = "Pedro";
console.log(nombre)

const apellido = "Lepes";
//apellido = "Perez" // Error, no se puede reasignar un valor a una constante

//Ampliando el usao de var, let y const

/*
Con var podes reasignar en cualquier momento, este forma 
parte del ambito global
Un error es que se sobreescriba
*/
var nombre1 = "Ariel";
nombre1 = "Osvaldo"

function saludar(){
    var nombre3 = "Natalia";
    console.log(nombre);
}
//console.log(nombre3); // Aqui no lee el dato en la funcion

if(true){
    var edad = 34;
    console.log(edad);
}
console.log(edad); /*Aqui la funcion funciona correctamente, 
                 en la estructura if falló
                 */

/*
let: esta puede ser reasignada en cualquier momento
la diferencia es que su ambito es de bloque,
solo disponible dentro de un bloque de llaves
*/

function saludar2(){
    let nombre2 = "Luis";
    console.log(nombre2);
}
//console.log(nombre2);

if(true){
    let edad2 = 33
    console.log(edad2);
}
//console.log(edad2);

/*
const se utiliza para valores constantes que no pueden ser reasignados
*/

const fechaNacimiento = 2006
console.log(fechaNacimiento);
//fechaNacimiento = 2003;
//console.log(fechaNacimiento); //solo se ejecuta el console.log anterior