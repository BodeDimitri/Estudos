async function buscaEndereco(cep) {
    var mensagemErro = document.getElementById('erro')
    mensagemErro.innerHTML = '';
    try {
        const consultaCep = await fetch(`https://viacep.com.br/ws/${cep}/json`)
        var consultaCepConvertida = await consultaCep.json()
            console.log(consultaCepConvertida)
        if (consultaCepConvertida.erro) {
            throw Error('CEP não existente')
        }
        var cidade = document.getElementById('cidade')
        var logradouro = document.getElementById('endereco')
        var estado = document.getElementById('estado')

        cidade.value = consultaCepConvertida.localidade;
        logradouro.value = consultaCepConvertida.logradouro;
        estado.value = consultaCepConvertida.uf;

        console.log(consultaCepConvertida)
        return consultaCepConvertida
        } catch (erro) {
            mensagemErro.innerHTML = `<p>CEP inválido. Tente novamente!</p>`
            console.log(erro)
        }
    }

var cep = document.getElementById('cep')
cep.addEventListener('focusout', () => buscaEndereco(cep.value))