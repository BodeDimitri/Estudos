function tocaSom (idElementAudio) {
    document.querySelector(idElementAudio).play();
}

const listaDeTeclas = document.querySelectorAll('.tecla');


 for (let contador = 0;contador < listaDeTeclas.length; contador++) {

    const somTecla = listaDeTeclas[contador].classList[1];
    
    listaDeTeclas[contador].onclick = function() {
        tocaSom(`#som_${somTecla}`);
    };
 }
