import re

class ExtratorURL:
    def __init__(self, url):
        self.url = self.sanitiza_url(url)
        self.valida_url(url)

    
    def sanitiza_url(self, url):
        if type(url) == str:
            return url.strip()
        else:
            return ''
    
    def valida_url(self, url):
        if not self.url:
            raise ValueError('URL VAZIA')
        
        padrao_url = re.compile('(http(s)?://)?(www.)?bytebank.com(.br)?/cambio')
        match = padrao_url.match(url)

        if not match:
            raise ValueError('URL não e valida')
        
    def get_url_base(self):
        indice_interrogacao = self.url.find('?')
        url_base = self.url[0:indice_interrogacao] 
        return url_base

    def get_url_parametro(self):
        indice_interrogacao = self.url.find('?')
        url_parametro=self.url[indice_interrogacao + 1:]
        return url_parametro
    
    def get_valor_parametro(self, parametro_busca):
        indice_parametro = self.get_url_parametro().find(parametro_busca) 
        indice_valor = indice_parametro + len(parametro_busca) + 1 
        indice_e_comercial = self.get_url_parametro().find('&', indice_valor)
        if indice_e_comercial == -1:
            valor = self.get_url_parametro()[indice_valor:] 
        else:
            valor = self.get_url_parametro()[indice_valor:indice_e_comercial]   
        return valor

extrator_url = ExtratorURL("bytebank.com/cambio?quantidade=100&moedaOrigem=real&moedaDestino=dolar")
valor_quantidade = extrator_url.get_valor_parametro("quantidade")
print(valor_quantidade)