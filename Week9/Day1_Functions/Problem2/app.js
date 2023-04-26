"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var fs = require("fs");
fs.readFile("input.txt", "utf8", function (err, data) {
    if (err)
        throw err;
    var result = calGST(data);
    console.log("The Total price of all products including GST is ".concat(result) + ".00");
});
var calGST = function (data) {
    var arr = data.split("|");
    var totAmt = 0;
    for (var i = 0; i < arr.length; i++) {
        if (arr[i] !== "") {
            var itemArray = arr[i].split(",");
            var itemAmt = parseInt(itemArray[1], 10);
            var finalGst = itemArray[2] !== "" ? parseInt(itemArray[2]) : 18;
            var finalPrice = itemAmt + (finalGst / 100) * itemAmt;
            totAmt += finalPrice;
        }
    }
    return totAmt;
};
