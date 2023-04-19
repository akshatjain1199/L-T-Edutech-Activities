
const fs = require('fs');


fs.readFile('input.txt', 'utf-8', (err, data) => {
    if (err) {
        console.error('Error reading file:', err);
        return;
    }

    
    const age = parseInt(data.trim());

    
    if (age >= 18) {
        console.log('Eligible');
    } else {
        console.log('Not Eligible');
    }
});
