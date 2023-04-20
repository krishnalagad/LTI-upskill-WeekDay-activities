const fs = require("fs");

fs.readFile("input.txt", (err, data) => {
    if (err) {
        console.error(err);
        return;
    }

    var inp = Number(data);
    var flag = false;

    for (let i = 2; i < inp; i++) {
        if (inp % i === 0) {
            flag = false;
            break;
        } else {
            flag = true;
        }        
    }

    if (flag) {
        console.log(inp + " is a prime number");
    } else {
        console.log(inp + " is not a prime number");
    }
});
