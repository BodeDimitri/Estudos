def saber(nome, sobrenome):
    nomecompleto = print(f'Seu nome completo é {nome} {sobrenome}')
    return nomecompleto

nome = str(input('Insira seu nome: '))
sobrenome = str(input('Insira seu sobrenome: '))

saber(nome, sobrenome)