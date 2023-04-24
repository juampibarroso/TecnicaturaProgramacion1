from NumerosIgualesException import NumerosIgualesException

resultado = None



try: 
    a = int(input("Digite el primer numero: "))
    b = int(input("Digite el segundo numero: ")) 
    if a == b:
        raise NumerosIgualesException("Son numeros Iguales")
    resultado= a / b 
except TypeError as e:
    print(f"Ocurrio un eror Type Error: {type(e)}")
except ZeroDivisionError as e:
    print(f"Ocurrio un eror: {type(e)}")
except Exception as e:
    print(f"Ocurrio un error: {type(e)}")
else:
    print(f"No se arrojo ninguna exception")
finally:
    print(f"Ejecucion de este bloque finally")

print(f"El resultado es: {resultado} ")
print(f"Seguimos...")
