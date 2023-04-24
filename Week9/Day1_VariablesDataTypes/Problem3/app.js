"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var fs = require("fs");
fs.readFile("input.txt", "utf8", function (err, data) {
    if (err)
        throw err;
    var categories = data.split("\n")[0].split("|");
    var searchCategory = data.split("\n")[1].trim().toLowerCase();
    if (categories.map(function (c) { return c.trim().toLowerCase(); }).includes(searchCategory)) {
        console.log("".concat(searchCategory, " item is present."));
    }
    else {
        console.log("".concat(searchCategory, " item is not present."));
    }
});
