const alunos = ["João", "Juliana", "Ana", "Caio"];
const medias = [10, 8, 7.5, 9];

const listaDeAlunosEMedia = [alunos, medias];

function exibeNota(aluno) {
    if (listaDeAlunosEMedia[0].includes(aluno)) {

        console.log(`${aluno} esta cadastrado`);

        //const alunos = listaDeAlunosEMedia[0];
        //const medias = listaDeAlunosEMedia[1];

        const [alunos, medias] = listaDeAlunosEMedia;

        const indice = alunos.indexOf(aluno);
        const mediaAluno = medias[indice];

        console.log(`A média do ${aluno} é ${mediaAluno}`)

    } else {
        console.log(`${aluno} não cadastrado`);
    }
}

exibeNota('João');