import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  blogName = 'TechCrunch';
  name = 'Windstorm';
  email = 'Windstorm@gmail.com';
  age = 27;
  mobile = '9874563210';
  address = '81226 Seattle, WA 98108-1226';
  profilePic = './assets/images/index.jpeg';
}
