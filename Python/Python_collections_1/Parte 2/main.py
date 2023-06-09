class ContaCorrente: 

    def __init__(self,codigo,saldo):
        self.codigo = codigo
        self.saldo = saldo

    def deposita(self, valor):
        self.saldo += valor

    def __str__(self):
        return f"(codigo {self.codigo} saldo {self.saldo})"
    
    def deposita_contas(self, contas):
        for conta in contas:
            conta.deposita(100)
    
