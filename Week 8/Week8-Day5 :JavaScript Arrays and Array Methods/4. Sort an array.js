var fs = require('fs');
var input = fs.readFileSync("input.txt").toString();

var arr=input.split(",").map(x => Number(x))

arr.sort(function(a,b){return b-a})
console.log(arr)
