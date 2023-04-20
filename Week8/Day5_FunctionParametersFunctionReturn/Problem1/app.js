const fs = require("fs");

fs.readFile("input.txt", (err, data) => {
  if (err) {
    console.error(err);
    return;
  }

  let inp = Number(data);
  getFibonacci(inp);
});

function getFibonacci(inp) {
  let num1 = 0,
    num2 = 1,
    nextTerm;
  for (let i = 1; i <= inp; i++) {
    console.log(num1);
    nextTerm = num1 + num2;
    num1 = num2;
    num2 = nextTerm;
  }
}
