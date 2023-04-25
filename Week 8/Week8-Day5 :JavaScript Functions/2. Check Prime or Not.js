var fs = require('fs');
var n = fs.readFileSync('input.txt').toString();
function checkPrime(n) {
  if (n <= 1) {
    return false;
  }
  for (var i = 2; i <= Math.sqrt(n); i++) {
    if (n % i === 0) {
      return false;
    }
  }
  return true;
}

if (checkPrime(n)) {
  console.log('Prime');
} else {
  console.log('Not Prime');
}
