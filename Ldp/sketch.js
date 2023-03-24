

function setup() {
  createCanvas(500, 400);
  somDaTrilha.loop();
}

//Output
function draw() {
  background(imagemDaEstrada);
  mostraAtor();
  mostraCarro();
  movimentaCarro();
  movimentaAtor();
  voltaPosicaoCarro();
  verificaColisao();
  incluiPontos();
  marcaPontos();
}
