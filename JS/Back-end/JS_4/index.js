const precosLivros = require('./listaLivros.js');
const livros = require('./listaLivros.js')

function menorValor(arrProdutos, posicaoInicial) {
    let menor = posicaoInicial;

    for (let atual = 0; atual < arrProdutos.length; atual++) {
        if (arrProdutos[atual].preco < arrProdutos[menor].preco) {
            menor = atual;
        }
    }
    return menor;
}

module.exports = menorValor;

