//Tipo String
var nombre = "Juan"; //Tipo Str
console.log(typeof nombre);
nombre = 7;
console.log(typeof nombre);
nombre = 12.3;
console.log(typeof nombre);
//Tipo Numerico
var numero = 10;    //Tipo Numerico
console.log(typeof numero);
//Tipo Objeto
var objeto = {
    nombre: "Juan",
    apellido: "Perez",
    telefono:  "2615111111"
}
console.log(objeto);

//Tipo de DAtos Booleano
var bandera = true;
console.log(bandera);

//Tipo de DAto Funcion
function miFuncion(){}
console.log(typeof miFuncion);

//Tipo de Datos Symbol
var simbolo = Symbol("mi simbolo");
console.log(simbolo);

//Tipo de Datos Clase (es una FUNCION)
class Persona {
    constructor(nombre, apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(Persona);