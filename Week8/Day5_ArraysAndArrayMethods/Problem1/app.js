const fs = require("fs");
const input = Number(fs.readFileSync("input.txt"));
const arr = [12, 45, 1, 43, 27, 65];
arr.unshift(input);
console.log(arr);
