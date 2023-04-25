var fs = require('fs');
var input = fs.readFileSync('input.txt').toString();
var array = input.trim().split('\n').map(x => parseInt(x))
function checkMax(a, b) {
if (a > b) {
return "John";
} else {
return "Joe";
}
}

var result = checkMax(array[0], array[1]);
console.log(result);
