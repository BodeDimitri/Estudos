
import random
def imprime_mensagem_abertura():
    print("*********************************")
    print("***Bem vindo ao jogo da Forca!***")
    print("*********************************")

def carrega_palavra():
    arquivo = open(r'C:\Users\diego.albino\Documents\GitHubteste\Estudos\Python\Python_anl\Parte006\palavras.txt','r')
    palavras = []
    for linha in arquivo:
        linha = linha.strip()
        palavras.append(linha)
        

    arquivo.close()

    numero = random.randrange(0, len(palavras))
    palavra_secreta = palavras[numero].upper()
    return palavra_secreta

def pede_chute():
    chute = input('Escolha uma letra ')
    chute = chute.strip().upper()
    return chute


