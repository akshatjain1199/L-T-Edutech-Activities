var fs = require('fs');
var input = fs.readFileSync('input.txt').toString();
const calculateArea = (r, pi = 3.14) => pi * r ** 2;

const radius = Number(input);
const area = calculateArea(radius);

console.log(area);
