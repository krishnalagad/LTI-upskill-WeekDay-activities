import * as fs from "fs";
import Product from "./Product";

fs.readFile("input.txt", "utf8", (err: any, data: string) => {
    if(err) throw err;

    const productInfo = data.split(",");
    const name = productInfo[0];
    const brand = productInfo[1];
    const price = parseFloat(productInfo[2]);
    const discount = parseFloat(productInfo[3]);

    const product = new Product(name, brand, price, discount);

    product.calculatePrice();
    product.display();
});
