declare var require: any
const fs = require('fs');
function sum(...args: number[]) {
  let total = 0;
  args.forEach((num) => (total += num));
  return total;
}

const input: string = fs.readFileSync('input.txt', 'utf-8').trim();
const inputs: string[] = input.split('\n');

inputs.forEach((input) => {
  const nums: number[] = input.split(',').map(Number);
  const result = sum(...nums);
  console.log(result);
});
