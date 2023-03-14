
class Data:
    def __init__(self, dia, mes, ano):
        self.dia = dia
        self.mes = mes
        self.ano = ano
        
    def mostradata(self):
        print('A data é {}/{}/{}'.format(self.dia, self.mes, self.ano))
        