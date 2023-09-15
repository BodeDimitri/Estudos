encerrar = ''
alimento = ''
caloriasArm = 0

while encerrar != 'S':
    alimento = input('Qual alimento comeu?')
    calorias = int(input('Quantos calorias o alimento tinha?'))
    caloriasArm = calorias + caloriasArm
    encerrar = input('Deseja encerrar? S/N? ')

 
print(f'Total de calorias foi: {caloriasArm}')