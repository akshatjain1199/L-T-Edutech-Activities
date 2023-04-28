
interface Product {
  name: string;
  brand: string;
  price: number;
  discount: number;
}
declare var require: any;
const fs = require('fs');
const input = fs.readFileSync('input.txt', 'utf-8').trim();

const [productName, brand, priceStr, discountStr] = input.split(',');
const price = parseFloat(priceStr);
const discount = parseFloat(discountStr);
const product: Product = { name: productName, brand, price, discount };

function calculateTotalAmount(product: Product): number {
  const total = product.price * (100 - product.discount) / 100;
  return parseFloat(total.toFixed(2));
}
const totalAmount = calculateTotalAmount(product);
console.log(`Total Amount : ${totalAmount.toFixed(2)}`);
