var fs = require('fs');
var input = fs.readFileSync('input.txt').toString();
var spl = input.trim();
var array = spl.split("\n");

let simpleInterest= (p,n,r) => (p*n*r)/100

if(array.length==2){
console.log(simpleInterest(array[0],array[1],5))
}else{
console.log(simpleInterest(array[0],array[1],array[2]))
}
