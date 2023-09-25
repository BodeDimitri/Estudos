const listaLivros = require('./array');

function encontraMenor(pivo,array) {
    let menores = 0;

    for(let atual = 0; atual < array.length; atual++) {
        let produtoAtual = array[atual]
        if (produtoAtual.preco < pivo.preco) {
            menores++
        }
    }
    trocaLugar(array, listaLivros.indexOf(pivo), menores)
    return  array
}

function trocaLugar(array, de, para) {
    const elemen1 = array[de]
    const elemen2 = array[para]

    array[de] = elemen2
    array[para] = elemen1
}

function divideNoPivo(array) {
    let pivo = array[Math.floor(array.length / 2)];
    encontraMenor(pivo,array);
    let valoresMenores = 0;

    for(let analisando = 0; analisando < array.length; analisando++) {
        let atual = array[analisando];
        if(atual.preco < pivo.preco && atual !== pivo) {
            trocaLugar(array, analisando, valoresMenores)
            valoresMenores++;
        }
    }
    return array;
}

console.log(encontraMenor(listaLivros[2], listaLivros))

module.exports = trocaLugar;