let require:any;
const fs=require('fs');
const data = fs.readFileSync('input.txt', 'utf8').trim().split('\n');
const categoryList = data[0].toLowerCase().split('|');
const searchQuery = data[1].toLowerCase();
const isPresent = categoryList.includes(searchQuery);

if (isPresent) {
  console.log(`${searchQuery} item is present.`);
} else {
  console.log(`${searchQuery} item is not present.`);
}
