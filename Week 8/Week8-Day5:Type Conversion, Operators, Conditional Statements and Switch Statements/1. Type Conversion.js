const fs = require('fs');

fs.readFile('input.txt', (err, data) => {
    if (err) {
        console.error('Error reading input file:', err);
        return;
    }

    const convertedData = Number(data);

    console.log(convertedData);
});
