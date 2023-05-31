#url ='bytebank.com/cambio?moedaDestino=dolar&moedaOrigem=real&quantidade=100'
url = ' '

# Sanitização da URL
url = url.replace(' ', '')

# Validação da URL
if url == '':
    raise ValueError('URL VAZIA')

# Separa a base do url e o parâmetro
indice_interrogacao = url.find('?')
url_base = url[0:indice_interrogacao] # https://bytebank.com/cambio
print(url_base)
url_parametro=url[indice_interrogacao + 1:] # moedaOrigem=real
print(url_parametro)

# Busca o valor do parâmetro
parametro_busca = 'quantidade'
indice_parametro = url_parametro.find(parametro_busca) 
indice_valor = indice_parametro + len(parametro_busca) + 1 
indice_e_comercial = url_parametro.find('&', indice_valor)
if indice_e_comercial == -1:
    valor = url_parametro[indice_valor:] 
else:
    valor = url_parametro[indice_valor:indice_e_comercial]   
print(valor)