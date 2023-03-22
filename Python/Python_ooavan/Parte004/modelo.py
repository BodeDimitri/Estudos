class Programa():
    def __init__(self, nome, ano, likes):
        self._nome = nome.title()
        self.ano = ano
        self._likes = 0

    @property
    def likes(self):
        return self._likes

    def dar_like(self):
        self._likes += 1

    @property
    def nome(self):
        return self._nome
    
    @nome.setter
    def novo_nome(self,novo_nome):
        self._nome = novo_nome.title()

class filmes(Programa):
    def __init__(self, nome, ano, duracao, likes):
        super().__init__(nome, ano, likes)
        self.duracao = duracao

    def __str__(self):
        return f'{self._nome} - {self.ano} - {self.duracao} -  {self._likes}'

class series(Programa):
    def __init__(self, nome, ano, temporadas, likes):
        super().__init__(nome, ano, likes)
        self.temporadas = temporadas
    
    def __str__(self):
        return f'{self._nome} - {self.ano} - {self.temporadas} -  {self._likes}'
    
class Playlist(Programa):
    def __init__(self, nome, programas):
        self.nome = nome
        self.programas = programas

    def tamanho(self):
        return len(self.programas)
    
filme  = filmes('Senhor dos aneis com o resto errado', 2018, 160, 0)
serie = series('Outlander', 2017, 7, 0)
tmep = filmes('Tudo mundo lele da cuca', 2012, 160, 0)
cuba = series('Serie do Jorge', 2023, 20, 0)

filme.dar_like()
filme.dar_like()
serie.dar_like()
serie.dar_like()
serie.dar_like()
serie.dar_like()


filmes_e_series = [filme, serie, tmep, cuba]
musicas_fim_de_semana = Playlist('Festa', filmes_e_series)


for programa in musicas_fim_de_semana:
    print(programa)

    