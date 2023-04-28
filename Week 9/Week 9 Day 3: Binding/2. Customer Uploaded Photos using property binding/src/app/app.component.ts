import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  photosHeading = 'Photos';
  photos = [
    { id: 'picture-1', url: '../assets/images/product1.jpg' },
    { id: 'picture-2', url: '../assets/images/product2.jpg' },
    { id: 'picture-3', url: '../assets/images/product3.jpg' },
    { id: 'picture-4', url: '../assets/images/product4.jpg' },
    { id: 'picture-5', url: '../assets/images/product5.jpg' },
    { id: 'picture-6', url: '../assets/images/product6.jpg' },
    { id: 'picture-7', url: '../assets/images/product7.jpg' },
    { id: 'picture-8', url: '../assets/images/product8.jpg' }
  ];
}
