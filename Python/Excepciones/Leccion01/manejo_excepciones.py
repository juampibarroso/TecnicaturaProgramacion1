from NumerosIgualesException import NumerosIgualesException

resultado = None # a la variable resultado no la ponemos dentro del bloque ya  que dejaria de ser una varialbe
#global y no la podriamos llamar afuera del bloque y mostrar el resultado

"""Clase padre  Exception """
try:
    #Las variables tambien se pueden colocar aqui; pero solo se podran utilizar en el bloque
    a = int(input("Por favor digite un numero: "))
    b = int(input("Por favor digite un numero: "))
    if a == b:
        raise NumerosIgualesException("Son numeros iguales")
    resultado = a/b # modificamos
except TypeError as e: #Clase hija
    print(f'TypeError - Ocurrio un error: {type(e)}')
except ZeroDivisionError as e:#Clase hija
    print(f'ZeroDivisionError - Ocurrio un error: {type(e)}')
except Exception as e: #Clase padre
    print(f'Exception - Ocurrio un error: {type(e)}')
else:
    print("No se arrojo ninguna excepcion")
finally:#siempre se va a ejecutar
    print("Ejecucion de este bloque finally")

print(f"El resultado es: {resultado}")
print("seguimos...")



