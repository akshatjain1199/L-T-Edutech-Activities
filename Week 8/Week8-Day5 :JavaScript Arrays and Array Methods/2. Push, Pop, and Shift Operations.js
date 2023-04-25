var fs = require('fs');
var input = fs.readFileSync('input.txt', 'utf-8').split('\n');

var arr = input[0].split(',');
console.log('Elements in the array : ' + arr.join(','));

arr.pop();
console.log('Removing last element : ' + arr.join(','));

arr.push(input[1]);
console.log('Adding an element at the end : ' + arr.join(','));
arr.shift();
console.log('Removing first element : ' + arr.join(','));
