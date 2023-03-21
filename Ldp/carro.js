//Código carro
let yCarros = [40, 96, 150];
let xCarros = [600, 600, 600];
let velocidadeCarros = [2, 2.2, 1];

function mostraCarro(){
    for (let i = 0; i < imagemCarros.length; i++)
        image(imagemCarros[i], xCarros[i], yCarros[i], 40, 30);
}
//Movimenta carro 
function movimentaCarro(){
    for (let i = 0; i < velocidadeCarros.length; i++)
        xCarros[i] -= velocidadeCarros[i];
}

function voltaPosicaoCarro(){
    for (let i = 0; i < xCarros.length; i++){
        if (passouTodaATela(xCarros[i])){
            xCarros[i] = 600;
        }
    }
}

function passouTodaATela(xCarros){
    return xCarros <-50;
}
