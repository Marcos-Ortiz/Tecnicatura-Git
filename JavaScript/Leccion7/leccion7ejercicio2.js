// Print("Estoy cansado jefe") Fecha: 19/5/25
// Averiguar si el usuario es mayor de edad o no
let edad = parseInt(prompt("Ingrese su edad:"));

if (isNaN(edad) || edad < 0) {
  console.log("Por favor ingrese una edad válida.");
} else {
  if (edad >= 18) {
    console.log("Es mayor de edad.");
  } else {
    console.log("Es menor de edad.");
  }
}


