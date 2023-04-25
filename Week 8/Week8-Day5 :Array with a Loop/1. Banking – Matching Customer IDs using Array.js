const fs = require('fs');
var input = fs.readFileSync('input.txt').toString().trim().split('\n');
var list1=input[0].split(",").map(x => Number(x))

var list2=input[1].split(",").map(x => Number(x))

if(list1.length == list2.length){
    var flag=true
        for(var i=0;i<list1.length;i++){
            if(list1[i]!=list2[i]) {
                flag=false
            }
        }
        if(flag) console.log("Equal")
}else{
    if(list1.length > list2.length){
        var flag=true
          for(var i=0;i<list2.length;i++){
            if(! list1.includes(list2[i])) {
                flag=false
            }
        }
         if(flag) console.log("SuperList")
         else  console.log("UnEqual")
    }else if(list1.length < list2.length){
        var flag=true
          for(var i=0;i<list1.length;i++){
            if(! list2.includes(list1[i])) {
                flag=false
            }
        }
         if(flag) console.log("SubList")
          else  console.log("UnEqual")
    }else{
        console.log("UnEqual")
    }

}
