import User from "./User.js";

export default class Docente extends User {
    constructor(nome, email, nascimento, role = 'docente', ativo){
        super(nome, email, nascimento, role = 'docente', ativo)
    }

    exibirInfos () {
        return `${this.nome}, docente`
        }

    aprovaEstudante(estudante, curso) {
        return `O ${estudante} foi aprovado no curso ${curso}`
    }
}

