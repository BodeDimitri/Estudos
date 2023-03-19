class filmes():
    def __init__(self, nome, ano, duracao, likes):
        self.__nome = nome.title()
        self.ano = ano
        self.duracao = duracao
        self.__likes = 0

    @property
    def likes(self):
        return self.__likes

    def dar_like(self):
        self.__likes += 1

    @property
    def nome(self):
        return self.__nome
    
    @nome.setter
    def novo_nome(self,novo_nome):
        self.__nome = novo_nome.title()

class series():
    def __init__(self, nome, ano, temporadas, likes):
        self.__nome = nome
        self.ano = ano
        self.temporadas = temporadas
        self.__likes = 0

    def dar_like(self):
        self.likes += 1

    @property
    def likes(self):
        return self.__likes

    def dar_like(self):
        self.__likes += 1

    @property
    def nome(self):
        return self.__nome
    
    @nome.setter
    def novo_nome(self,novo_nome):
        self.__nome = novo_nome.title()

filme  = filmes('Senhor dos aneis com o resto errado', 2018, 160, 0)
serie = series('Outlander', 2017, 50, 0)
filme.dar_like()
filme.dar_like()
serie.dar_like()
serie.dar_like()
serie.dar_like()
serie.dar_like()
print(f'Nome do filme: {filme.nome}, Ano: {filme.ano}, Duração: {filme.duracao}, Likes: {filme.likes}')
print(f'Nome da serie: {serie.nome}, Ano: {serie.ano}, Duração: {serie.temporadas}, Likes: {serie.likes}')