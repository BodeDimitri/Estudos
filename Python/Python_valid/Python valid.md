### Python valid

#### Factory Method:

Cria objetos tendo em vista que as subclasses decidiram qual classe instanciar 

```python
class Documento:

    @staticmethod
    def cria_documentos(documento):
        if len(documento) == 11:
            return DocCpf(documento)
        elif len(documento) == 14:
            return DocCnpj(documento)
        else:
            raise ValueError("Quantidade de dígitos esta incorreta")
```

Nesse trecho de código esta sendo definido se a classe a ser instanciada sera a DocCpf ou DocCnpj, baseando na quantidade de números que foram passados. 

> Classes>subclasses>objetos.

---

#### Regex:

- [] Define range e número de caracteres. 

> [0-9; [a-z]; [abc]

- \* Marca nenhuma, uma ou mais ocorrência

> sol*

- {} Quantidade de repetições de uma ocorrência

> [abc]{5}

- \d Qualquer número de 0 até 9

> \d

- \w Qualquer número, qualquer letra e incluindo underline

> \w

- | Um ou outro

> @|\

- () Captura e agrupa - Relação com o find

> (\w{4})

**re.findall** - Vai retornar todas as repostas que se encaixam no padrão.

**re.search** - Vai retornar apenas a primeira correspondência.

> {objeto}.group(campo) E possível escolher o campo que o será exibido

```python
resposta = re.search(padrao, self.numero)
numero_formatado = "+{} ({}) {}-{}".format (
    resposta.group(1),
    resposta.group(2),
    resposta.group(3),
    resposta.group(4)
)
```

- ? Torna uma sequencia de caracteres ou números opcional

---

#### Datetime

Datetime e timedelta, todos estão relacionados ao horário.

- datetime.today() - retorna o dia e o horário. 

- datetime.weekday() - Retorna o dia da semana.

- datetime.month - Retorna o mês do ano.
