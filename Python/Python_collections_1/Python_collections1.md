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
  
  
  
  
