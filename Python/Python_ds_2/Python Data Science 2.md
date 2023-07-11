**Bibliotecas**: Conjuntos de funções para ser usado em determinado caso, encurta seu serviço pois as vezes algo que iria ser programado já foi escrito e virou uma biblioteca. Para isso recorremos ao gerenciador de bibliotecas o `pip`, sempre usamos esse padrão para instalar.
````python
!pip install {nome_da_biblioteca}
`````
E possível instalar uma versão em especifico de uma biblioteca, seguindo o seguinte padrão:
````python
!pip install {nome_da_biiblioteca}=={versão}
`````
**import** -  Não basta apenas baixar a biblioteca e não utilizar ela, para isso existe o comando `import` que permite a biblioteca ser usada no código. O import e sempre feito no começo do código
````python
import {nome_da_variavel}
`````
**import as** - Serve para você dar um apelido(alias).
````python
import matplotlib.pyplot as plt
`````
Metaplotlib e a biblioteca e depois do ponto o pyplot e o submodulo.
Agora você não precisa digitar todo o texto, apenas digitando `plt` ja vai chamar a biblioteca com o submodulo.
````python
plt.show()
`````
**from import** - Serve para trazer apenas um metodo da biblioteca em questão. Quando referenciado dessa maneira não e preciso informar a biblioteca
````python
from random import choices
`````
```python
from math import ceil

receita = 1000
unidade = 15

print(f" A empresa vendeu aproximadamente {ceil(receita/unidade)} unidades")
`````
Da biblioteca random ele importa apenas a função método, isso e usado pois nem sempre vamos usar todos os métodos de uma biblioteca e dependendo do peso dela, pode pesar mais no arquivo.

---
**Funções:** Recebe parâmetros que retorna valores baseado no código dentro da função. 
Funções podem receber parâmetros, como também podem não receber. Lembrando que as variáveis tem escopo de função, uma variável que foi criada dentro da função, apenas vai prevalecer enquanto dentro da função.
Quando e necessário o retorno de um valor da função, usamos o `return` seguido do que será retornado.

**Built-in function:** Funções que já estão integradas ao Python, não precisam ser importadas.

- sum() - Soma todos os elementos iteráveis ou elementos passados.
- len() - Retorna a quantidade de elementos iteráveis de uma lista.
- round() - Arredonda o número passado.
- map - Aplica uma função em cada item de uma lista ou item.
- `map(function, iterable, [iterable 2, iterable 3, ...])`
- 
**Função Lambda:** Não possui nome e pode ser escrita em apenas uma linha.
````python
lambda <variavel>: <empressao>
`````
Normalmente ele não retorna o valor que nos conseguimos ler, ele retorna mais o menos `map at {onde_foi_salvo}` Para retornar ele de uma maneira que seja legível para nos usamos um **list()** antes do Lambda.
`````python
temp_celsius = [0, 25, 37, 78, 100]
temp_fahrenheit = list(map(lambda x: (x * 9/5) + 32, temp_celsius))
temp_fahrenheit
`````
-- Alura

---
**Listas Aninhadas:** São basicamente listas de listas, a lista e separada por colchetes e virgula.
```python
[[a1, a2,...,an], [b1, b2,...,bn], ..., [n1, n2,...,nn]]
`````
Para acessar uma lista dentro de uma lista e somente usar dois colchetes. Que segue a hierarquia de o primeiro colchete ser o que engloba as outras listas.
````python
[[8.0, 9.0, 10.0], [9.0, 7.0, 6.0], [3.4, 7.0, 7.0], [5.5, 6.6, 8.0], [6.0, 10.0, 9.5]]

notas[0][2]
> 10.0
`````
**Tulpas:** E um tipo de estrutura de dados, mas são representadas por `()` e não podem ser alteradas e são iteráveis.
Podem ser acessados da seguinte maneira:
````python
print(cadastro[0])
`````
**range(len())** - Permite a você iterar por uma sequencia por cada item com a ajuda do index.
````python
nomes = ['Diego', 'Guilherme', 'Nicolas']
for i in range(len(nomes)):
    print(nomes[i])
> Diego, Guilherme, Nicolas
`````
**List comprehension[]** - E uma lista que vai ser percorrida por uma determinada expressão.
`{expressão} for {item} in {lista}`
`[media(nota) for nota in notas]`
Também e possível inserir uma condição:
`{expressões} for {item} in {lista} if {condição}`
Com if e else:
`[{resultado_if} if c{ond} else {resultado_else} for {item} in {lista}]`

**zip()** - Pareia duas tulplas ou lista, como o primeiro com o primeiro, segundo com o segundo. Use **list()** no caso de retornar o zip como *zip at {varios_numeros}*.
````python
a = ("John", "Charles", "Mike")  
b = ("Jenny", "Christy", "Monica")  
  
x = zip(a, b)
> John Jenny, Charles Christy, Mike Monica
`````
E possível fazer o caminho reverso com o zip, transformando uma tupla em duas ou mais listas. E só usar `(*)` no canto esquerdo e depois informar a tupla.
Criando listas com as listas `x for x in [{listas}]`.

**dict comprehension{}** - E o list comprehension do dicionário. *chaves: Colunas que identificam o tipo de dado* e *valores: listas que os dados nelas correspondem as chaves*
`{{chave}: {valor} for {item} in {lista}}`
> {'Notas': [[8.0, 9.0, 10.0], [9.0, 7.0, 6.0], [3.4, 7.0, 7.0], [5.5, 6.6, 8.0], [6.0, 10.0, 9.5]], 'Média final': [9.0, 7.3, 5.8, 6.7, 8.5], 'Situação': ['Aprovado', 'Aprovado', 'Reprovado', 'Aprovado', 'Aprovado']}
> 

---
**Exceções:** Erros na execução do programa, interrompe o programa.
**Try...Except** - Código que vai ser executado, caso alguma exceção surgir ele sera finalizado. O `Except` e o complemento do `Try`, ele apenas rodara se o `Try` falhar.
````python
try:
	<código>
except: {Tipo_de_erro}
	<mensagem_de_erro>
`````
**Try...Except...Else** - Else vai ser usado caso não ocorra exceções.
````python
try:
	<código>
except: {Tipo_de_erro}
	<mensagem_de_erro>
else:
	<se_não_houver_exceção>
`````
**Try...Except...Else...Finally** - Roda essa parte do código independente de ter ocorrido exceção ou não.
````python
try:
	<código>
except: {Tipo_de_erro}
	<mensagem_de_erro>
else:
	<se_não_houver_exceção>
finally:
	<roda_essa_parte_independente_do_resultado>
`````
**Raise** - Se uma condição não for atingida você pode usar o *raise* seguindo de um erro.
````python
raise {erro}
`````
Exemplo:
````python
  if len(lista) > 4:

      raise ValueError('Não pode haver mais de 4 digitos')
`````
