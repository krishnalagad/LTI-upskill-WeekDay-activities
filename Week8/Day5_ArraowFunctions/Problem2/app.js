const fs = require("fs");

const input = fs.readFileSync("input.txt", "utf-8");
const radius = parseFloat(input);

const area = (r) => {
  const pi = 3.14;
  return pi * r ** 2;
};

console.log(area(radius));
