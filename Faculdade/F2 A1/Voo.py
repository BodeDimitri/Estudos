valorBruto = int(input(''))
categoria = input('Econômica/Executiva/Primeira Classe')
viajantes = int(input(''))

if categoria == 'Econômica':
    if viajantes == 2:
        print(valorBruto)
        print(0.03 * valorBruto) 
        print((valorBruto) - 0.03 * valorBruto)
    elif viajantes == 3:
        print(valorBruto)
        print(0.04 * valorBruto) 
        print((valorBruto) - 0.04 * valorBruto)
    elif viajantes >= 4:
        print(valorBruto)
        print(0.05 * valorBruto) 
        print((valorBruto) - 0.05 * valorBruto)
elif categoria == 'Executiva':
    if viajantes == 2:
        print(valorBruto)
        print(0.05 * valorBruto) 
        print((valorBruto) - 0.05 * valorBruto)
    elif viajantes == 3:
        print(valorBruto)
        print(0.07 * valorBruto) 
        print((valorBruto) - 0.07 * valorBruto)
    elif viajantes >= 4:
        print(valorBruto)
        print(0.08 * valorBruto) 
        print((valorBruto) - 0.08 * valorBruto)
else:
    if categoria == 'Primeira Classe':
            if viajantes == 2:
                print(valorBruto)
                print(0.10 * valorBruto) 
                print((valorBruto) - 0.10 * valorBruto)
            elif viajantes == 3:
                print(valorBruto)
                print(0.15 * valorBruto) 
                print((valorBruto) - 0.15 * valorBruto)
            elif viajantes >= 4:
                print(valorBruto)
                print(0.20 * valorBruto) 
                print((valorBruto) - 0.20 * valorBruto)