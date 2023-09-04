function tocaSom (idElementAudio) {
    const elemento = document.querySelector(idElementAudio);

    if (elemento != null && elemento.localName === 'audio') {
        elemento.play();
    }
    else {
        console.log('Elemento não encontrado');
    }
}

const listaDeTeclas = document.querySelectorAll('.tecla');


 for (let contador = 0;contador < listaDeTeclas.length; contador++) {

    const somTecla = listaDeTeclas[contador].classList[1];
    
    listaDeTeclas[contador].onclick = function() {
        tocaSom(`#som_${somTecla}`);
    };

    somTecla.onkeydown = function (event) {

        console.log(event.key == 'Space');

        if (event.key === 'Space' || event.key === 'Enter') {
            listaDeTeclas[contador].classList.add('ativa');
        };

    }

    somTecla.onkeyup = function () {
        listaDeTeclas[contador].classList.remove('ativa');
    }

 }
