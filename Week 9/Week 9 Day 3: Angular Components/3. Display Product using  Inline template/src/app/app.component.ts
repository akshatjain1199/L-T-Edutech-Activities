import { Component } from '@angular/core';


@Component({
  selector: 'app-root',
  template: `<div id="product-details">
  <div id="heading">Product</div>
      <div id="product-image">
        <img src="assets/images/img.jpeg" alt="One Plus 7 Pro">
      </div>
      <div id="product-info">
        <h1 id="product-name">One Plus 7 Pro -</h1>
        <p id="rating">4.0</p>
        <p id="quantity">Available 30</p>
        <p id="product-configuration">8 GB RAM | 256 GB ROM</p>
        <p id="product-display">16.94 cm (6.67 inch) Display</p>
        <p id="product-price">48,999</p>
        <p id="book">Book</p>
        <p id="product-description">13.84 cm (5.45 inch) HD+ Display,12MP Rear Camera | 5MP Front Camera,4000 mAh Li-Polymer Battery,Qualcomm Snapdragon 439 Processor. Brand Warranty of 2 Years Available for Mobile and 6 Months for Accessories.</p>
      </div>
    </div>`,
 styles : [`
      #product-card {
        display: flex;
        flex-direction: row;
        border: 1px solid #ddd;
        padding: 10px;
        border-radius: 5px;
      }

      #product-image {
        max-width: 250px;
        margin-right: 10px;
      }

      #product-details {
        display: flex;
        flex-direction: column;
        justify-content: space-between;
      }

      #product-name {
        font-size: 24px;
        margin-bottom: 5px;
      }

      #product-quantity {
        font-size: 18px;
        color: #008000;
        margin-bottom: 5px;
      }

      #product-configuration {
        font-size: 18px;
        margin-bottom: 5px;
      }

      #product-display {
        font-size: 18px;
        margin-bottom: 5px;
      }

      #product-description {
        font-size: 16px;
        margin-top: 10px;
      }
    `]
  })
export class AppComponent {
  
}
