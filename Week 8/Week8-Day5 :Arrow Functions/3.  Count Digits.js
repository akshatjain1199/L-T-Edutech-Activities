var fs = require('fs');
var value = fs.readFileSync("input.txt").toString();

var digitsCount = (x) => {
    var count=0
    while(x >= 1){
        count++;
        x /= 10
    }
  return count
}

console.log(digitsCount(value))
