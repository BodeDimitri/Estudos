const notas = [10, 9.5, 8, 7, 6];

const novaNotas = notas.map((nota) =>{
    return nota + 1 >= 10 ? 10 : nota + 1;
})

console.log(novaNotas);

const array1 = [1, 4, 9, 16];

// Pass a function to map
const map1 = array1.map((x) => {
    return x * 2
});

console.log(map1);