miVariable = 3
print(miVariable)
miVariable = "Hola a todos los alumnos de la tecnicatura"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x + y
print(z)
print(id(x))
# Las literales se escriben x064(aqui esta guardada la literal x=10)
print(id(y))
print(id(z))
# El resto de variables estan en x808(y=2) y x128(z=x+y)
# En mi caso no han cambiado las direcciones de memoria

# Leccion 2

a: str = 10.77          #a: str es una referencia, 
                        # las variables son dinamicas 
                        # y en cualquier momento pueden cambiar el tipo de valor
print(type(a))

b = True
print(type(b))

# Tipos int, float, String, Bool
x = 10
print (x)
print(type(x))
x = 14.5
print(x)
print(type(x))
x = "Hola Alumnos"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))

# Manejo de Cadenas (String)

miGrupoFavorito = "Metallica,"
caracteristicas = "The Best Rock Band"
print("Mi grupo favorito es:", miGrupoFavorito, caracteristicas) # El simbolo + se está usando para la concatenacion

numero1 = "7"
numero2 = "8"
print(int(numero1) + int(numero2))

# Tipos Booleanos (bool)
# Los booleanos solo pueden ser True o False

miBooleano = 3 > 2
print(miBooleano)

if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")

# Procesar la entrada del usuario
# funcion input

resultado = input("Digite un numero: ") # Input regresa un dato tipo String
print(resultado)

# Conversion de la entrada de datos

numero1 = int(input("Escribe el primer numero: "))
numero2 = int(input("Escribe el segundo numero: "))
resultado = numero1 + numero2
print("El resultado de la suma es:", resultado)
