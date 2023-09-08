const cliente = {
    nome: "Joao",
    idade: 24,
    email: "joao@firma.com",
    telefone: ["1155555550", "1144444440"],
  };
  
  cliente.enderecos = [
    {
      rua: "R. Joseph Climber",
      numero: 1337,
      apartamento: true,
      complemento: "ap 934",
    },
  ];

  const chavesObjeto = Object.keys(cliente);
  console.log(chavesObjeto);

  if (!chavesObjeto.includes('enderecos')) {
    console.log('Erro, endereço necessario');
  }