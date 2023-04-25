
var fs = require('fs');
var age = fs.readFileSync("input.txt").toString();
function checkAge(age) {
  if (age >= 18) {
    console.log("Allowed");
  } else {
    console.log("Not Allowed");
  }
}

checkAge(age);
