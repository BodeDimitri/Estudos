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