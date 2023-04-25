var fs = require('fs');
var input = fs.readFileSync("input.txt").toString();

let n = Number(input);
for (let i = 1; i <= 10; i++) {
  let product = i * n;
  console.log(i + ' * ' + n + ' = ' + product);
}
