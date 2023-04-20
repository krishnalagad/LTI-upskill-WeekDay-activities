const fs = require("fs");

fs.readFile("input.txt", (err, data) => {
    if (err) {
        console.error(err);
        return;
    }
    var inp = parseInt(data);
    checkPrime(inp);
});

function checkPrime(num) {
    var flag = false;
    for (let i = 2; i < num; i++) {
        if (num % i === 0) {
            flag = false;
            break;
        } else {
            flag = true;
        }        
    }

    if (flag) {
        console.log("Prime");
    } else {
        console.log("Not Prime");
    }
}
