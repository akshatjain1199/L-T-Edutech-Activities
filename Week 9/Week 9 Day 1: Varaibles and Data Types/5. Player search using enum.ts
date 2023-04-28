declare var require: any
const fs = require('fs');
enum Players {
  Hardhik33 = "Hardik Pandya",
  Rishabh47 = "Rishabh Pant",
  Rohit45 = "Rohit Sharma",
  MS7 = "Mahendrasingh Dhoni",
  Virat18 = "Virat Kholi",
  Jasprit59 = "Jasprit Bumrah",
  Lokesh1 = "Lokesh Rahul",
  Prithvi100 = "Prithvi Shaw",
  Shreyas41 ="Shreyas Iyer",
  Rahul19 = "Rahul Dravid"
}

const input: string = fs.readFileSync('input.txt', 'utf-8').trim();

if (Players[input]) {
  console.log(Players[input]);
} else {
  console.log("No players found");
}
