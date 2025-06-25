# Ciclo For
cadena = "Hello"
for letra in cadena:
    print(letra)
else:
    print("Fin del ciclo for")

#Palabra reservada break
for letra in "Alemania":
    if letra == "a":
        print(f"Letra encontrada: {letra}")
        break #rompe tipos de estrutura al encontrar el elemento buscado
else:
    print("Fin del ciclo for")

#Palabra reservada continue
for i in range(6):
    if i % 2 == 0:
        print(f"Valor: {i}")
else:
    print("Fin")

for i in range(6):
    if i % 2 != 0:
        continue #Ejecuta la siguiente iteracion
        print(f"Valor: {i}")
else:
    print("Fin")