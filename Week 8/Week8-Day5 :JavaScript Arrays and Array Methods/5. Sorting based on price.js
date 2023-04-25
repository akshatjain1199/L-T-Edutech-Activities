var fs = require('fs');
var input = fs.readFileSync("input.txt").toString();

var arr=input.split("\n")

arr.sort(function(a,b){
    var a1=a.split(",")
    var a2=b.split(",")
    return a2[2]-a1[2]})

var ans=arr[0].split(',')
console.log("Id : " + ans[0]  +"\n" + "Name : " + ans[1] + "\n" + "Price : " + ans[2])
