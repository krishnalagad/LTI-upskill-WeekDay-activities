const fs = require("fs");

fs.readFile("input.txt", (err, data) => {
    if (err) {
        console.error(err);
        return;
    }

    var inp = parseInt(data);
    checkVoteCompatability(inp);
});

function checkVoteCompatability(age) {
    if (age >= 18) {
        console.log("Allowed");
    } else {
        console.log("Not Allowed");
    }
}
