"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var fs = require("fs");
var Product_1 = require("./Product");
fs.readFile("input.txt", "utf8", function (err, data) {
    if (err)
        throw err;
    var productInfo = data.split(",");
    var name = productInfo[0];
    var brand = productInfo[1];
    var price = parseFloat(productInfo[2]);
    var discount = parseFloat(productInfo[3]);
    var product = new Product_1.default(name, brand, price, discount);
    product.calculatePrice();
    product.display();
});
