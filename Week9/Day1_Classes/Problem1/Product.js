"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Product = /** @class */ (function () {
    function Product(name, brand, price, discount) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.discount = discount;
        this.finalPrice = 0;
    }
    Product.prototype.calculatePrice = function () {
        this.finalPrice = this.price - (this.discount * this.price) / 100;
    };
    Product.prototype.display = function () {
        console.log("Product Name : ".concat(this.name));
        console.log("Product Brand : ".concat(this.brand));
        console.log("Product Price : ".concat(this.price.toFixed(2)));
        console.log("Product Discount : ".concat(this.discount.toFixed(2)));
        console.log("Total Price : ".concat(this.finalPrice.toFixed(2)));
    };
    return Product;
}());
exports.default = Product;
