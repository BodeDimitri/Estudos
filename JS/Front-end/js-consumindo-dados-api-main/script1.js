async function buscaEndereco(cep) {
    try {
        const consultaCep = await fetch(`https://viacep.com.br/ws/${cep}/json`)
        var consultaCepConvertida = await consultaCep.json()
            console.log(consultaCepConvertida)
        if (consultaCepConvertida.erro) {
            throw Error('CEP não existente')
        }
        console.log(consultaCepConvertida)
        return consultaCepConvertida
        } catch (erro) {
            console.log(erro)
        }
    }

var cep = document.getElementById('cep')
cep.addEventListener('focusout', () => buscaEndereco(cep.value))