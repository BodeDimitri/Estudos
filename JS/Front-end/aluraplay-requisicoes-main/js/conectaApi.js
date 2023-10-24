async function listaVideos() {
    const conexao = await fetch("http://localhost:3000/videos")
    const conexaoconvertida = await conexao.json()
    return conexaoconvertida
}

export const conectaAPI = {
    listaVideos
}