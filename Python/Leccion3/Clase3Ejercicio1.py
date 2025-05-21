nombre = input("Cual es tu nombre?"); # type: ignore
print("Bienvenido ", nombre);
valoracion = int(input("Como estuvo tu dia (1-10)?"));
if valoracion  == 10:
    print("¡Me alegra que tu día haya sido perfecto!")
elif valoracion  >= 7:
    print("Genial! Parece que tuviste un buen día")
elif valoracion >= 4:
    print("Animo! Mañana será mejor");
else:
    print("No te preocupes! Siempre hay oportunidades para mejorar.")

print("Tu día estuvo de: ", valoracion )
print("Gracias por compartir tu valoracion del dia", nombre);