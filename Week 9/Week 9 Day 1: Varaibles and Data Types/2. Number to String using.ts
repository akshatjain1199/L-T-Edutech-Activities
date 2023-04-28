declare var require: any
const fs = require('fs');
const input: string = fs.readFileSync('input.txt', 'utf-8').trim();

const num: number = parseFloat(input);

if (isNaN(num)) {
  console.log('NaN');
} else {
  const str: string = num.toLocaleString('en-IN', { maximumFractionDigits: 3 });
  console.log(str);
}
