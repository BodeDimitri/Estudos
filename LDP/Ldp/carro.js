//Código carro
let yCarros = [40, 96, 150, 210, 270, 310];
let xCarros = [600, 600, 600, 600, 600, 600];
let velocidadeCarros = [2, 2.2, 1.4, 4, 2.6, 5];
let comprimentoCarro = 40;
let alturaCarro = 30;

function mostraCarro(){
    for (let i = 0; i < imagemCarros.length; i++)
        image(imagemCarros[i], xCarros[i], yCarros[i], comprimentoCarro, alturaCarro);
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
