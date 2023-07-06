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
