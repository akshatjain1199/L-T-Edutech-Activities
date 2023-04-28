let require:any;
const fs = require('fs');

const input: string = fs.readFileSync('input.txt', 'utf-8').trim();

const arr: string[] = input.split('\n').map(str => str.trim());

arr.sort();

console.log(arr.join('\n'));
