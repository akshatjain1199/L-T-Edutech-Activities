var fs = require('fs');
var value = fs.readFileSync("input.txt").toString();
var n=Number(value)
let sum = 1;
do {
  sum += n;
  console.log(sum);
} while (sum <=56 );
