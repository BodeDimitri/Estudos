const user = {
    nome: 'VV',
    email: 'VV@gmail.com',
    nascimento: '29/09/2009',
    role: 'admin',
    ativo: true,
    exibirInfos () {
        console.log(this.nome, this.email)
    }
}

const admim = {
    nome: 'Maria',
    email: 'maria@gmail.com',
    role: 'admin',
    criarCurso () {
        console.log('Criar curso!')
    }
}

Object.setPrototypeOf(admim, user)
admim.criarCurso()
admim.exibirInfos()