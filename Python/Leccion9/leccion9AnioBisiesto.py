def es_bisiesto(anio): # type: ignore
    """
    Determina si un año es bisiesto o no.
    Un año es bisiesto si es divisible por 4,
    excepto si es divisible por 100 a menos que también sea divisible por 400.
    """
    if (anio % 4 == 0 and anio % 100 != 0) or (anio % 400 == 0):
        return True
    else:
        return False

continuar = 's'
while continuar.lower() == 's':
    try:
        año_ingresado = int(input("Ingresa un año: "))
        if es_bisiesto(año_ingresado):
            print(f"El año {año_ingresado} es bisiesto. 🎉")
        else:
            print(f"El año {año_ingresado} no es bisiesto. 📅")
    except ValueError:
        print("Por favor, ingresa un número válido para el año. ❌")

    continuar = input("¿Deseas verificar otro año? (s/n): ")

print("¡Hasta luego! 👋")