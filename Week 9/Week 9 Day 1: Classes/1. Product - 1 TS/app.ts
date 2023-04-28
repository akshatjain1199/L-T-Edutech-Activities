declare let require:any;
const fs = require('fs');

import { Product } from "./Product";

let input = fs.readFileSync('input.txt', 'utf8');

let productDetails = input.split(",");
let product = new Product(productDetails[0], productDetails[1], parseFloat(productDetails[2]), parseFloat(productDetails[3]));
product.calculatePrice();
product.display();
