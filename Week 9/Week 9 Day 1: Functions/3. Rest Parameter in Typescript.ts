declare var require: any


function calculateDiscount(...products: string[]): string {
  let totalPrice = 0;

  products.forEach((product) => {
    const [amount, discount] = product.split(',');

    if (!isNaN(parseFloat(amount)) && !isNaN(parseFloat(discount))) {
      const productPrice = parseFloat(amount);
      const productDiscount = parseFloat(discount);
      const discountedPrice = productPrice * (1 - productDiscount / 100);
      totalPrice += discountedPrice;
    }
  });

  return `Total price of all the products is ${totalPrice}`;
}

const fs = require('fs');
const input = fs.readFileSync('input.txt', 'utf-8').trim();

const products = input.split('|');

const output = calculateDiscount(...products);

console.log(output);
