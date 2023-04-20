const fs = require("fs");

fs.readFile("input.txt", (err, data) => {
    if (err) {
        console.error(err);
        return;
    }

    var arr = data.toString().trim().split("\n");
    // console.log(arr);
    let choice = parseInt(arr[0]);
    let no1 = parseInt(arr[1]);
    let no2 = parseInt(arr[2]);
    perform(choice, no1, no2);
});

function perform(choice, no1, no2) {
    switch (choice) {
      case 1:
        console.log(no1 + no2);
        break;
      case 2:
        console.log(no1 - no2);
        break;
      case 3:
        console.log(no1 * no2);
        break;
      case 4:
        console.log(no1 / no2);
        break;

      default:
        break;
    }
}