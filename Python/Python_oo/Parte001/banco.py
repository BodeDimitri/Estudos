def contabanco (numero, titular, saldo, limite):
    conta = {'numero': numero, 'titular': titular, 'saldo': saldo, 'limite': limite}
    return conta

def deposita (conta, valor):
    conta['saldo'] += valor

def sacar (conta, valor):
    conta['saldo'] -= valor

def extrato (conta):
    print('Sua conta tem {}'.format(conta['saldo']))

contabanco (123, 'diego', 145, 1000)
