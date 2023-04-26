"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var fs = require("fs");
function sum(param1, param2, param3) {
    if (param3 === undefined) {
        return param1 + param2;
    }
    else {
        return param1 + param2 + param3;
    }
}
fs.readFile('input.txt', 'utf8', function (err, data) {
    if (err) {
        throw err;
    }
    var arr = data.split('\n');
    console.log(arr);
    var arr1 = arr[0];
    var arr2 = arr[1];
    var inp1 = parseInt(arr1.split(',')[0]);
    var inp2 = parseInt(arr1.split(',')[1]);
    var inp3 = parseInt(arr1.split(',')[2]);
    var i1 = parseInt(arr2.split(',')[0]);
    var i2 = parseInt(arr2.split(',')[1]);
    var res1 = sum(inp1, inp2, inp3);
    var res2 = sum(i1, i2, 0);
    console.log(res1);
    console.log(res2);
});
