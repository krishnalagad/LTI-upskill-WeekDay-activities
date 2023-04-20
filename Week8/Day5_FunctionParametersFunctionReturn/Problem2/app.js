const fs = require("fs");

fs.readFile("input.txt", (err, data) => {
    if (err) {
        console.error(err);
        return;
    }

    let arr = data.toString().trim().split("\n");
    let no1 = parseInt(arr[0]);
    let no2 = parseInt(arr[1]);

    console.log(checkMax(no1, no2));
});

function checkMax(n1, n2) {
    if (n1 > n2) {
        return "John";
    } else {
        return "Joe";
    }
}
