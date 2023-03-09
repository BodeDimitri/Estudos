#Teste para ver como funciona importar função
def jogar():
    import random
    from functions import imprime_mensagem_abertura
    from functions import carrega_palavra
    from functions import pede_chute

    imprime_mensagem_abertura()
    palavra_secreta = carrega_palavra()

    letras_acertadas = ['_' for letra in palavra_secreta]


    enforcou = False
    acertou = False
    erros = 0

    print(letras_acertadas)

    #True
    while(not acertou and not enforcou): 
            
        chute = pede_chute()

        #for vai repetir a quantidade de letras na palavra_secreta por causa do "in".Posicao vai repetir a quantidade de letras da palavra pois ela e repetida pelo for, junto da estrutura "if" vai encontrar exatamente a posicao 
        #da letra, e depois o "for" vai repetir a variavel que mostra as letras acertadas
        if(chute in palavra_secreta):
            marca_chute_correto(chute, letras_acertadas, palavra_secreta)
        else:
            erros += 1
            desenha_forca()

        enforcou = erros == 6
        acertou = '_' not in letras_acertadas
        print(letras_acertadas)
        
    if(acertou):
        print('Você ganhou!')
    else: 
         print('Você perdeu')
        
    print("Fim do jogo")

def marca_chute_correto(chute,letras_acertadas,palavra_secreta):
    posicao = 0
    for letra in palavra_secreta:
        if(chute == letra):
            letras_acertadas[posicao] = letra
        posicao += 1

def imprime_mensagem_perdedor(palavra_secreta):
    print("Puxa, você foi enforcado!")
    print("A palavra era {}".format(palavra_secreta))
    print("    _______________         ")
    print("   /               \       ")
    print("  /                 \      ")
    print("//                   \/\  ")
    print("\|   XXXX     XXXX   | /   ")
    print(" |   XXXX     XXXX   |/     ")
    print(" |   XXX       XXX   |      ")
    print(" |                   |      ")
    print(" \__      XXX      __/     ")
    print("   |\     XXX     /|       ")
    print("   | |           | |        ")
    print("   | I I I I I I I |        ")
    print("   |  I I I I I I  |        ")
    print("   \_             _/       ")
    print("     \_         _/         ")
    print("       \_______/           ")

def desenha_forca(erros):
    print("  _______     ")
    print(" |/      |    ")

    if(erros == 1):
        print(" |      (_)   ")
        print(" |            ")
        print(" |            ")
        print(" |            ")

    if(erros == 2):
        print(" |      (_)   ")
        print(" |      \     ")
        print(" |            ")
        print(" |            ")

    if(erros == 3):
        print(" |      (_)   ")
        print(" |      \|    ")
        print(" |            ")
        print(" |            ")

    if(erros == 4):
        print(" |      (_)   ")
        print(" |      \|/   ")
        print(" |            ")
        print(" |            ")

    if(erros == 5):
        print(" |      (_)   ")
        print(" |      \|/   ")
        print(" |       |    ")
        print(" |            ")

    if(erros == 6):
        print(" |      (_)   ")
        print(" |      \|/   ")
        print(" |       |    ")
        print(" |      /     ")

    if (erros == 7):
        print(" |      (_)   ")
        print(" |      \|/   ")
        print(" |       |    ")
        print(" |      / \   ")

    print(" |            ")
    print("_|___         ")
    print()

if(__name__ == "__main__"):
    jogar()
