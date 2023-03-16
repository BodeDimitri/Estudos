
class Conta:
    def __init__(self, numero, titular, saldo, limite):
        print('Construindo objeto...{}'.format(self))
        self.__numero = numero
        self.__titular = titular
        self.__saldo = saldo
        self.__limite = limite

    def extrato(self):
        print('Saldo {} do titular {}'.format(self.__saldo, self.__titular))

    def deposita(self, valor):
        self.__saldo += valor

    def __pode_sacar(self, valor):
        valor_disponivel = (self.__saldo + self.limite)
        return valor <= valor_disponivel
        
    def saco(self, valor):
        if (self.__pode_sacar(valor)):
            self.__saldo -= valor
            print('Transferencia no valor de {} concluida'.format(valor))
        else:
            print('Não vai dar não, o {} passou do limite'.format(valor))

    def transfere(self, valor, destino):
        self.saco(valor)
        destino.deposita(valor)
    
    def get_saldo(self):
        return self.__saldo
    
    def get_titular(self):
        return self.__titular
    
    @property
    def limite(self):
        return self.__limite
    
    @limite.setter
    def limite(self, limite):
        self.__limite = limite

    @staticmethod
    def codigo_banco():
        return {'BB': '001', 'Caixa': '104', 'Bradesco':'237'}