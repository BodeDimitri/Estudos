class Jogador:
    def __init__(self, name_player, hp):
        self.name_player = name_player
        self.hp = hp

class Carta: 
    def __init__(self, name, mana, color):
        self.name = name
        self.mana = mana
        self.color = color
        
    def Jogar(self):
        print(f'A {self.name} foi jogada!.')

class Criatura:
    def __init__(self, name, mana, color, strength, toughness):
        super().__init__(name, mana, color, 'Criatura')
        self.strength = strength
        self.toughness = toughness

    def atacar(self):
        print(f'A {self.name} atacou com força de {self.strength}.')

    def atacar_jogador(self):
        print(f'A {self.name} atacou o {}')

    def bloquear(self):
        print(f'')