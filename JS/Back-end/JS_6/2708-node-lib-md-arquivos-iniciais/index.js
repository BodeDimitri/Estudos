import chalk from "chalk";
import fs, { readFile } from "fs"
//const chalk = require('chalk')

function trataErro(erro) {
    console.log(erro)
    throw new Error(chalk.red(erro.code, 'Arquivo inválido'))
}

function pegaArquivo(caminhoArquivo) { 
    const enconding = 'utf-8'
    
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