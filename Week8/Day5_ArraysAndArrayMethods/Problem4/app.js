const fs = require("fs");
const input = fs.readFileSync("input.txt", "utf-8").trim();
const arr = input.split(",").map(Number);
arr.sort((a, b) => b - a);
console.log(arr);
