const fs = require('fs');

fs.readFile('input.txt', (err, data) => {
    if (err) {
        console.error('Error reading input file:', err);
        return;
    }

    const firstValue = Number(data);
    const secondValue = 2;

    const addition = firstValue + secondValue;
    const subtraction = firstValue - secondValue;
    const multiplication = firstValue * secondValue;
    const division = firstValue / secondValue;
    const modulo = firstValue % secondValue;

    console.log('Addition :', addition);
    console.log('Subtraction :', subtraction);
    console.log('Multiplication :', multiplication);
    console.log('Division :', division);
    console.log('Modulo :', modulo);
});
