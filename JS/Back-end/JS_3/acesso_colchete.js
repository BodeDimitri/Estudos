const cliente = {
    nome: "Andre",
    idade: 32,
    cpf: "1122233345",
    email: "andre@dominio.com",
  };
    
const chaves = ["nome", "idade", "cpf", "email"];

chaves.forEach((chave) => {
    console.log(`${chave} tem valor de ${cliente[chave]}`);
})