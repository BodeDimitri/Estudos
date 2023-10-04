let livros = []
const endpointDaApi = 'https://guilhermeonrails.github.io/casadocodigo/livros.json'
buscarLivrosDaAPI()

async function buscarLivrosDaAPI() {
    const res = await fetch(endpointDaApi)
    livros = await res.json()
    let livrosComDesconto = aplicarDesconto(livros)
    exibirLivrosNaTela(livrosComDesconto)
}
