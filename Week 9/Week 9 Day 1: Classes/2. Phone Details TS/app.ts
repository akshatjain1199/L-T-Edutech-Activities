declare var require: any;
const fs = require('fs');
import { Phone } from './Phone';


const input = fs.readFileSync('input.txt', 'utf-8').trim();
const [name, description, priceStr, discountStr, RAM, ROM, processor, osVersion, releasedYear] = input.split(',');
const price = parseFloat(priceStr);
const discount = parseFloat(discountStr);

const phone = new Phone(name, description, price, discount, RAM, ROM, processor, osVersion, releasedYear);
phone.display();
