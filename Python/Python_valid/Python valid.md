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




