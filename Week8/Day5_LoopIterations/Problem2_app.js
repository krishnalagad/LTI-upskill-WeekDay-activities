const fs = require("fs");

fs.readFile("input.txt", (err, data) => {
    if (err) {
        console.error(err);
        return;
    }

    var inp = Number(data);
    var sum = 1;

    while(sum <= 56) {
        sum += inp;
        console.log(sum);
    }
});
