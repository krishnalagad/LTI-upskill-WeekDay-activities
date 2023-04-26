import * as fs from "fs";

function Discount(...products: string[]) {
  let totalPrice = 0;

  for (let i = 0; i < products.length; i++) {
    if (products[i] !== "") {
        const productInfo = products[i].split(",");
        const price = parseFloat(productInfo[0]);
        const discountPercent = parseFloat(productInfo[1]);
        const discountAmount = (price * discountPercent) / 100;
        const discountedPrice = price - discountAmount;
        totalPrice += discountedPrice;
    }
  }

  return totalPrice;
}

fs.readFile("input.txt", "utf-8", (err, data) => {
  if (err) throw err;

  const productPrices = data.trim().split("|");

  const totalPrice = Discount(...productPrices);

  console.log(`Total price of all the products is ${totalPrice}`);
});
