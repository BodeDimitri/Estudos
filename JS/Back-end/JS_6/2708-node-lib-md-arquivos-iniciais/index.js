import chalk from "chalk";
import fs, { readFile } from "fs"
//const chalk = require('chalk')

const textpTeste = 'São geralmente recuperados a partir de um objeto [FileList](https://developer.mozilla.org/pt-BR/docs/Web/API/FileList) que é retornado como resultado da seleção, pelo usuário, de arquivos através do elemento [<input>](https://developer.mozilla.org/pt-BR/docs/Web/HTML/Element/Input), a partir do objeto [DataTransfer](https://developer.mozilla.org/pt-BR/docs/Web/API/DataTransfer) utilizado em operações de arrastar e soltar, ou a partir da API `mozGetAsFile()` em um [HTMLCanvasElement](https://developer.mozilla.org/pt-BR/docs/Web/API/HTMLCanvasElement). Em Gecko, códigos com privilégiios podem criar objetos File representando qualquer arquivo local sem a intereção do usuário (veja [Implementation notes](https://developer.mozilla.org/pt-BR/docs/Web/API/File#implementation_notes) para mais informações.).'

function extraiTexto (texto) {
    const regex = /\[([^[\]]*?)\]\((https?:\/\/[^\s?#.].[^\s]*)\)/gm
    const capturas = [...texto.matchAll(regex)]
    const resultados = capturas.map(captura => ({[captura[1]]: captura[2]}))
    return resultados
}

extraiTexto(textpTeste)

function trataErro(erro) {
    console.log(erro)
    throw new Error(chalk.red(erro.code, 'Arquivo inválido'))
}

async function pegaArquivo(caminhoArquivo) { 
    try {
    const enconding = 'utf-8'
    const texto = await fs.promises.readFile(caminhoArquivo, enconding)
    console.log(extraiTexto(texto))    
    }
    catch (erro) {
        trataErro(erro)
    }
    finally {
        console.log(chalk.blue('Operação finalizada'))
    }
}
    
//function pegaArquivo(caminhoArquivo) {
//    const enconding = 'utf-8'
//    fs.promises.readFile(caminhoArquivo, enconding)
//    .then((texto) => console.log(chalk.green(texto)))
//    .catch(trataErro) 
//}
//function pegaArquivo(caminhoArquivo) {
//    const enconding = 'utf-8'
//    fs.readFile(caminhoArquivo, enconding, (erro, texto) => {
//        if (erro) {
//            trataErro(erro)
//        } else
//        console.log(chalk.green(texto))
//    })
//}


pegaArquivo('./arquivos/texto.md');

// \[[^[\]]*?\]
// \(https?:\/\/[^\s?#.].[^\s]*\)
// \[([^[\]]*?)\]\((https?:\/\/[^\s?#.].[^\s]*)\)