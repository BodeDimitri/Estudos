### Python Collections 1

#### Resumos de comandos para lista:

- **Nunca esqueca: Tupla () e lista []**

- .len() - Retorna a quantidade de caracteres na lista.

- {lista}({posição}) - Retorna o elemento na determinada posição.

- .append({adição}) - Adiciona um elemento a lista no final dela.

- .remove({elemento}) - Remove o elemento. *Se tiver dois número repetidos ele tera preferencia pelo primeiro.*

- .clear - Remove todos os elementos.

- {elemento} in {lista} - Retorna falso ou verdadeiro.

- .insert({posição},{elemento}) - Insere o elemento na posição desejável.

- .extend({elementos}) - Diferente do append aceita mais de um argumento.
  
  ```
  idades_no_ano_que_vem = []
  for idade in idades:
  idades_no_ano_que_vem.append(idade+1)
  ```
  
  Maneira mais simples:
  
  ```
  idades_no_ano_que_vem = [(idade+1) for idade in idades]
  idades_no_ano_que_vem
  ```
  
  > Obrigado Alura pelos exemplos.
  
  Tuplas não usam .append,  são representadas por () e não e possível usar métodos.
  
  E possível usar tuplas e listas juntas, assim:
  
  *Foi criada duas tuplas e depois elas foram colocadas dentro de uma lista, e agora elas são mutáveis foi adicionado uma nova tupla.*
  
  ```
  usuarios = [guilherme, daniela]
  usuarios
  
  [('Guilherme', 37, 1981), ('Daniela', 31, 1987)]
  
  usuarios.append(('Paulo', 39, 1979))
  
  usuarios 
  [('Guilherme',37,1981), ('Daniela',31,1987), ('Paulo',39,1979)]
  ```

#### Herança e Polimorfismo

Não se esqueça que para deixar uma classe privada e só usar o "_" antes

```
    def __init__(self,codigo,saldo):
        self._codigo = codigo
```

Para criar uma classe que herde os métodos de uma classe anteriora e só fazer da seguinte maneira:

```
class ContaCorrente(Conta):

  def passa_o_mes(self):
    self._saldo -= 2
```

Essa classe herda os métodos da classe Conta. 

**Duck Typing = Se faz barulho de pato, então pode ser um pato.**

Se você tem um metodo que você vai definir na classe mãe e que todos vão usar, e so usar abstractmethod

```
from abc import ABCMeta, abstractmethod

class Conta(metaclass=ABCMeta):

  def __init__(self, codigo):
    self.codigo = codigo
    self.saldo = 0

  def deposita(self, valor):
      self._saldo += valor

    @abstractmethod
    def passa_o_mes(self):
      pass
```

Existe o "eq" e usado para comparar objetos criados da seguinte maneira:

```
def __eq__(self, outro):
	return self._codigo == self._codigo
```

isistance() - Serve para verificar se um objeto pertence a uma instancia.

```
isinstance({objeto}, {instancia/classe})
```

---

Maneira muito boa de percorrer uma lista e retornar a posição dela na lista além do número em questão.

```
idades = [15, 87, 32, 65, 56, 32, 49, 37]

for i in range(len(idades)):
  print(i, idades[i])
```

> 0 15
> 1 87
> 2 32
> 3 65
> 4 56
> 5 32
> 6 49
> 7 37

Você também tem uma opção mais fácil que e usar o enumerate() que faz o que o ultimo código fez mas de uma maneira mais fácil.

```
idades = [15, 87, 65, 56, 32, 49, 37]


list(enumerate(idades)


ou


for valor in enumerate(idades)
    print(valor)
```

Existe também como ignorar alguns itens de uma lista, o "_" e usado para ignorar o item na lista

```
usuarios = [
    ("Guilherme", 37, 1981),
    ("Daniela", 31, 1987),
    ("Paulo", 39, 1979)
]

for nome, _, _ in usuarios:
  print(nome)

```

> Guilherme
> Daniela
> Paulo

Sorted() organiza uma lista na sequência.

```
idades = [15, 87, 32, 65, 56, 32, 49, 37]

sorted(idades)
```

> [15, 32, 37, 49, 56, 65, 87]

Reverse() inverte a lista.

Key() e usado para procurar por algo dentro de uma lista

```
def extrai_saldo(conta):
  return conta._saldo

sorted(contas, key=extrai_saldo)
```

Aqui e usado com a tentativa de ordenar em sequencia os saldos, porem o resultado não e exatamente o esperado e por isso usamos o attrgetter. Também usado para extrair informações de algum objeto. 

```
from operator import attrgetter

for conta in sorted(contas, key=attrgetter("_saldo")):
  print(conta)
```

lt/gt (lesser than/greater than) entre dois underlines faz o uso de < e > funcionar enquanto compara objetos.

```
def __lt__(self, outro):
	return self._saldo < outro.saldo
```

> Vai ter o retorno true ou false.

Total ordering implementa funções para organização, permitindo o uso de <= ou => com objetos.

```
from functools import total_ordering

@total_ordering
class ContaSalario: 
```
