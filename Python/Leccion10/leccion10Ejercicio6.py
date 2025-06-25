# Ingreso del número total de elementos
n_elementos = int(input("¿Cuántos números desea ingresar?: "))

# Inicialización de variables
i = 0
suma_pares = 0
suma_impares = 0
conteo_pares = 0
conteo_impares = 0

# Proceso iterativo
while i < n_elementos:
    num = int(input(f"{i + 1}. Digite un número: "))

    if num % 2 == 0:
        print("El número es par")
        suma_pares += num
        conteo_pares += 1
    else:
        print("El número es impar")
        suma_impares += num
        conteo_impares += 1

    i += 1

# Resultados para pares
if conteo_pares != 0:
    print("La suma de los números pares es:", suma_pares)
    print("El conteo de los números pares es:", conteo_pares)
else:
    print("No se han digitado número pares.")

# Resultados para impares
if conteo_impares != 0:
    promedio_impares = suma_impares / conteo_impares
    print("El promedio de impares es:", promedio_impares)
else:
    print("No se han digitado números impares.")