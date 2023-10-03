import chalk from "chalk";
import fs from "fs";
import pegaArquivo from "./index.js";
import listaValidade from "./http-validacao.js";
import { error } from "console";

const caminho = process.argv

async function imprimeLista(valida ,resultado, identificador = '' ) {
    if (valida) {
        console.log(chalk.yellow('lista validada'),
        chalk.black.bgGreen(identificador),
        await listaValidade(resultado))
    } else {
    console.log(chalk.yellow('lista de links'),
    chalk.black.bgGreen(identificador),
    resultado)
    }
}

async function processaTexto(argumentos) {
    const caminho = argumentos[2];
    const valida = argumentos[3] === '--valida';
    console.log(valida)

    try {
        fs.lstatSync(caminho);
    } catch(erro) {
        if (erro.code === 'ENOENT') {
            console.log('Arquivo não encontrado')
            return
        }
    }

    if(fs.lstatSync(caminho).isFile()) {
        const resultado = await pegaArquivo(argumentos[2])
        imprimeLista(valida, resultado) 
    } else if (fs.lstatSync(caminho).isDirectory()) {
        const arquivos = await fs.promises.readdir(caminho)
         arquivos.forEach(async (nomeDeArquivos) => {
            const lista = await pegaArquivo(`${caminho}/${nomeDeArquivos}`)
            console.log(`${caminho}/${nomeDeArquivos}`)
            imprimeLista(valida, lista, nomeDeArquivos) 
        })
    }
}

processaTexto(caminho)