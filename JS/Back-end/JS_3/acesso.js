const cliente = {
    nome: 'jorge',
    idade: 28,
    cpf: '12345678911',
    email: 'jorgeretake@gmail.com'
};

console.log(`O nome do cliente e ${cliente.nome}, ele tem ${cliente.idade} anos.`);

console.log(`Os 3 primeiros digitos do CPF são ${cliente.cpf.substring(0,3)}`);