#Video 1
operandoA = 8
operandoB = 5
suma = operandoA + operandoB
print("Resultado de la suma:", suma)
print(f"El resultado de la suma es: {suma}") #interpolacion

#Video 2
resta = operandoA - operandoB
print(f"El resultado de la resta es: {resta}") #interpolacion

multiplicacion = operandoA * operandoB
print(f"El resultado de la multiplicacion es: {multiplicacion}") #interpolacion

division = operandoA / operandoB
print(f"El resultado de la division es: {division}") #interpolacion
division = operandoA // operandoB #Devuelve numeros enteros
print(f"El resultado de la division entera es: {division}") #interpolacion

modulo = operandoA % operandoB #solo muestra el residuo de la division
print(f"El resultado del modulo es: {modulo}") #interpolacion

exponente = operandoA ** operandoB
print(f"El resultado del exponente es: {exponente}") #interpolacion

#Ejercicio Rectangulo
alto = int(input("Proporcione el alto del rectangulo: "))
ancho = int(input("Proporcione el ancho del rectangulo: "))
area = alto * ancho
perimetro = 2 * (alto + ancho)
print(f"El area del rectangulo es: {area}")
print(f"El perimetro del rectangulo es: {perimetro}")

#Video 3
miVariable3 = 10
print(miVariable3) #imprime el valor de la variable

#operadores de reasignacion
miVariable3 = miVariable3 + 1
print(miVariable3) #imprime el valor de la variable

miVariable3 += 1 #es lo mismo que la linea anterior
print(miVariable3) #imprime el valor de la variable

# miVariable# = miVariable3 - 2
miVariable3 -= 2 #es lo mismo que la linea anterior
print(miVariable3) #imprime el valor de la variable

# miVariable = miVariable3 * 3
miVariable3 *= 3 #es lo mismo que la linea anterior
print(miVariable3)

# miVariable = miVariable3 / 2
miVariable3 /= 2 #es lo mismo que la linea anterior
print(miVariable3)

# Video 4
#Operadores de Comparacion
d = 4
b = 2
resultado = d == b #Comparamos si son iguales
print(f"El resultado de la comparacion es: {resultado}") #imprime el resultado d

#Operador diferente
resultado = d != b #Comparamos si son diferentes
print(f"El resultado de la comparacion es: {resultado}") #imprime el resultado d

# Operador mayor que
resultado = d > b
print(f"El resultado de la comparacion es: {resultado}") #imprime el resultado d

# Operador menor que
resultado = d < b
print(resultado)

# Operdador menor o igual que
resultado = d <= b
print(resultado)

# Operador mayor o igual que
resultado = d >= b
print(resultado)

#Ejercicio 1
a = int(input("Digite un numero: "))
print(f"EL residuo de la division es: {a % 2}") #imprime el residuo de la division
if a % 2 == 0:
    print(f"El valor de a es: {a} es un numero PAR")
else:
    print(f"El valor de a es: {a} es un numero IMPAR")


#Ejercicio 2

edadAdulto = 18
edadPersona = int(input("Digite su edad: "))
if edadPersona >= edadAdulto:
    print(f"Su edad es: {edadPersona} años, usted es mayor de edad")
else:
    print(f"Su edad es: {edadPersona} años, usted es menor de edad")