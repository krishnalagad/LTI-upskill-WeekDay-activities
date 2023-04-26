declare var require: any;
let fs = require("fs");
fs.readFile("input.txt", "utf8", (err, data) => {
  if (err) throw err;

  const categories = data.split("\n")[0].split("|");
  const searchCategory = data.split("\n")[1].trim().toLowerCase();

  if (categories.map((c) => c.trim().toLowerCase()).includes(searchCategory)) {
    console.log(`${searchCategory} item is present.`);
  } else {
    console.log(`${searchCategory} item is not present.`);
  }
});
