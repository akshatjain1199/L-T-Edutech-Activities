const fs = require('fs');

fs.readFile('input.txt', (err, data) => {
    if (err) {
        console.error('Error reading input file:', err);
        return;
    }

    const value = Number(data);
    const result = value % 2 === 0 ? 'Even number' : 'Odd number';

    console.log(result);
});
