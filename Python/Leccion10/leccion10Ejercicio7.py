# Inicialización de variables
suma = 0

# Bucle para 5 empleados
for i in range(1, 6):
    print(f"Salario del empleado {i}")
    horas = float(input("Digite las horas trabajadas: "))
    tarifa = float(input("Digite la tarifa por hora: "))

    salario = horas * tarifa
    print(f"El salario es: ${salario:.2f}")

    suma += salario

# Resultado final
print(f"La suma de todos los salarios es: ${suma:.2f}")
