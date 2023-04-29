import { Component, OnInit } from "@angular/core";
import { User } from "../user";
import { user } from "../user-mock-data";
@Component({
  selector: "app-user-list",
  templateUrl: "./user-list.component.html",
  styleUrls: ["./user-list.component.css"],
})
export class UserListComponent implements OnInit {
  constructor() {}

  users: Array<User> = [];

  ngOnInit() {
    this.users = user;
  }

  //Fill your code here
}
