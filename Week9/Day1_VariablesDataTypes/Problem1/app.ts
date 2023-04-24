// import * as fs from 'fs';



let fs: any = require('fs');

fs.readFile("input.txt", "utf8", (err: any, data: string) => {
  if (err) throw err;
  console.log(data + "!!!");
});
