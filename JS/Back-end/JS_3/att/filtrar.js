const lerClientes = require("./clientes.json");

function filtrarApartamentoSemComplemento (lerClientes) {
    return lerClientes.filter((cliente) => {
        return (
            cliente.endereco.apartamento === true &&
            !cliente.endereco.hasOwnProperty('complemento')
        );
    });
} 

console.log(filtrarApartamentoSemComplemento(lerClientes));