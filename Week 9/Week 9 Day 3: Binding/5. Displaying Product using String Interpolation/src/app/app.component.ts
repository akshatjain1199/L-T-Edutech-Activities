import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
   //Fill your code here
    arr:Array<Object> = [{
     id:1,
     name:"CLASSIC watch",
     imageUrl:"/assets/images/watch.jpg",
     price:20
   }];
}
