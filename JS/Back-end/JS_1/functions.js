//Declara a função
function imprime(texto) {
    console.log(texto)
}

//Executa a função

imprime('oi');

//Não e possivel passar uma variavel dentro de uma função

function soma() {
    return 2+2;
}

//Função dentro da função

imprime(soma())