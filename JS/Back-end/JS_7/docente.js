import User from "./User.js";

class Docente extends User {
    constructor(nome, email, nascimento, role = 'docente', ativo){
        super(nome, email, nascimento, role = 'docente', ativo)
    }
    aprovaEstudante(estudante, curso) {
        return `O ${estudante} foi aprovado no curso ${curso}`
    }
}

const novoDocente = new Docente('Mari', 'Mari@gmail.com', '2000-01-01')
console.log(novoDocente.exibirInfos())
console.log(novoDocente.aprovaEstudante('victor', 'matematica'))