//Ator
let yAtor = 366;

//Ator
function mostraAtor(){
    image(imagemDoAtor, 100, yAtor, 30, 30);
}

//Movimenta Atpr
function movimentaAtor(){
    if(keyIsDown(UP_ARROW)){
      yAtor -= 1;
    }
    if(keyIsDown(DOWN_ARROW)){
      yAtor += 1;
    }
  }