from random import randint

notas_turma = ['João', 8.0, 9.0, 10.0, 'Maria', 9.0, 7.0, 6.0, 'José', 3.4, 7.0, 7.0, 'Cláudia', 5.5, 6.6, 8.0, 'Ana', 6.0, 10.0, 9.5]

nomes = []
notas_juntas = []

for i in range(len(notas_turma)):
    if i % 4 == 0:
        nomes.append(notas_turma[i])
    else:
        notas_juntas.append(notas_turma[i])


notas = []

for i in range(0, len(notas_juntas), 3):
    notas.append([notas_juntas[i], notas_juntas[i+1], notas_juntas[i+2]])

notas[0]
#print(notas)

estudantes = ["João", "Maria", "José", "Cláudia", "Ana"]

def gera_codigo():
    return str(randint(0, 9999))

codigo_estudantes = []

for i in range(len(estudantes)):
    codigo_estudantes.append((estudantes[i], estudantes[i][0] + gera_codigo()))

#print(codigo_estudantes)

notas = [[8.0, 9.0, 10.0], [9.0, 7.0, 6.0], [3.4, 7.0, 7.0], [5.5, 6.6, 8.0], [6.0, 10.0, 9.5]]

def media(lista: list=[0]) -> float:
  
  calculo = sum(lista) / len(lista)

  return calculo

medias = [round(media(nota),1) for nota in notas]
#print(medias)

nomes = [('João', 'J720'), ('Maria', 'M205'), ('José', 'J371'), ('Cláudia', 'C546'), ('Ana', 'A347')]
medias = [9.0, 7.3, 5.8, 6.7, 8.5]

nomes = [nomes[0] for nomes in nomes]

estudantes = list(zip(nomes, medias))
#print(estudantes)

candidatos = [estudante[0] for estudante in estudantes if estudante[1] >= 6.0]
#print(candidatos)

nomes = [('João', 'J720'), ('Maria', 'M205'), ('José', 'J371'), ('Cláudia', 'C546'), ('Ana', 'A347')]
notas = [[8.0, 9.0, 10.0], [9.0, 7.0, 6.0], [3.4, 7.0, 7.0], [5.5, 6.6, 8.0], [6.0, 10.0, 9.5]]
medias = [9.0, 7.3, 5.8, 6.7, 8.5]

situacao = ["Aprovado" if media >= 6 else "Reprovado" for media in medias]
#print(situacao)

cadastro = [x for x in [nomes, notas, medias]]
#print(cadastro)

lista_completa = [[('João', 'J720'), ('Maria', 'M205'), ('José', 'J371'), ('Cláudia', 'C546'), ('Ana', 'A347')],
                  [[8.0, 9.0, 10.0], [9.0, 7.0, 6.0], [3.4, 7.0, 7.0], [5.5, 6.6, 8.0], [6.0, 10.0, 9.5]],
                  [9.0, 7.3, 5.8, 6.7, 8.5],
                  ['Aprovado', 'Aprovado', 'Reprovado', 'Aprovado', 'Aprovado']]

colunas = ['Notas', 'Média final', 'Situação']

        # `{chave}: {valor} for {item} in {lista}`
cadastro = {colunas[i]: lista_completa[i+1] for i in range(len(colunas))}

cadastro['Estudantes'] = [lista_completa[0][i][0] for i in range(len(lista_completa[0]))]

#print(cadastro)

