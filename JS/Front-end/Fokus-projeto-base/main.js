const html = document.querySelector('html')

const foco = document.querySelector('.app__card-button--foco')
const curto = document.querySelector('.app__card-button--curto')
const longo = document.querySelector('.app__card-button--longo')
const banner = document.querySelector('app__image')

foco.addEventListener('click', () => {
    html.setAttribute('data-contexto', 'foco')
    banner.setAttribute('src','./assets/foco.png')
})

curto.addEventListener('click', () => {
    html.setAttribute('data-contexto', 'descanso-curto')
    banner.setAttribute('src','./assets/descanso-curto.png')
})

longo.addEventListener('click', () => {
    html.setAttribute('data-contexto', 'descanso-longo')
    banner.setAttribute('src','./assets/descanso-longo.png')
})
