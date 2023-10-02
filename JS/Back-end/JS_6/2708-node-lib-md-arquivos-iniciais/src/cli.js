import chalk from "chalk";
import fs from "fs";
import pegaArquivo from "./index.js";

const caminho = process.argv

async function processaTexto(argumentos) {
    const resultado = await pegaArquivo(argumentos[2])
    console.log(chalk.yellow('lista de links'), resultado)
}

processaTexto(caminho)