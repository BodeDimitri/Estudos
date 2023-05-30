url ='https://bytebank.com/cambio?moedaOrigem=real'

indice_interrogacao = url.find('?')


url_base = url[0:indice_interrogacao] # https://bytebank.com/cambio
print(url_base)

url_parametro=url[indice_interrogacao + 1:] # moedaOrigem=real
print(url_parametro)

parametro_busca = 'moedaOrigem'
indice_parametro = url_parametro.find(parametro_busca) #0

print(indice_parametro)


indice_valor = indice_parametro + len(parametro_busca) + 1 #11
valor = url_parametro[indice_valor:] #real
print(valor)