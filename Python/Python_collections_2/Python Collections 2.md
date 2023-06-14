### Python Collections 2

#### Conjuntos:

- Para criar um conjunto simples e usado **{}**

Para copiar listas e possível usar o comando .copy()

```python
usuarios_data_science = [15, 23, 43, 56]
usuarios_machine_learning = [13, 23, 56, 42]


assistiram = usuarios_data_science.copy()
assistiram
```

> 15, 23, 43, 56

set() cria um conjunto de elementos que não podem se repetir, no caso não se repete um número dentro de um conjunto que esta "setado". Lembrando que se a sequencia importa e aconselhável não usar set() por causa da mudança das posições.

```python
codigo = [15, 23, 43, 56, 13, 23, 56, 42]
set(codigo)
```

> {13, 15, 23, 42, 43, 56}

O **|** e usado para fazer a união de dois conjuntos. 

```python
usuarios_data_science = [15, 23, 43, 56]
usuarios_machine_learning = [13, 23, 56, 42]


usuarios_data_science | usuarios_machine_learning
```

> {13, 15, 23, 42, 43, 56}

O **&** significa "e" para fazer a intersecção dos conjuntos.

```python
usuarios_data_science = [15, 23, 43, 56]
usuarios_machine_learning = [13, 23, 56, 42]


usuarios_data_science & usuarios_machine_learning
```

> {23, 56}

O **-** serve pare subtrair um conjunto com o outro.

```python
usuarios_data_science = [15, 23, 43, 56]
usuarios_machine_learning = [13, 23, 56, 42]


usuarios_data_science - usuarios_machine_learning
```

> {15, 43}

O **^** significa o ou, no caso ou você fez um ou outro. Só pode aparecer em um conjunto.

```python
usuarios_data_science = [15, 23, 43, 56]
usuarios_machine_learning = [13, 23, 56, 42]


usuarios_data_science ^ usuarios_machine_learning
```

> {13, 15, 42, 43}



Lembrando que conjuntos são mutáveis, podem ser alterados, adicionados e removíveis.

- .add() para adicionar elementos ao conjunto.

- frozenset() para transformar o conjunto e imutável.

- O set() tambem funciona com strings.

#### Dicionários:

Compostos por chaves e valores. Ele também usa **{}** para representar, mas segue outras estrutura. 

Exemplo da estrutura:

```python
 nomes = {
   "Guilherme" : 1,
  "cachorro" : 2,
  "nome" : 2,
  "vindo" : 1
 }
 
 nomes["Guilherme"]
```

> 1

Também existe a possibilidade de usar .get() para encontrar o elemento em questão.

```python
nomes.get("Diego",0)
```

> 0 / Pois Diego não existe no dicionário.  

```python
nomes.get("Guilherme",0)
```

> 1 / Pois a chave Guilherme existe e esse o valor da mesma.

Para adicionar ou remover uma chave do dicionário e muito simples também.

```python
nomes["Diego"] = 1
```

Assim já foi adicionado, caso queira alterar o valor da chave e muito simples também.

```python
nomes["Diego"] = 2
```

del serve para remover um elemento dentro do dicionário.

```python
del nomes["Diego"]
del dict["chave"]
```

Também e possível saber se um elemento esta no dicionário.

```python
"Bruno" in nomes
```

> False

.values() passa pelos valores das chaves.

```python
for elemento in nomes.values():
  print(elemento)
```

> 1
> 
> 2
> 
> 2
> 
> 1

.items() mostrar os valores da chave junto com o valor.

```python
for elemento in nomes.items():
  print(elemento)
```

> ('Guilherme', 1)
> 
> ('cachorro', 2)
> 
> ('nome', 2)
> 
> ('vindo', 1)

.lower() torna todas as letras em minúsculas da string.

defaultdict() - The Python 
defaultdict type behaves almost exactly like a regular Python dictionary, but if you try to access or modify a missing key, then defaultdict will automatically create the key and generate a default value for it. This makes defaultdict a valuable option for **handling missing keys in dictionaries**. (Fonte - Real Python / Não consegui como descrever de melhor maneira então vou deixar assim mesmo)

```python
from collections import defaultdict
```

Counter() e um comando que serve para contar a quantidade de elementos iteraveis em um dicionário.

```python
from collections import Counter

aparicoes = Counter(meu_texto.split()
```


