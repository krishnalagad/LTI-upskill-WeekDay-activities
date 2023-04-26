declare var require: any;
let fs = require("fs");

function sum(param1: number, param2: number, param3?: number): number {
  if (param3 === undefined) {
    return param1 + param2;
  } else {
    return param1 + param2 + param3;
  }
}

fs.readFile("input.txt", "utf8", (err: any, data: string) => {
  if (err) {
    throw err;
  }

  const arr = data.split("\n");

  const arr1 = arr[0];
  const arr2 = arr[1];

  let inp1 = parseInt(arr1.split(",")[0]);
  let inp2 = parseInt(arr1.split(",")[1]);
  let inp3 = parseInt(arr1.split(",")[2]);

  let i1 = parseInt(arr2.split(",")[0]);
  let i2 = parseInt(arr2.split(",")[1]);

  let res1 = sum(inp1, inp2, inp3);
  let res2 = sum(i1, i2, 0);
  console.log(res1);
  console.log(res2);
});
