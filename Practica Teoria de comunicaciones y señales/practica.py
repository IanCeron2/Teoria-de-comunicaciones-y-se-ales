
from os import system


def menu_principal():
    print("-----------------------------")
    print("1. Secuencias x(n) y h(n)")
    #print("2. Señal de audio")
    print("-----------------------------")
    n = int(input("¿Cúal eliges?: "))
    return n

def menu_operaciones_basicas():
    print("-----------------------------")
    print("a) Suma/Resta")
    print("b) Amplificación/Atenuación")
    print("c) Reflejo")
    print("d) Desplazamiento")
    print("e) Diezmación/Interpolación")
    print("f) Convolución")
    print("-----------------------------")
    n = input("¿Cúal eliges?: ")
    return n

def llenar_secuencia(tamaño_secuencia):
    secuencia = []
    for i in range(tamaño_secuencia):
        valor = input("Valor[{i}]".format(i+1))
        secuencia.append(valor)



n = menu_principal()
if(n == 1):
    a = menu_operaciones_basicas()
    print("--------------------------------------------------------------------------------")
    print("Vamos a llenar los valores de las secuencias x(n) y h(n)")
    print("Ingresa un * antes del valor para indicar que ese es el elemento del indice 0")
    print("                  EJEMPLO: [1, 5, *6, 8, 12]")
    print("De esta manera sabemos que el 6 se encuentra en el indice 0 de esta secuencia")
    print("--------------------------------------------------------------------------------")
    tamaño_s1 = input("¿Cuantos elementos va a tener x(n)?: ")

    if (a == "a"):
        print("hola")