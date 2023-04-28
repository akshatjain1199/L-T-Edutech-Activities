declare var require: any
const fs = require('fs');
interface Product {
  name: string;
  brand: string;
  price: number;
  discount: number;
}

const input = fs.readFileSync('input.txt', 'utf-8').trim().split('\n');
const products: Product[] = JSON.parse(input[0]);
const sortType: string = input[1];
function sortProducts(products: Product[], sortType: string): Product[] {
  if (sortType === 'ASC') {
    return products.sort((a, b) => a.price - b.price);
  } else if (sortType === 'DES') {
    return products.sort((a, b) => b.price - a.price);
  } else {
    throw new Error(`Invalid sort type: ${sortType}.`);
  }
}
const sortedProducts = sortProducts(products, sortType);
console.log(sortedProducts);
