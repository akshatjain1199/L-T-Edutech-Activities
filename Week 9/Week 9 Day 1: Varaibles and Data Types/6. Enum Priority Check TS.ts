declare let require:any;
const fs = require('fs');
enum ROLE {
  endUser,
  author,
  subAdmin,
  admin
}

const input: string = fs.readFileSync('input.txt', 'utf-8').trim();

const [role1, role2]: string[] = input.split(',').map(str => str.trim());

if (ROLE[role1] > ROLE[role2]) {
  console.log(`${role1} has more priority than ${role2}`);
} else if (ROLE[role1] < ROLE[role2]) {
  console.log(`${role2} has more priority than ${role1}`);
} else {
  console.log(`Both ${role1} and ${role2} have the same priority`);
}
