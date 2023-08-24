
const somaP = (num1,num2) => {
    if (num1 > 10 || num2 > 10) {
        return 'somente número entre 1 e 10';
    } else {
        return num1 + num2;
    }
}

console.log(somaP(11,11))