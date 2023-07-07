import numpy as np
import matplotlib
from random import choices
from random import randrange
import math

lista = [8, 12, 54, 23, 43, 1, 90, 87, 105, 77]

print(choices(lista))

print(randrange(0,100))

print(math.pow(3,9))

#----

#participantes = int(input())

#sorteio  = 

print(f"Olá, Diego , o seu token de acesso é {randrange(1000,9998)}! Seja bem-vindo(a)!")

frutas = ["maçã", "banana", "uva", "pêra", 
          "manga", "coco", "melancia", "mamão",
          "laranja", "abacaxi", "kiwi", "ameixa"]

print(choices(frutas))

#----

def is_integer(n):
    return isinstance(n, int)

numeros = [2, 8, 15, 23, 91, 112, 256]

for x in numeros:
    print(math.sqrt(x))
    conta = x//1 == x
    print(conta)
    if conta is True:
        print()

#---