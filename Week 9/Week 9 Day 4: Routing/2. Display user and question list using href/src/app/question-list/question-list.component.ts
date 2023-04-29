import { Component, OnInit } from "@angular/core";
import { Question } from "../question";
import { questionList } from "../question-mock-data";
@Component({
  selector: "app-question-list",
  templateUrl: "./question-list.component.html",
  styleUrls: ["./question-list.component.css"],
})
export class QuestionListComponent implements OnInit {
  constructor() {}

  questions: Array<Question> = [];

  ngOnInit() {
    this.questions = questionList;
  }

  //Fill your code here
}
