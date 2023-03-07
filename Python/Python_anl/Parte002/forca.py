def jogar():
    print("*********************************")
    print("***Bem vindo ao jogo da Forca!***")
    print("*********************************")

    palavra_secreta = 'chocolate'
    
    enforcou = False
    acertou = False

    #True
    while(not acertou and not enforcou): 
            
        chute = input('Escolha uma letra ')
        chute = chute.strip()

        posicao = 0
        for letra in palavra_secreta:
            if(chute.upper == letra.upper):
                print(f'Encontrei uma {letra} na posição {posicao}')
            posicao = posicao + 1

    print('Jogando')
    print("Fim do jogo")

if(__name__ == "__main__"):
    jogar()
