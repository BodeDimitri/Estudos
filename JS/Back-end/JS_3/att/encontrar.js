const lerClientes = require("./clientes.json");

function encontrar (lista, chave, valor) {
    return lista.find((item) => item[chave].includes(valor));
}

const encontrado = encontrar(lerClientes, "nome", "Cecelia");

console.log(encontrado);