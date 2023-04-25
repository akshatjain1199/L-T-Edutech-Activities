declare var require: any
const fs = require('fs');

function isLeapYear(year: number): boolean {
  if (year % 4 !== 0) {
    return false;
  } else if (year % 100 !== 0) {

    return true;
  } else if (year % 400 !== 0) {
    
    return false;
  } else {

    return true;
  }
}

const input = fs.readFileSync('input.txt', 'utf-8');
const year = parseInt(input);

const result = isLeapYear(year);
console.log(result);
