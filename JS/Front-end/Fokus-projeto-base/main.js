const html = document.querySelector('html')

const foco = document.querySelector('.app__card-button--foco')
const curto = document.querySelector('.app__card-button--curto')
const longo = document.querySelector('.app__card-button--longo')
const titulo = document.querySelector('.app__title')
const banner = document.querySelector('.app__image')
const botoes = document.querySelectorAll('.app__card-button')
const startPauseBt = document.querySelector('#start-pause')

const musicaFoco = document.querySelector('#alternar-musica')
const musica = new Audio('sons/luna-rise-part-one.mp3')

let tempoDecorrido = 5;


musica.loop = true;
musicaFoco.addEventListener('change', () => {
    if(musica.paused) {
        musica.play()
    }else {
        musica.pause()
    }
})

foco.addEventListener('click', () => {
    alterarContexto('foco')
    foco.classList.add('active')
})

curto.addEventListener('click', () => {
    alterarContexto('curto')
    curto.classList.add('active')
})

longo.addEventListener('click', () => {
    alterarContexto('longo')
    longo.classList.add('active')
})

function alterarContexto (contexto) {
    botoes.forEach(function (contexto) {

        contexto.classList.remove('active')
    })
    html.setAttribute('data-contexto', contexto)
    banner.setAttribute('src', `assets/${contexto}.png`)
    switch (contexto) {
        case 'foco': 
            titulo.innerHTML = `Otimize sua produtividade,<br> <strong class="app__title-strong"> mergulhe no que importa.</strong>`
            break;

        case 'curto': 
            titulo.innerHTML = `Que tal dar uma respirada?<strong class="app__title-strong"> Faça uma pausa curta!.</strong class="app__title-strong">`
            break;

        case 'longo':
            titulo.innerHTML = `Hora de voltar à superfíce <strong class="app__title-strong"> Faça uma pausa longa.</strong class="app__title-strong">`
            break
        default:
            break;
    }
}

const contagemRegressiva = () => {
    tempoDecorrido -= 1
    console.log('Temporizador: ' + tempoDecorrido)
}

startPauseBt.addEventListener('click', contagemRegressiva)

function iniciar () {
    intervalodId = setInterval(contagemRegressiva, 1000)
}