//Ator
let yAtor = 366;
let xAtor = 85;
let colisao = false;
let meusPontos = 0;

//Ator
function mostraAtor(){
    image(imagemDoAtor, xAtor, yAtor, 30, 30);
}

//Movimenta Atpr
function movimentaAtor(){
    if(keyIsDown(UP_ARROW)){
      yAtor -= 1.2;
    }
    if(keyIsDown(DOWN_ARROW)){
      if(irParaBaixo()){
        yAtor += 0.8;
      }
    }
  }

function verificaColisao() {
  for (let i = 0; i < imagemCarros.length; i++){
    colisao = collideRectCircle(xCarros[i], yCarros[i], comprimentoCarro, alturaCarro, xAtor, yAtor, 15)
    if (colisao){
      voltaParaInicio();
      somDaColisao.play();
      if(pontosMaiorQueZero()){
        meusPontos -= 1;
      }
    }
  }
}

function voltaParaInicio(){
  yAtor= 366;
}

function incluiPontos(){
  fill(color(255, 240, 60));
  textAlign(CENTER);
  textSize(25);
  text(meusPontos, width / 5, 27);
}

function marcaPontos(){
  if (yAtor < 15){
    meusPontos += 1
    somDoPonto.play();
    voltaParaInicio();
  }
}

function pontosMaiorQueZero(){
  return meusPontos > 0 
}

function irParaBaixo(){
  return yAtor < 366; 
}