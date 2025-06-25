# Ejercicio 5: Calcular el factorial de un número mayor o igual a 0

# Solicitar al usuario que ingrese un número
num = int(input("Digite un número: "))

# Validar que el número sea mayor o igual a 0
if num >= 0:
    i = 1
    factorial = 1

    while i <= num:
        factorial = factorial * i
        i = i + 1

    print("El factorial es:", factorial)
else:
    print("El número debe ser mayor o igual a 0.")
