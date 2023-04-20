const fs = require("fs");

fs.readFile("input.txt", (err, data) => {
    if (err) {
        console.error("Error in reading file: " + err);
        return;
    }

    var result = Number(data);

    console.log(result);
});

// ---------------------------------------------------------------------------------

// Solution 2
var fs = require("fs");

var name = fs.readFileSync("input.txt").toString();
var result = Number(name);
console.log(result);