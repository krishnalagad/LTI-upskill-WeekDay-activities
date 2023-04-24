"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var fs = require("fs");
fs.readFile("input.txt", "utf8", function (err, data) {
    if (err)
        throw err;
    var array = data.trim().split("\n");
    array.sort();
    console.log(array.join("\n"));
});
