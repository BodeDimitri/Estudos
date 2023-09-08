const cliente = {
    nome: "Joao",
    idade: 24,
    email: "joao@firma.com",
    telefone: ["1155555550", "1144444440"],
  };
  
  cliente.endereco = [{
    rua: "R. Joseph Climber",
    numero: 1337,
    apartamento: true,
    complemento: "ap 934",
  }];

  const listaDeApartamentos = cliente.endereco.filter (
    (endereco) => endereco.apartamento === true
  );
  
  console.log(listaDeApartamentos);