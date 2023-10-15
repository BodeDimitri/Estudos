import User from "./User.js";
import Admin from "./Admin.js";
import Docente from "./docente.js";

//const novoUser = new User('Ziggy', 'ziggy@gmail.com', '2000-01-01')
//console.log(novoUser.exibirInfos())


const novoAdmin = new Admin('Rodrigo', 'r@gmail.com', '2001-01-01')
console.log(novoAdmin.nome)
novoAdmin.nome = 'Ze Chris'

console.log(novoAdmin.nomeAdmin())
console.log(novoAdmin.sobrenome)
console.log(novoAdmin.exibirInfos())

const novoDD = new Docente('Meg', 'meg@gmaol.com', '2001-01-01')
console.log(novoDD.exibirInfos())
