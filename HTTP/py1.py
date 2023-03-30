

dia = str(input(''))
dia_entrega = int(input(''))

dia_semana = ['domingo', 'segunda', 'terca', 'quarta', 'quinta', 'sexta', 'sabado']


dia_d_entrega = (dia_semana.index(dia) + dia_entrega) - 7

if dia_entrega == 0:
    print('chega hoje!')
else:
    if dia_d_entrega == 0 or dia_d_entrega == -7:
        print('sera entregue domingo')
    elif dia_d_entrega == 1 or dia_d_entrega == -6:
        print('sera entregue segunda')
    elif dia_d_entrega == 2 or dia_d_entrega == -5:
        print('sera entregue terca')
    elif dia_d_entrega == 3 or dia_d_entrega == -4:
        print('sera entregue quarta')
    elif dia_d_entrega == 4 or dia_d_entrega == -3:
        print('sera entregue quinta')
    elif dia_d_entrega == 5 or dia_d_entrega == -2:
        print('sera entregue sexta')
    elif dia_d_entrega == 6 or dia_d_entrega == -1:
        print('sera entregue sabado')
