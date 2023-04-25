var fs = require('fs');
var value = fs.readFileSync("input.txt").toString();
function  prime(x) {
         if(x==1) console.log("Neither Prime nor Composite")
         else{
         prime=1;
         for( i=2;i<=x/2;i++){
              if(x%i==0) {
                  prime=0;
                  console.log(x + " is not a prime number")
                  break
               }
          }
           if(prime) console.log(x + " is a prime number")
         }
   }
   var n=Number(value)
   prime(n)
