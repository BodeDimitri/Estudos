const precosLivros = require('./listaLivros.js');
const livros = require('./listaLivros.js')

let menor = 0;

for (let atual = 0; atual < livros.length; atual++) {
    if (livros[atual].preco < livros[menor].preco) {
        menor = atual;
    }
}

console.log(`${precosLivros[menor].preco} e o seu nome é ${precosLivros[menor].titulo}`)