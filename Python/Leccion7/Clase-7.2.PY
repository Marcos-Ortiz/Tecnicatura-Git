# Clase 7 Ejercicio 3
# Pedimos al usuario una calificación entre 0 y 10
nota = float(input("Ingresa tu calificación (de 0 a 10):"))

# Evaluamos y asignamos la letra correspondiente
if 9 <= nota <= 10:
    calificacion = "A"
elif 8 <= nota < 9:
    calificacion = "B"
elif 7 <= nota < 8:
    calificacion = "C"
elif 6 <= nota < 7:
    calificacion = "D"
elif 0 <= nota < 6:
    calificacion = "F"
else:
    calificacion = None

# Mostramos el resultado
if calificacion:
    print(f"Tu calificación es: {calificacion}")
else:
    print("El valor ingresado es incorrecto")
