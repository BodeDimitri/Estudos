x = 0
y = 0
totalImpares = 0
totalPares = 0
quantidadeX = 0
quantidadeY = 0

for x in range(1,50,2):
    print('VOCÊ ESTÁ DIGITANDO AS NOTAS DOS ALUNOS IMPARES')
    notasImpares = float(input(f'POR FAVOR, INSIRA A NOTA DO ALUNO DE NÚMERO {x}.'))
    totalImpares = totalImpares + notasImpares
    quantidadeX = x + quantidadeX
for y in range(2,50,2):
    print('VOCÊ ESTÁ DIGITANDO AS NOTAS DOS ALUNOS PARES') 
    notasPares = float(input(f'POR FAVOR, INSIRA A NOTA DO ALUNO DE NÚMERO {y}.'))
    totalPares = totalPares + notasPares
    quantidadeY = y + quantidadeY

mediaImpares = totalImpares/quantidadeX
mediaPares = totalPares/quantidadeY

if mediaImpares > mediaPares:
    print('Alunos Impares venceram')
else:
    print('Alunos Pares venceram')