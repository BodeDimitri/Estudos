class Jogador:
    def __init__(self, player, hp):
        self.player = player
        self.hp = hp

class Carta: 
    def __init__(self, name, mana,effect ,color):
        self.name = name
        self.mana = mana
        self.effect = effect
        self.color = color
        
    def jogada(self):
        self.jogada = True
        print(f'A {self.name} foi jogada!.')

    def ativar_efeito(self):
        if self.jogada:
            print(f'O efeito da carta {self.name} foi ativado, seguintes efeitos: {self.effect}.')
        else:
            print(f'A carta {self.nome} não pode ser ativada pois ela ainda não foi usada.')

class Criatura:
    def __init__(self, name, mana, color, player, strength, toughness):
        super().__init__(name, mana, color, player, 'Criatura')
        self.strength = strength
        self.toughness = toughness

    def atacar(self):
        print(f'A {self.name} atacou com força de {self.strength}.')

    def atacar_jogador(self):
        print(f'A {self.name} atacou o {self.player}')

    def bloquear(self):
        print(f'')