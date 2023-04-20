const fs = require("fs");

fs.readFile("input.txt", (err, data) => {
    if (err) {
        console.error(err);
        return;
    }

    var inp1 = Number(data);
    const inp2 = 2;

    console.log("Addition : " + (inp1 + inp2));
    console.log("Subtraction : " + (inp1 - inp2));
    console.log("Multiplication : " + (inp1 * inp2));
    console.log("Division : " + (inp1 / inp2));
    console.log("Modulo : " + (inp1 % inp2));
});
