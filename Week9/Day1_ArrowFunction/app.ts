import * as fs from "fs";

fs.readFile("input.txt", "utf8", (err: any, data: string) => {
    if (err) throw err;

    const year: number = parseInt(data);
    console.log(isLeapYear(year));
});

const isLeapYear = (year: number): boolean => {
    if (year % 4 !== 0) {
      return false;
    } else if (year % 100 !== 0) {
      return true;
    } else if (year % 400 !== 0) {
      return false;
    } else {
      return true;
    }
}
