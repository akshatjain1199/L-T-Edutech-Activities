import { Component } from '@angular/core';
import { FormGroup, FormControl} from '@angular/forms';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  productForm = new FormGroup({
    name: new FormControl(''),
    brand: new FormControl(''),
    price: new FormControl(''),
    image: new FormControl('')
  });

  onImageChange(event: Event) {
    const file = (event.target as HTMLInputElement).files[0];
    this.productForm.patchValue({
      image: file
    });
    this.productForm.get('img').updateValueAndValidity();
  }

  onSubmit() {
  
  }
}
