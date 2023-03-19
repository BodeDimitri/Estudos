class filmes():
    def __init__(self, nome, ano, duracao, likes):
        self.nome = nome.title()
        self.ano = ano
        self.duracao = duracao
        self.likes = 0

    def dar_like(self):
        self.likes += 1

class series():
    def __init__(self, nome, ano, temporadas):
        self.nome = nome
        self.ano = ano
        self.temporadas = temporadas
        self.likes = 0

    def dar_like(self):
        self.likes += 1


filme  = filmes('Senhor dos aneis com o resto errado', 2018, 160, 18)
filme.dar_like()
filme.dar_like()
print(f'Nome do filme: {filme.nome}, Ano: {filme.ano}, Duração: {filme.duracao}, Likes: {filme.likes}')
    