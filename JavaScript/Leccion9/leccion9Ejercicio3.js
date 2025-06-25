// Convertir String a number
let miNumero = "10"; // Es una cadena
console.log(typeof miNumero); 
let edad = Number(miNumero) // Esta es una funcion
console.log(typeof edad); 
if(edad >= 18){
    console.log("Puede votar"); 
}
else{
    console.log("Muy joven para votar");
}

let resultado3 = edad >= 18 ? "Puede votar" : "Muy joven para votar"; 
console.log(resultado3); 