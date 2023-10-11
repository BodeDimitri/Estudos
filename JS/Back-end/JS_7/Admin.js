import User from './User.js'

class Admin extends User {
    constructor(nome, email, nascimento, role = 'Admin', ativo) {
        super(nome, email, nascimento, role, ativo)
    }
    criarCurso(nomeDoCurso, vagas) {
        return `Curso de ${nomeDoCurso} criado com ${vagas} vagas`
    }
}

const newAdmin = new Admin('Rar', 'rar@gmail.com', '2001-01-01')
console.log(newAdmin.criarCurso('Angular', 2))