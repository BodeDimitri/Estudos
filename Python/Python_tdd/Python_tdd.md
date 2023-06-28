## Python TDD

---

**Ambiente Virutal** para não criar conflitos entre outros projetos.

Para criar o ambiente virtual, use o seguinte comando no terminal

```python
>>>pip install virtualenv
>>>python3 -m venv venv 
>>>Get-ExecutionPolicy 
> Restricted
>>>Set-ExecutionPolicy -ExecutionPolicy RemoteSigned -Scope CurrentUser
>>>venv\Scripts\Activate
```

> Obrigado [Gabrielle Andrade Da Silva](https://cursos.alura.com.br/user/gabii12303-net) Pela ótima explicação. no [[Projeto] criar ambiente virtual e ativar a pasta venv | Python e TDD: explorando testes unitários | Alura - Cursos online de tecnologia](https://cursos.alura.com.br/forum/topico-projeto-criar-ambiente-virtual-e-ativar-a-pasta-venv-305463)

Você vai ter certeza que esta no modo venv pois vai aparecer no canto  esquerdo do código.

```python
(venv) PS C:\Users\diego.albino\Documents\GitHubteste\Estudos\Python\Python_tdd\Parte 1> 
```

#### Tipos de Teste:

**Manuais:** 

1. Lentos.

2. Pode passar algo despercebido.

3. Pratico quando e necessário testar poucas vezes.

**Automatizados:**

1. Rápidos.

2. Mais confiáveis.

3. Se for um teste grande vai ser menos maçante responsabilizar uma maquina.
- Teste Unitários - Pega apenas uma parte muito pequena de uma aplicação e a testa.

- Teste de Integração - Teste a integração entre os teste Unitários.

- Teste de Ponta a ponta (E2E) - Testa a aplicação como um todo, como se fosse o cliente.

### **Pytest** - Framkework especializada em testes

- Muitos plugins.

- Escalavel.

- Utilização simples.

```python
pip install pytest
```

**Boa pratica**

E uma boa pratica e de criar um arquivo com todos os pacotes já instalados.

```python
>>>pip freeze > requirements.txt
```

- pip freeze lista todos os pacotes já instalados e eles são redirecionados para o requirements, bem parecido com o Linux.

---

Para armazenar testes temos de criar uma pasta com o nome de *tests* e dentro dela criar um arquivo chamado *\_\_init_\_* .

Para o Pytest reconhecer que e um teste ele tem de estar escrito da segunda maneira, nome do arquivo que vai ser colocado os teste: test_.

E o nome da def: test_

```python
__init__.py
test_{nome}.py
          ↓→
            class TestClass:
                def test_{nome}
```

### Given-When-Then

1. Dado(contexto) - Input, Output esperado e Objeto.

2. Quando(ação) - Chama o método 

3. Então(desfecho) - Usa o assert e verifica se o que esta sendo passado no dado condiz com o contexto.

```python
from codigo.bytebank import Funcionario

class TestClass:
    def test_quando_idade_recebe_13_03_2000_deve_retornar_22(self):
        entrada = '13/03/2000' # Given-Contexto
        esperado = 22

        funcionario_teste = Funcionario('Teste', entrada, 1111)
        resultado = funcionario_teste.idade() # When-ação

        assert resultado == esperado  # Then-desfecho
```

Existe uma alternativa ao Give-When-Then que e o Arrange-Act-Assert:

*"Given-When-Then focuses on behaviour of the system under test: what are we actually trying to do? It prevents our tests from wandering around.*

*The behaviour focus of Given-When-Then nudges us towards treating the thing under test as a black box - whether it’s a function, object, module, or system. This reduces coupling of tests to implementation. We find Given-When-Then more helpful for this than Act-Arrange-Assert, which is more focused on the internal mechanics of the test."* 

> [TDD Heuristics: Given-When-Then or Arrange-Act-Assert](https://www.qwan.eu/2021/09/02/tdd-given-when-then.html)

#### TDD - Test Driven Development

O ciclo do tdd funciona da seguinte maneira:

1. Teste (Você cria um teste para ser feito, vai ser falho pois ainda não existe código feito para isso).

2. Código  (Escreve o código do teste e faz eles funcionarem).

3. Refatoração (Se caso o código do teste funcionar, vai ser necessário melhorar o código).

Após isso recomeça o ciclo mas com uma nova funcionalidade.

- Raise expection({erro}) - Para escrever o erro como quiser.

```python
    def calcular_bonus(self):
        valor = self._salario * 0.1
        if valor > 1000:
            raise Exception('Muito rico para receber mais')
        return valor
```

- with - Ja espera por um expection e vai levar até um expection.

```python
import pytest
...


...
def test_quando_calcular_recebe_10000_deve_retornar_expection(self):
    with pytest.raises(Exception):
        entrada = 10000000

        funcionario_teste = Funcionario('Ana','12/09/1964', entrada)
        resultado = funcionario_teste.calcular_bonus()

        assert resultado 
```

Não se esqueça de importar o pytest. Além disso, já que um erro e o esperado você não vai precisar de um *esperado* e o assert vai ficar da maneira que foi mostrado.

- pytest -k {nome} - Para rodar apenas esse teste

```python
> pytest -k sobrenome
```

--- 

Marks servem para organizarmos nosso teste de melhor maneira e não termos tanto problema para executarmos eles isoladamente, primeiramente importando os marks.

```python
from pytest import mark
```

O Mark e uma tag que esta associado a um teste em especifico ou a um grupo de testes. Ele e escrito da seguinte maneira:

```python
    @mark.calcular_bonus
    def test_quando_calcular_bonus_recebe_1000_retornar_100(self):
        entrada = 1000
        esperado = 100

        funcionario_teste = Funcionario('Ana','12/09/1964', entrada)
        resultado = funcionario_teste.calcular_bonus()

        assert resultado == esperado
```

**@mark.{nome_desejado}**

Para usar o mark nos pytest e só usar o *-m*. Fazendo isso ele vai levar em consideração o mark.

```python
> pytest -m {mark}
```

Além disso o mark tem outras funcionalidades, como as seguintes:

- mark.skip(reasson = "") - Pula esse teste.

- mark.skipif({condicional}reasson= "") - Pula caso siga um condição.

- mark.xfail() - Para falhar caso siga um parâmetro. 

---

pytest.ini - Um arquivo que fica na raiz do seu diretório e é usado para configurar o pytest.

```python
[pytest]
markers = 
    calcular_bonus = Teste
```

---

#### Pytest-cov

```python
>pip install pytest-cov
```

para o pytest-cov fazer os testes você vai seguir os seguintes parâmetros:

```python
pytest --cov={nome_do_arquivo_sem_ponto_extensão} {diretorio_tests}
```

```python
> pytest --cov=bytebank  main/tests 
```

```python
---------- coverage: platform win32, python 3.11.4-final-0 -----------
Name               Stmts   Miss  Cover
--------------------------------------
main\bytebank.py      38      3    92%
--------------------------------------
TOTAL                 38      3    92%
```

Existe também o cover report term-missing que e para checar se todas as funções da classes estão sendo testadas. 

```python
> pytest --cov=bytebank  main/tests --cov-report term-missing
```

Ele retorna as linhas das funções que não foram testadas:

```python
---------- coverage: platform win32, python 3.11.4-final-0 -----------
Name               Stmts   Miss  Cover   Missing
------------------------------------------------
main\bytebank.py      38      3    92%   15, 39, 50
------------------------------------------------
TOTAL                 38      3    92%
```

Existe uma maneira melhor e com mais visual para mostrar o resultado do cov-report usando html com o seguinte comando:

```python
> pytest --cov=bytebank  main/tests --cov-report html
```

Ele vai criar um arquivo chamado de htmlcov com um arquivo html com informações que continha antes no terminal.

Existe uma maneira do cov-report ignorar algumas funções pela criação de um arquivo chamado .covaragerc, que define as opções de como o cov-report vai ser usado. 

**Detalhe: Criar ele na raiz do diretório**

```python
[run]

[report]
exclude_lines = 
    def __str__
    def nome
    def salario
    def _eh_diretor
```

Além de excluir algumas funções de serem testadas como foi mostrada acima, também e possível ja passar uma parte do código que normalmente e usado.

```python
[run]
source = bytebank

[report]
exclude_lines = 
    def __str__
    def nome
    def salario
    def _eh_diretor
```

Além disso e possível a criação de uma nova pasta html.

```python
[run]
source = bytebank

[report]
exclude_lines = 
    def __str__
    def nome
    def salario
    def _eh_diretor

[html]
directory = coverage_relatorio_html
```

---

Mais configurações do .ini pode ser o **adopt**, que toda vez que você executar o pytest o que estive nessa variável será executado também 

```python
[pytest]
adopts = -v --cov=bytebank main/tests --cov-report term-missing
```

Para criar arquivos xml com a saída do terminal

```python
pytest --junitxml {nome_desejado.xml}
```

Ou com cov:

```python
pytest --cov-report xml
```


