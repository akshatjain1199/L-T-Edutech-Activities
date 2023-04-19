const fs = require('fs');

fs.readFile('input.txt', 'utf-8', (err, data) => {
    if (err) {
        console.error('Error reading input file:', err);
        return;
    }

    const age = Number(data);
    const result = (age < 15 || age > 60) ? 'Not Allowed' : 'Allowed';

    console.log(result);
});
