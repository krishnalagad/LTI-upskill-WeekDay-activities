const fs = require("fs");
const input = fs.readFileSync("input.txt", "utf-8").trim().split("\n");
const products = input.map((line) => {
  const [id, name, price] = line.split(",");
  return { id: Number(id), name, price: Number(price) };
});
products.sort((a, b) => b.price - a.price);
const costlyProduct = products[0];
console.log(`Id : ${costlyProduct.id}`);
console.log(`Name : ${costlyProduct.name}`);
console.log(`Price : ${costlyProduct.price}`);
