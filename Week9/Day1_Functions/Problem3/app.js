"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var fs = require("fs");
function Discount() {
    var products = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        products[_i] = arguments[_i];
    }
    var totalPrice = 0;
    console.log(products);
    for (var i = 0; i < products.length; i++) {
        if (products[i] !== "") {
            var productInfo = products[i].split(",");
            var price = parseFloat(productInfo[0]);
            var discountPercent = parseFloat(productInfo[1]);
            var discountAmount = (price * discountPercent) / 100;
            var discountedPrice = price - discountAmount;
            totalPrice += discountedPrice;
        }
    }
    return totalPrice;
}
fs.readFile("input.txt", "utf-8", function (err, data) {
    if (err)
        throw err;
    var productPrices = data.trim().split("|");
    var totalPrice = Discount.apply(void 0, productPrices);
    console.log("Total price of all the products is ".concat(totalPrice));
});
