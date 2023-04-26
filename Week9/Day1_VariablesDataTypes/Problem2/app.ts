declare var require: any;
let fs = require("fs");

fs.readFile("input.txt", "utf8", (err, data) => {
  if (err) throw err;

  const num = parseFloat(data);
  if (isNaN(num)) {
    console.log("NaN");
  } else {
    const formatted = num.toLocaleString("en-IN");
    console.log(formatted);
  }
});
