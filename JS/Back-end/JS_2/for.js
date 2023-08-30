const numeros = [100, 200, 300, 400, 500, 600];
const tamanho = numeros.length;

// Primeira expressão: é executada apenas uma única vez
// Segunda expressão: condição de execução
// Terceira expressão: é executada sempre ao final do bloco

for (let indice = 0; indice < tamanho; indice ++) {
    console.log(numeros[indice]);
}