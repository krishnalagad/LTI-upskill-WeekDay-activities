const fs = require("fs");

fs.readFile("input.txt", (err, data) => {
    if (err) {
        console.error(err);
        return;
    }

    var inp = Number(data);
    if (inp < 15 || inp > 60) {
        console.log("Not Allowed");
    } else {
        console.log("Allowed");
    }
});
