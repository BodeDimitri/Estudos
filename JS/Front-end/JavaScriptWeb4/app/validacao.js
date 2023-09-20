function verificaSeExisteUmValorValido (chute) {
    const numero = +chute

    if (chuteForInvalido(numero)){
        elementoChute.innerHTML += '<div>Valor Invalido</div>'

    }

    if (numeroForMaiorOuMenorQueOValorPermitido(numero)) {
        elementoChute.innerHTML += '<div>O número esta fora do escopo</div>'
    }

    if (numero === numeroSecreto) {
        document.body.innerHTML = `
        <h2>Você acertou!</h2>
        <h3>O número secreto era ${numeroSecreto}</h3>
        `
    } else if (numero > numeroSecreto) {
        elementoChute.innerHTML += '<div>O número secreto é menor <i class="fa-solid fa-down-long"></i>'
    }
    else {
        elementoChute.innerHTML += '<div>O número secreto é maior <i class="fa-solid fa-up-long"></i>'
    }
}

function chuteForInvalido(numero) {
    return Number.isNaN(numero)
}

function numeroForMaiorOuMenorQueOValorPermitido(numero) {
    return numero > maiorValor || numero < menorValor
}
