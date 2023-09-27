const consultaCep = fetch('https://viacep.com.br/ws/01001000/json')
    .then(converte => converte.json())
    .then(resposta =>{
        if (resposta.erro) {
            throw Error('Esse cep não existe')
        } else
        console.log(resposta)})

    .catch(erro => console.log(erro))
    .finally(mensagem => console.log('Processamento concluído'))

console.log(consultaCep)