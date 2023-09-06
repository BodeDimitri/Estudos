const html = document.querySelector('html')

const foco = document.querySelector('.app__card-button--foco')
const curto = document.querySelector('.app__card-button--curto')
const longo = document.querySelector('.app__card-button--longo')
const titulo = document.querySelector('.app__title')
const banner = document.querySelector('.app__image')
const botoes = document.querySelectorAll('.app__card-button')
const startPauseBt = document.querySelector('#start-pause')
const iniciarOuPausarBt = document.querySelector('#start-pause span')
const imgBotao = document.querySelector('.app__card-primary-butto-icon')
const tempoNaTela = document.querySelector('#timer')

const musicaFoco = document.querySelector('#alternar-musica')
const musica = new Audio('sons/luna-rise-part-one.mp3')
const beep = new Audio('sons/beep.mp3')
const playMu = new Audio('sons/play.wav')
const pauseMu = new Audio('sons/pause.mp3')

let tempoDecorrido = 1500;
let intervalodId = null


musica.loop = true;
musicaFoco.addEventListener('change', () => {
    if(musica.paused) {
        musica.play()
    }else {
        musica.pause()
    }
})

foco.addEventListener('click', () => {
    tempoDecorrido = 1500;
    alterarContexto('foco')
    foco.classList.add('active')
})

curto.addEventListener('click', () => {
    tempoDecorrido = 300;
    alterarContexto('curto')
    curto.classList.add('active')
})

longo.addEventListener('click', () => {
    tempoDecorrido = 900;
    alterarContexto('longo')
    longo.classList.add('active')
})

function alterarContexto (contexto) {
    mostrarTempo()
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
    if (tempoDecorrido <= 0) {
        beep.play()
        alert('Tempo finalizando!')
        zerar()
        return
    }
    tempoDecorrido -= 1
    mostrarTempo()
}

startPauseBt.addEventListener('click', iniciarOuPausar)

function iniciarOuPausar () {
    if(intervalodId){
        pauseMu.play()
        zerar()
        return
    }
    intervalodId = setInterval(contagemRegressiva, 1000)
    iniciarOuPausarBt.textContent = 'Pausar'
    imgBotao.setAttribute('src', 'assets/pause.png')
    playMu.play()
}

function zerar () {
    clearInterval(intervalodId)
    iniciarOuPausarBt.textContent = 'Começar'
    intervalodId = null
    imgBotao.setAttribute('src', 'assets/play_arrow.png')
}

function mostrarTempo() {
    const tempo = new Date (tempoDecorrido * 1000)
    const tempoFormatado = tempo.toLocaleTimeString('pt-Br', {minute: '2-digit', second: '2-digit'})
    tempoNaTela.innerHTML = `${tempoFormatado}`
}

mostrarTempo()