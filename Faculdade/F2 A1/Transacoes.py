encerrar = ''
transacaoTotal = 0
transcoesMedia = 0


while encerrar != 'S':
    transacoes = int(input('Quantas transições realizou ao dia?'))
    encerrar = input('Esta correto o número transações? S/N')
    for x in range(transacoes):
        transacoesCusto = float(input(f'Quanto foi determinada transação de número {x}?'))
        transacaoTotal = transacaoTotal + transacoesCusto
        print(transacaoTotal)

transcoesMedia = transacaoTotal/transacoes
print(transcoesMedia)