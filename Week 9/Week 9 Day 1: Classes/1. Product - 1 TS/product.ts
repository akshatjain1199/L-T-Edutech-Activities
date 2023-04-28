export class Product {
    name: string;
    brand: string;
    price: number;
    discount: number;
    finalPrice: number;

    constructor(name: string, brand: string, price: number, discount: number){
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.discount = discount;
    }

    calculatePrice(): void {
        this.finalPrice = this.price - (this.price * (this.discount / 100));
    }

    display(): void {
        console.log(`Product Name : ${this.name}`);
        console.log(`Product Brand : ${this.brand}`);
        console.log(`Product Price : ${this.price.toFixed(2)}`);
        console.log(`Product Discount : ${this.discount.toFixed(2)}`);
        console.log(`Total Price : ${this.finalPrice.toFixed(2)}`);
    }
}
