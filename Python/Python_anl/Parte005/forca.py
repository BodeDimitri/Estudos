def jogar():
    print("*********************************")
    print("***Bem vindo ao jogo da Forca!***")
    print("*********************************")

    palavra_secreta = 'chocolate'.upper()
    letras_acertadas = ['_','_','_','_','_','_','_','_','_']
    
    enforcou = False
    acertou = False
    erros = 0

    print(letras_acertadas)

    #True
    while(not acertou and not enforcou): 
            
        chute = input('Escolha uma letra ')
        chute = chute.strip().upper()

        #for vai repetir a quantidade de letras na palavra_secreta por causa do "in".Posicao vai repetir a quantidade de letras da palavra pois ela e repetida pelo for, junto da estrutura "if" vai encontrar exatamente a posicao 
        #da letra, e depois o "for" vai repetir a variavel que mostra as letras acertadas
        if(chute in palavra_secreta):
            posicao = 0
            for letra in palavra_secreta:
                if(chute == letra):
                    letras_acertadas[posicao] = letra
                posicao += 1
        else:
            erros += 1

        enforcou = erros == 6
        acertou = '_' not in letras_acertadas
        print(letras_acertadas)
        
    if(acertou):
        print('Você ganhou!')
    else: 
         print('Você perdeu')
     
    print("Fim do jogo")

if(__name__ == "__main__"):
    jogar()