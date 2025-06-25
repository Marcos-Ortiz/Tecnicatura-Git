let miNumero = "10"; // Es una cadena
console.log(typeof miNumero); 
let edad = Number(miNumero) // Esta es una funcion
console.log(typeof edad);
//Funcion isNaN
if(isNaN(edad)) { //Is not a number= Devuelve un booleano
    console.log("Esta variable no contiene solo numeros")
}
else{
    if(edad >= 18){
        console.log("Puede votar"); 
    }
    else{
        console.log("Muy joven para votar");
    }  
    }

let resultado3 = edad >= 18 ? "Puede votar" : "Muy joven para votar"; 
console.log(resultado3); 