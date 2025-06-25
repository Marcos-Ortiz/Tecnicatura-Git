# Ejercicio 2: Calcular la suma de "N" primeros numeros.

# Solicitar al usuario un numero entero positivo. 
N = int(input("Ingrese un numero a sumarse: "))

# Inicializar la suma en 0
suma = 0

# Sumar desde 1 hasta N
for i in range(1, N + 1):
    suma += i
   
   # Mostrar el resultado 
    print(f"Sumando {i}, suma actual: {suma}") 