import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  //Fill your code here
    title: string;
  author: string;
  category: string;
  postedDate: string;
  likes: number;
  
  constructor() {
    this.title = 'Robotics';
    this.author = 'Zack Whittake';
    this.category = 'Robotics';
    this.postedDate = '01/10/2019';
    this.likes = 27;
  }}
