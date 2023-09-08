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

  function ligaParaClientes (telefoneComercial, telefoneResidencial) {
    console.log(`Ligando telefone comercial ${telefoneComercial}`);
    console.log(`Ligando telefone residencial ${telefoneResidencial}`);  
  }

  ligaParaClientes(...cliente.telefone)

  const encomenda = {
    destinatario: cliente.nome,
    endereco: cliente.enderecos[0].rua,
    numero: cliente.enderecos[0].numero
  }

