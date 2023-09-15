encerrar = ''
votoSegunda = 0
votoTerça = 0
votoQuarta = 0
votoQuinta = 0
votoSexta = 0
print('Digite o número do dia')

while encerrar != 'S':
    voto = int(input('Qual o melhor dia da semana? SEGUNDA DIA:1/TERÇA DIA:2/QUARTA DIA:3/QUINTA DIA:4/SEXTA DIA:5?'))
    if voto == 1:
        votoSegunda = votoSegunda + 1
    elif voto == 2:
        votoTerça = votoTerça + 1
    elif voto == 3:
        votoQuarta = votoQuarta + 1
    elif voto == 4:
        votoQuinta = votoQuinta + 1
    elif voto == 5:
        votoSexta = votoSexta + 1
    else:
        print('Voto inválido')
    encerrar = input('Encerrar? S/N')

dias = [votoSegunda, votoTerça, votoQuarta, votoQuinta, votoSexta]

diasGanhador = dias.index(max(dias))

print(f'Dia ganhador foi o dia {diasGanhador + 1}')

