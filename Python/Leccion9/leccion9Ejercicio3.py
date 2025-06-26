# Clase 9 Ejercicio 3: Contador para cada tipo de número
positivos = 0
negativos = 0
neutros = 0

# Pedimos 10 números al usuario
for i in range(10):
    numero = int(input(f"Escribí el número {i+1}: "))

    # Chequeamos si es positivo, negativo o neutro
    if numero > 0:
        positivos += 1
    elif numero < 0:
        negativos += 1
    else:
        neutros += 1
# Mostramos el resultado
print("Cantidad de números positivos:", positivos)
print("Cantidad de números negativos:", negativos)
print("Cantidad de números neutros (cero):", neutros)