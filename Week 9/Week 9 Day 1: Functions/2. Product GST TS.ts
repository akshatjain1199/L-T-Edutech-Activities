var require:any;

const fs=require('fs');

const calculateTotalPrice = (products: string[], gstPercentage: number = 18): number => {
  let totalPrice = 0;

  // Loop through each product
  for (let i = 0; i < products.length; i++) {
    const productDetails = products[i].split(",");
    const amount = parseInt(productDetails[1]);
    const gst = productDetails[2] ? parseFloat(productDetails[2]) : gstPercentage;


    if (!isNaN(amount) && !isNaN(gst)) {
      const priceWithGST = amount + (amount * gst / 100);
      totalPrice += priceWithGST;
    } else {
      console.log(`${products[i]}`);
    }
  }

  return totalPrice;
};


const input = fs.readFileSync("input.txt", "utf-8").trim();

const productList = input.split("|");

const totalPrice = calculateTotalPrice(productList);

// Format total price to include 2 digits after the decimal point
const formattedTotalPrice = totalPrice.toFixed(2);


// Display result
console.log(`The Total price of all products including GST is ${formattedTotalPrice}.`);
