from functools import total_ordering

@total_ordering
class ContaSalario: 

    def __init__(self, codigo, saldo):
        self._codigo = codigo
        self._saldo = saldo

    def __eq__(self, outro):
        return self._codigo == self._codigo

    def deposita(self,valor):
        self._saldo += valor

    def __str__(self):
        return f"Código: {self._codigo} e Saldo: {self._saldo}."
    
    def __lt__(self, outro):
        if self._saldo != outro.saldo:
            return self._saldo < outro._saldo
        return self._codigo < self._codigo

    def consultado_saldo(self):
        return self._saldo