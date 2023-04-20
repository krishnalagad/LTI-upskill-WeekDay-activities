const fs = require("fs");

fs.readFile("input.txt", (err, data) => {
  if (err) {
    console.error(err);
    return;
  }

  var inp = Number(data);
  for (let i = 1; i <= 10; i++) {
    console.log(i + " * " + inp + " = " + i * inp);
  }
});
