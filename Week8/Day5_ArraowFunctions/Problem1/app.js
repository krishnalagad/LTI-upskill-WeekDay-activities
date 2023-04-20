const fs = require('fs')

fs.readFile('input.txt', (err, data) => {
    if (err) {
        console.error(err);
        return;
    }

    let arr = data.toString().trim().split('\n');

    if (arr.length === 3) {
        let p = parseInt(arr[0]);
        let n = parseInt(arr[1]);
        let r = parseInt(arr[2]);

        let result = calculateSimpleInterest(p, n, r);

        console.log(result);
    } else {
        let p = parseInt(arr[0]);
        let n = parseInt(arr[1]);

        let result = calculateSimpleInterest(p, n);

        console.log(result);
    }
    

})

const calculateSimpleInterest = (p, n, r = 5) => {
  const interest = (p * n * r) / 100;
  return Math.round(interest);
};
