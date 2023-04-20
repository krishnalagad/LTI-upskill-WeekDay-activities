const fs = require("fs");

const input = fs.readFileSync("input.txt", "utf-8").trim();
const countDigits = (n) => n.toString().length;
const numDigits = countDigits(input);
console.log(numDigits);