const fs = require("fs");
const input = fs.readFileSync("input.txt", "utf-8").trim();
const students = input.split("\n");
const count = students.length;
console.log(count);
