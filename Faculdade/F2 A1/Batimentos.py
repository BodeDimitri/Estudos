idade = int(input(''))
bpm = int(input(''))

if idade <= 2:
    if bpm >= 120:
        if bpm <= 140:
            print('Batimentos normais')
        else:
            print('Batimentos acima do normal')
    else:
        print('Batimentos abaixo do normal')
elif idade >= 8:
    if idade <= 17:
        if bpm >= 80:
            if bpm <= 100:
                print('Batimentos normais')
            else: 
                print('Batimentos acima do normal')
        else:
            print('Batimentos abaixo do normal')
    if idade >= 18:
        if idade <=60:
            if bpm >= 70:
                if bpm <= 80:
                    print('adult seden')
                else:
                    print('Batimentos acima do normal')
            else:
                print('Batimentos abaixo do normal')
        else: 
            if bpm >= 50:
                if bpm <= 60:
                    print('Batimentos normais')
                else:
                    print('Batimentos acima do normal')
            else:
                print('Batimentos abaixo do normal')