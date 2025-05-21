# Pedir al usuario un número de mes
mes = int(input("Ingresa un número de mes (1 al 12): "))

# Inicializamos la variable 'estacion' sin valor usando None
estacion = None

# Verificamos que el número esté en el rango correcto
if mes < 1 or mes > 12:
    print("Mes inválido. Debe ser un número entre 1 y 12")
else:
    # Determinamos la estación según el mes (según el hemisferio sur)
    if mes in [1, 2, 3]:
        estacion = "Verano"
    elif mes in [4, 5, 6]:
        estacion = "Otoño"
    elif mes in [7, 8, 9]:
        estacion = "Invierno"
    elif mes in [10, 11, 12]:
        estacion = "Primavera"

    # Mostramos el resultado
    print(f"El mes {mes} corresponde a la estación: {estacion}")
