var fs = require('fs');
var input = fs.readFileSync('input.txt').toString();
var spl = input.trim();
var array = spl.split("\n").map(x => Number(x));


function performOperation(arr){
    if(arr[0]==1){
        console.log(arr[1]+arr[2])
    }else if(arr[0]==2){
        console.log(arr[1]-arr[2])
    }else if(arr[0]==3){
         console.log(arr[1]*arr[2])
    }else if(arr[0]==4){
         console.log(arr[1]/arr[2])
    }

}

performOperation(array)
