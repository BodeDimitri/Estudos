notas = {'João': [8.0, 9.0, 10.0], 'Maria': [9.0, 7.0, 6.0], 'José': [3.4, 7.0, 8.0], 'Cláudia': [5.5, 6.6, 8.0], 
 'Ana': [6.0, 10.0, 9.5], 'Joaquim': [5.5, 7.5, 9.0], 'Júlia': [6.0, 8.0, 7.0], 'Pedro': [3.0, 4.0, 6.0]}

try:
    nome = input()
    resultado = notas[nome]
except KeyError:
    print('Estudante não matriculado')
else:
    print(resultado)
finally:
    print('Consulta encerrada')

def media(lista: list=[0]) -> float:
  
  calculo = sum(lista) / len(lista)

  if len(lista) > 4:
      raise ValueError('Não pode haver mais de 4 digitos')

  return calculo

#notas = [4,6,9,9,]
#resultado = media(notas)
#print(resultado)

try:
    notas = [6,7,8,10]
    resultado = media(notas)
except TypeError:
    print('Não foi possivel calcular as medias')
except ValueError as e:
    print(e)
else:
    print(resultado)
finally:
    print('Consulta encerrada')