export class Product {
  description: string;
  price: number;
  discount: number;

  constructor(public name: string, description: string, price: number, discount: number) {
    this.description = description;
    this.price = price;
    this.discount = discount;
  }
}
