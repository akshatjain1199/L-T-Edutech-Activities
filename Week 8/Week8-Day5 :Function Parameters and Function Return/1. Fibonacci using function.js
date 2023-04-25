var fs = require('fs');
var input = fs.readFileSync('input.txt').toString();
var n = parseInt(input);

function findFibonacci(n) {
  let fib = [];
  fib[0] = 0;
  fib[1] = 1;
  for (let i = 2; i <= n; i++) {
    fib[i] = fib[i - 1] + fib[i - 2];
  }
  for (let i = 0; i < n; i++) {
    console.log(fib[i]);
  }
}

findFibonacci(n);
