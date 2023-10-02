import chalk from "chalk";
import fs from "fs";
import pegaArquivo from "./index.js";
import { error } from "console";

const caminho = process.argv

function imprimeLista(resultado, identificador = '' ) {
    console.log(chalk.yellow('lista de links'),
    chalk.black.bgGreen(identificador),
    resultado)
}

async function processaTexto(argumentos) {
    const caminho = argumentos[2];

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
        imprimeLista(resultado) 
    } else if (fs.lstatSync(caminho).isDirectory()) {
        const arquivos = await fs.promises.readdir(caminho)
         arquivos.forEach(async (nomeDeArquivos) => {
            const lista = await pegaArquivo(`${caminho}/${nomeDeArquivos}`)
            console.log(`${caminho}/${nomeDeArquivos}`)
            imprimeLista(lista, nomeDeArquivos) 
        })
    }
}

processaTexto(caminho)