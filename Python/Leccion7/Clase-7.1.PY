# Pedir la edad al usuario
edad = int(input("Ingresa tu edad: "))

# Inicializamos la variable etapa
etapa = None

# Determinamos la etapa de vida según la edad
if 0 <= edad <= 10:
    etapa = "La infancia es increíble y bella"
elif 11 <= edad <= 19:
    etapa = "Tienes muchos cambios, mucho que estudiar"
elif 20 <= edad <= 29:
    etapa = "Amor y comienza el trabajo"
elif 30 <= edad <= 39:
    etapa = "Etapa de crecimiento profesional y familiar"  # ejemplo agregado
elif 40 <= edad <= 59:
    etapa = "Consolidación personal y reflexión"  # ejemplo agregado
elif edad >= 60:
    etapa = "Disfrutar de la experiencia y la sabiduría"  # ejemplo agregado
else:
    etapa = "Edad no válida"

# Mostrar el resultado
print(f"Etapa de vida: {etapa}")
