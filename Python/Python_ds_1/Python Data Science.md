*Contexto, eu fiz o curso de Orientação a Objeto antes do de Data Science, sendo que o de Data Science deveria ser feito antes, então vou escrever bastante coisa "básica".*

**Print()** - Bonitão e o famoso que imprimi o que você passar a ele, número, string, variável. São separados por uma virgula se passar mais de um valor.

**Variaveis** - Em Python, as variáveis são usadas para armazenar dados e atribuir-lhes um nome. Elas são usadas para representar valores que podem ser modificados ao longo do programa. Ao declarar uma variável, é atribuído um valor a ela usando o operador de atribuição (=). Python é uma linguagem de tipagem dinâmica, o que significa que o tipo de uma variável é determinado pelo valor que ela contém. As variáveis podem ser usadas para armazenar números, strings, listas, objetos e outros tipos de dados, e podem ser manipuladas e utilizadas em cálculos e operações dentro do programa.

Não são aceito variáveis que começam com número no Python, usar o espaço, e usar funções ja definidas do Python.

### Tipos de Variáveis: 

| Tipo de Variável | Exemplo           | Descrição                                                                               |
|------------------|-------------------|-----------------------------------------------------------------------------------------|
| Inteiro (int)    | 5, -10, 1000      | Armazena números inteiros                                                               |
| Ponto flutuante  | 3.14, -0.5, 2.0   | Armazena números decimais                                                               |
| (float)          |                     |                                                                                         |
| String (str)     | "Olá, mundo!",    | Armazena texto                                                                          |
|                  | "Python é         |                                                                                         |
|                  | incrível!"        |                                                                                         |
| Booleano (bool)  | True, False       | Armazena valores verdadeiro ou falso                                                    |
| Lista (list)     | [1, 2, 3],        | Armazena uma coleção ordenada de itens                                                  |
|                  | ["maçã", "laranja"|                                                                                         |
|                  | , "banana"]       |                                                                                         |
| Tupla (tuple)    | (1, 2, 3)         | Armazena uma coleção ordenada de itens imutáveis                                        |
| Dicionário (dict)| {"nome": "João",  | Armazena uma coleção de pares chave-valor                                               |
|                  | "idade": 25}      |                                                                                         |
| Conjunto (set)   | {1, 2, 3},        | Armazena uma coleção de elementos únicos, sem uma ordem específica                      |
|                  | {"maçã", "laranja"|                                                                                         |
|                  | , "banana"}       |                                                                                         |


Também se quiser descobrir qual o tipo de uma variável use **type().** 

### Tipos de Operadores:

| Operador   | Descrição                                                |
|------------|----------------------------------------------------------|
| +          | Soma dois valores ou concatena duas strings              |
| -          | Subtrai um valor de outro ou nega um número              |
| *          | Multiplica dois valores ou repete uma string             |
| /          | Divide um valor por outro                                 |
| %          | Retorna o resto da divisão de um valor por outro          |
| //         | Realiza a divisão inteira de um valor por outro           |
| **         | Calcula a potência de um número                           |
| =          | Atribui um valor a uma variável                           |
| ==         | Verifica igualdade entre dois valores                     |
| !=         | Verifica se dois valores são diferentes                   |
| >          | Verifica se um valor é maior que outro                    |
| <          | Verifica se um valor é menor que outro                    |
| >=         | Verifica se um valor é maior ou igual a outro             |
| <=         | Verifica se um valor é menor ou igual a outro             |
| and        | Operador lógico "E" que retorna True se ambas as condições forem verdadeiras |
| or         | Operador lógico "OU" que retorna True se pelo menos uma das condições for verdadeira |
| not        | Operador lógico "NÃO" que inverte o valor de uma expressão lógica |
| in         | Verifica se um valor está presente em uma sequência       |
| not in     | Verifica se um valor não está presente em uma sequência   |

#### Métodos: 
Esse e o padrão para usar métodos *Objeto.metodo()*, as vezes ele recebe algum parâmetro entre as parênteses e as vezes não.

| Método        | Descrição                                                                                 |
|---------------|-------------------------------------------------------------------------------------------|
| capitalize()  | Retorna a string com o primeiro caractere em maiúsculo e os demais em minúsculo            |
| lower()       | Retorna a string com todos os caracteres em minúsculo                                      |
| upper()       | Retorna a string com todos os caracteres em maiúsculo                                      |
| swapcase()    | Inverte o caso de cada caractere na string, tornando os caracteres maiúsculos em minúsculos e vice-versa |
| title()       | Retorna a string com a primeira letra de cada palavra em maiúsculo                         |
| strip()       | Remove espaços em branco no início e no final da string                                    |
| lstrip()      | Remove espaços em branco no início da string                                               |
| rstrip()      | Remove espaços em branco no final da string                                                |
| replace()     | Substitui ocorrências de um determinado caractere ou substring por outra                   |
| join()        | Concatena os elementos de uma sequência (como uma lista) usando a string como separador    |
| split()       | Divide a string em uma lista de substrings com base em um separador                        |
| splitlines()  | Divide a string em uma lista de substrings em cada quebra de linha                         |
| center()      | Centraliza a string em um campo de largura especificada                                    |
| ljust()       | Alinha a string à esquerda em um campo de largura especificada                             |
| rjust()       | Alinha a string à direita em um campo de largura especificada                              |
| zfill()       | Preenche a string com zeros à esquerda até alcançar o comprimento especificado             |

Também existe um comando que leva em consideração a tabela ASCII. **chr()** o número passado como parâmetro sera retornado como uma letra ou símbolo baseado na tabela.

#### Entrada de Dados (Input)
O input em Python é uma função que permite que o usuário forneça dados interativos durante a execução de um programa. Ele exibe uma mensagem na tela, solicitando uma entrada do usuário, e aguarda até que o usuário insira um valor e pressione Enter. O valor digitado pelo usuário é então retornado como uma string e pode ser armazenado em uma variável para ser usado posteriormente no programa. O **input()** é uma maneira poderosa de interagir com o usuário e tornar os programas mais dinâmicos e flexíveis, permitindo que dados sejam inseridos durante a execução.

Ele também aceita que você especifique qual tipo de dados vai ser entrado: 

- Inteiros - int()
>int(input())
 
- Float - float()
>float(input())

- String - str()
>str(input())

- Booleano - bool()
>bool(input())

Para inserir uma variavel em um print e só usar o printf, da seguinte maneira:
````python
nome = Diego
print(f'Meu nome e {nome}')
>Meu nome e Diego
`````
---
#### Condicionais (if e else):
O `if` e `else` são estruturas condicionais em Python usadas para controlar o fluxo do programa com base em uma condição.

O `if` é usado para verificar se uma condição é verdadeira. Se a condição for verdadeira, o bloco de código indentado abaixo do `if` será executado. Caso contrário, o bloco de código será ignorado e a execução do programa passará para a próxima linha de código após o bloco `if`.

O `else` é opcional e é usado em conjunto com o `if`. Ele permite definir um bloco de código a ser executado quando a condição do `if` for falsa. Se a condição do `if` for verdadeira, o bloco de código do `else` será ignorado.
`````python
if {condição}:
	código se verdadeiro
else:
	código se falso
`````
#### Elif: 
O `elif` é uma abreviação para "else if" em Python. Ele é usado em conjunto com o `if` e o `else` para adicionar mais condições ao fluxo do programa. O `elif` permite verificar múltiplas condições consecutivas após um `if`, e se nenhuma das condições anteriores for verdadeira, ele verifica a próxima condição `elif`.Se alguma das condições `elif` for verdadeira, o bloco de código correspondente será executado e o restante das condições `elif` e o `else` serão ignorados.
````python
nota = 85

if nota >= 90:
    print("Sua nota é A.")
elif nota >= 80:
    print("Sua nota é B.")
elif nota >= 70:
    print("Sua nota é C.")
else:
    print("Sua nota é abaixo de C.")

`````

O `elif` é útil quando há várias condições possíveis e você deseja verificar cada uma delas em ordem até encontrar uma que seja verdadeira. Ele permite criar uma lógica condicional mais complexa em seu programa.

#### Operadores lógicos (and, or e not):

| Operador | Descrição                                                                       |
|----------|---------------------------------------------------------------------------------|
| and      | Retorna True se todas as expressões lógicas forem verdadeiras                   |
| or       | Retorna True se pelo menos uma das expressões lógicas for verdadeira             |
| not      | Inverte o valor de uma expressão lógica, retornando False se for verdadeira      |

Esses operadores são amplamente utilizados para combinar e modificar o resultado de expressões lógicas em Python, permitindo criar lógica condicional mais complexa.

#### Estruturas de laços(while e for):

Os laços `while` e `for` são estruturas de controle em Python utilizadas para repetir um bloco de código várias vezes.

O laço `while` executa um bloco de código repetidamente enquanto uma condição especificada for verdadeira. A condição é verificada antes de cada iteração do laço. Se a condição for verdadeira, o bloco de código é executado. Quando a condição se torna falsa, o laço é interrompido e a execução do programa continua. O laço `while` é útil quando não se sabe o número exato de iterações necessárias.
```python
# Laço while
contador = 0
while contador < 5:
    print("Contador:", contador)
    contador += 1
```
O laço `for` é utilizado para iterar sobre uma sequência de elementos, como uma lista, uma string ou um intervalo numérico. Ele percorre cada elemento da sequência e executa um bloco de código para cada iteração. O laço `for` é útil quando se sabe a quantidade exata de iterações necessárias ou quando se deseja percorrer uma sequência de elementos
```python
# Laço for
nomes = ["Alice", "Bob", "Carlos", "Daniela"]
for nome in nomes:
    print("Nome:", nome)
```
Também e possível usar for com `range()` {início, fim, passo}
````python
for x in range(1,11):
	print(x)
`````
#### Operadores de atribuição:

=	Atribuição simples, atribui um valor a uma variável
+=	Atribuição de adição, adiciona o valor à variável e atribui o resultado
-=	Atribuição de subtração, subtrai o valor da variável e atribui o resultado
\*=	Atribuição de multiplicação, multiplica o valor à variável e atribui o resultado
/=	Atribuição de divisão, divide o valor da variável e atribui o resultado
%=	Atribuição de módulo, atribui o resto da divisão à variável
//=	Atribuição de divisão inteira, divide a variável e atribui o resultado como inteiro
\*\*=	Atribuição de exponenciação, atribui o valor elevado à potência à variável
&=	Atribuição bit a bit AND, realiza a operação AND bit a bit e atribui o resultado
|=	Atribuição bit a bit OR, realiza a operação OR bit a bit e atribui o resultado
^=	Atribuição bit a bit XOR, realiza a operação XOR bit a bit e atribui o resultado
\>\>=	Atribuição de deslocamento à direita, realiza o deslocamento à direita e atribui o resultado
<<=	Atribuição de deslocamento à esquerda, realiza o deslocamento à esquerda e atribui o resultado

Esses operadores de atribuição em Python permitem realizar operações matemáticas ou bit a bit e atribuir o resultado a uma variável de forma concisa. Eles são úteis para simplificar a manipulação e atualização de valores em variáveis.

---
#### Estrutura de Dados (listas, dicionários e arrys):

- Listas: As listas são coleções ordenadas e mutáveis de elementos em Python. Elas podem conter elementos de diferentes tipos e permitem a adição, remoção e modificação dos elementos. Os elementos em uma lista são acessados por meio de um índice inteiro, onde o primeiro elemento possui índice 0. Também tem índices negativos que começa do final e vai para o começo, quando se começa dessa maneira o primeiro valor e [-1].
````python
Exemplo de lista
frutas = ["maçã", "banana", "laranja", "abacaxi"]
print(frutas)  # Saída: ["maçã", "banana", "laranja", "abacaxi"]

Acessando elementos da lista
print(frutas[0])  # Saída: "maçã"
print(frutas[2])  # Saída: "laranja"

Modificando elementos da lista
frutas[1] = "morango"
print(frutas)  # Saída: ["maçã", "morango", "laranja", "abacaxi"]

Adicionando elementos à lista
frutas.append("uva")
print(frutas)  # Saída: ["maçã", "morango", "laranja", "abacaxi", "uva"]

Removendo elementos da lista
frutas.remove("laranja")
print(frutas)  # Saída: ["maçã", "morango", "abacaxi", "uva"]
````
- Dicionários: Os dicionários são coleções não ordenadas de pares chave-valor em Python. Cada elemento em um dicionário é mapeado por uma chave exclusiva para um valor correspondente. Os dicionários são mutáveis, permitindo adicionar, remover e modificar os pares chave-valor. Eles são úteis para representar associações ou mapeamentos de informações.
````python
Exemplo de dicionário
aluno = {"nome": "João", "idade": 20, "curso": "Engenharia"}
print(aluno)  # Saída: {"nome": "João", "idade": 20, "curso": "Engenharia"}

Acessando valores do dicionário
print(aluno["nome"])  # Saída: "João"
print(aluno["idade"])  # Saída: 20

Modificando valores do dicionário
aluno["idade"] = 21
print(aluno)  # Saída: {"nome": "João", "idade": 21, "curso": "Engenharia"}

Adicionando novos pares chave-valor ao dicionário
aluno["nota"] = 8.5
print(aluno)  # Saída: {"nome": "João", "idade": 21, "curso": "Engenharia", "nota": 8.5}

Removendo um par chave-valor do dicionário
del aluno["curso"]
print(aluno)  # Saída: {"nome": "João", "idade": 21, "nota": 8.5}
`````
- Arrays: Arrays em Python são estruturas de dados que armazenam elementos de um único tipo de dado de forma contígua na memória. Eles são mais adequados para operações numéricas eficientes e manipulação de grandes quantidades de dados. Ao contrário das listas, os arrays exigem que todos os elementos tenham o mesmo tipo de dado.
````python
import array

Exemplo de array de inteiros
numeros = array.array("i", [1, 2, 3, 4, 5])
print(numeros)   Saída: array('i', [1, 2, 3, 4, 5])

Acessando elementos do array
print(numeros[0])   Saída: 1
print(numeros[2])   Saída: 3

Modificando elementos do array
numeros[1] = 10
print(numeros)   Saída: array('i', [1, 10, 3, 4, 5])

Operações numéricas com arrays
soma = sum(numeros)
print(soma)   Saída: 23

Manipulação de grandes quantidades de dados com arrays
big_array = array.array("d", range(10**6))   Array com 1 milhão de elementos
print(len(big_array))  
`````
Em resumo, as listas são coleções ordenadas e mutáveis, os dicionários são coleções de pares chave-valor e os arrays são estruturas de dados eficientes para operações numéricas e manipulação de grandes quantidades de dados. Cada uma dessas estruturas de dados tem suas próprias características e usos específicos, permitindo armazenar e manipular dados de diferentes maneiras.

**list:**

| Operação                  | Descrição                                                                 |
|---------------------------|---------------------------------------------------------------------------|
| `lista.append(elemento)`  | Adiciona um elemento ao final da lista                                     |
| `lista.insert(i, elemento)`| Insere um elemento em uma posição específica da lista                      |
| `lista.remove(elemento)`  | Remove a primeira ocorrência do elemento na lista                          |
| `lista.pop(i)`            | Remove e retorna o elemento na posição específica da lista                 |
| `lista.index(elemento)`   | Retorna o índice da primeira ocorrência do elemento na lista                |
| `lista.count(elemento)`   | Retorna o número de ocorrências do elemento na lista                        |
| `lista.sort()`            | Ordena os elementos da lista em ordem crescente                            |
| `lista.reverse()`         | Inverte a ordem dos elementos da lista                                     |
| `lista.copy()`            | Cria uma cópia rasa (shallow copy) da lista                                 |
| `lista.clear()`           | Remove todos os elementos da lista                                         |
| `len(lista)`              | Retorna o número de elementos na lista                                     |
| `lista[i]`                | Acessa o elemento na posição `i` da lista (índices negativos contam a partir do final da lista) |

Essas operações permitem adicionar, remover, modificar e acessar elementos em uma lista de forma eficiente. Elas são úteis para manipular e transformar listas de acordo com as necessidades do programa.

**dict:**

| Operação                           | Descrição                                                                                                 |
|------------------------------------|-----------------------------------------------------------------------------------------------------------|
| `dicionario[chave]`                | Acessa o valor associado à chave no dicionário                                                              |
| `dicionario[chave] = valor`         | Adiciona ou atualiza um par chave-valor no dicionário                                                       |
| `del dicionario[chave]`             | Remove o par chave-valor com a chave especificada do dicionário                                              |
| `chave in dicionario`               | Verifica se a chave está presente no dicionário                                                             |
| `dicionario.keys()`                 | Retorna uma lista contendo todas as chaves do dicionário                                                     |
| `dicionario.values()`               | Retorna uma lista contendo todos os valores do dicionário                                                    |
| `dicionario.items()`                | Retorna uma lista contendo todos os pares chave-valor do dicionário como tuplas                              |
| `dicionario.get(chave, valor_padrao)`| Retorna o valor associado à chave, ou um valor padrão se a chave não existir no dicionário                  |
| `dicionario.update(outro_dicionario)`| Atualiza o dicionário com pares chave-valor de outro dicionário                                              |
| `dicionario.copy()`                 | Cria uma cópia superficial (shallow copy) do dicionário                                                     |
| `dicionario.clear()`                | Remove todos os pares chave-valor do dicionário                                                             |
| `len(dicionario)`                   | Retorna o número de pares chave-valor no dicionário                                                         |

Essas operações permitem adicionar, remover, atualizar e acessar pares chave-valor em um dicionário de forma eficiente. Elas são úteis para manipular e extrair informações estruturadas associadas a chaves específicas.
