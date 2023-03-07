def jogar():
    print("*********************************")
    print("***Bem vindo ao jogo da Forca!***")
    print("*********************************")

    palavra_secreta = 'chocolate'
    letras_acertadas = ['_','_','_','_','_','_','_','_','_']
    
    enforcou = False
    acertou = False

    print(letras_acertadas)

    #True
    while(not acertou and not enforcou): 
            
        chute = input('Escolha uma letra ')
        chute = chute.strip()

        #for vai repetir a quantidade de letras na palavra_secreta por causa do "in".Posicao vai repetir a quantidade de letras da palavra pois ela e repetida pelo for, junto da estrutura "if" vai encontrar exatamente a posicao 
        #da letra, e depois o "for" vai repetir a variavel que mostra as letras acertadas
        posicao = 0
        for letra in palavra_secreta:
            if(chute.upper() == letra.upper()):
                letras_acertadas[posicao] = letra
            posicao = posicao + 1

        print(letras_acertadas)
    print("Fim do jogo")

if(__name__ == "__main__"):
    jogar()