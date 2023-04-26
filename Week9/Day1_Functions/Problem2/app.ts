import * as fs from "fs";

fs.readFile("input.txt", "utf8", (err: any, data: string) => {
  if (err) throw err;

  let result = calGST(data);
  console.log(`The Total price of all products including GST is ${result}` + ".00.");
});

const calGST = (data: string) => {
  let arr = data.split("|");
  let totAmt = 0;

  for (let i = 0; i < arr.length; i++) {
    if (arr[i] !== "") {
      const itemArray = arr[i].split(",");
      const itemAmt = parseInt(itemArray[1], 10);
      const finalGst = itemArray[2] !== "" ? parseInt(itemArray[2]) : 18;
      const finalPrice = itemAmt + (finalGst / 100) * itemAmt;
      totAmt += finalPrice;
    }
  }
  return totAmt;
};
