//carro
let xCarro = 550;

//Carro
function mostraCarro(){
    image(imagemCarro, xCarro, 40, 40, 30);
}

//Movimenta carro
function movimentaCarro(){
    xCarro -= 2;
}