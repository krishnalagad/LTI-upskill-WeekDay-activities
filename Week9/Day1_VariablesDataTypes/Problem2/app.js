"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var fs = require("fs");
fs.readFile("input.txt", "utf8", function (err, data) {
    if (err)
        throw err;
    var num = parseFloat(data);
    if (isNaN(num)) {
        console.log("NaN");
    }
    else {
        var formatted = num.toLocaleString("en-IN");
        console.log(formatted);
    }
});
