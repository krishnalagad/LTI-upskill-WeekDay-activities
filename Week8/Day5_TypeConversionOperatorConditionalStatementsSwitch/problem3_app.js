const fs = require("fs");

fs.readFile("input.txt", (err, data) => {
    if (err) {
        console.error(err);
        return;
    }

    var inp = Number(data);
    if ((data % 2) === 0) {
        console.log("Even number");
    } else {
        console.log("Odd number");
    }
});
