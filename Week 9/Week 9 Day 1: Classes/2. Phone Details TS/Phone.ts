import { Product } from './Product';

export class Phone extends Product {
  RAM: string;
  ROM: string;
  processor: string;
  osVersion: string;
  releasedYear: string;

  constructor(name: string, description: string, price: number, discount: number, RAM: string, ROM: string, processor: string, osVersion: string, releasedYear: string) {
    super(name, description, price, discount);
    this.RAM = RAM;
    this.ROM = ROM;
    this.processor = processor;
    this.osVersion = osVersion;
    this.releasedYear = releasedYear;
  }

  display(): void {
    console.log(`Product Name : ${this.name}`);
    console.log(`Product Brand : ${this.description}`);
    console.log(`Product Price : ${this.price.toFixed(2)}`);
    console.log(`Product Discount : ${this.discount.toFixed(2)}`);
    console.log(`RAM : ${this.RAM}`);
    console.log(`ROM : ${this.ROM}`);
    console.log(`Processor : ${this.processor}`);
    console.log(`osVersion : ${this.osVersion}`);
    console.log(`Released Year : ${this.releasedYear}`);
  }
}
