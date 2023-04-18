const fs = require("fs");
const input = fs.readFileSync("input.txt", "utf-8");
const arr = input.split(",").map(Number);
const filteredArr = arr.filter((num) => num > 5);
if (filteredArr.length > 0) {
  console.log(filteredArr.join("\n"));
} else {
  console.log("Elements in the array are less than 5");
}
