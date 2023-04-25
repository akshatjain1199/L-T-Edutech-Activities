var fs = require('fs');
var input = Number(fs.readFileSync('input.txt'));

var arr = [12, 45, 1, 43, 27, 65];
arr.unshift(input);

console.log('[ ' + arr.join(', ') + ' ]');
