const dados = require('./cleinte.json');

console.log(dados)

const clienteEmString = JSON.stringify(dados)
console.log(clienteEmString);

const clienteEmObjeto = JSON.parse(clienteEmString);
console.log(clienteEmObjeto);