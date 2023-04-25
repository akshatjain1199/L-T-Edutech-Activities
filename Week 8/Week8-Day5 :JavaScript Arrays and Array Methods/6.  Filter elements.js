let fs = require('fs');
let input= fs.readFileSync("input.txt").toString().trim().split(",");

const filterArray = (arr) => {
  let filteredArray = arr.filter(function(element) {
    return element > 5;
  });
  if (filteredArray.length === 0) {
    console.log('Elements in the array are less than 5');
  } else {
   
    console.log(filteredArray.join('\n'));
  }
}

filterArray(input);
