declare var require: any;
let fs = require("fs");

fs.readFile("input.txt", "utf8", (err: any, data: string) => {
  if (err) throw err;

  const array = data.trim().split("\n");
  array.sort();
  console.log(array.join("\n"));
});
