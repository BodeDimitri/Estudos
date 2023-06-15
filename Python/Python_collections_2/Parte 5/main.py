from collections import Counter

texto = "Então o que vamos fazer é o seguinte: vamos pegar dois textos, por exemplo eu posso entrar no blog da Alura e pegar textos do blog da Alura. Eu posso pegar um texto que está falando sobre expressões regulares e posso pegar um outro texto de outro assunto, só para não termos dois assuntos similares. Vou pegar um o outro assunto, temos um de programação e um aqui que é de negócios: B2C, B2B, coisas do gênero. Então dois assuntos distintos, um de programação e um não de programação."

texto2 = "Então eu quero copiar o texto em português sobre programação e mais um pouco aqui, copiar tudo isso. Então eu tenho um texto, que é um texto razoável, posso rodar, é um texto sobre programação e vou colocar um texto2 também, três aspas, Enter. E agora um texto sobre B2C, B2B, e por aí vai. Então vou pegar esse texto aqui, e olha, tem bastante texto, tem bastante texto mesmo. Não é programação, então vou copiar todo esse texto, porque não falou de programação. Copiei."


texto_letras = (Counter(texto))
total_letras_conta = sum(texto_letras.values())
proporcoes = [(letra, frequencia / total_letras_conta)for letra, frequencia in texto_letras.items()]
proporcoes = Counter(dict(proporcoes))
mais_comuns = proporcoes.most_common(5)
for caractere, proporcao in mais_comuns:
    print(f"{caractere} => {proporcao * 100:.2f}")