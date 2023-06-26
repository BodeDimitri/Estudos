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


