const fs = require("fs");
fs.readFile("input.txt", (err, data) => {
  if (err) {
    console.error(err);
    return;
  }

  var inp = data.toString().trim().split("\n");
  list1 = convertStringToList(inp[0]);
  list2 = convertStringToList(inp[1]);

  compareLists(list1, list2);
});

function compareLists(list1, list2) {
  if (
    list1.length === list2.length &&
    list1.every((value, index) => value === list2[index])
  ) {
    console.log("Equal");
  } else if (list1.length > list2.length && containsList(list1, list2)) {
    console.log("SuperList");
  } else if (list2.length > list1.length && containsList(list2, list1)) {
    console.log("SubList");
  } else {
    console.log("UnEqual");
  }
}

function containsList(list1, list2) {
  for (let i = 0; i <= list1.length - list2.length; i++) {
    if (
      list1
        .slice(i, i + list2.length)
        .every((value, index) => value === list2[index])
    ) {
      return true;
    }
  }
  return false;
}

function convertStringToList(str) {
  const strArr = str.split(",");
  const intArr = strArr.map((str) => parseInt(str));
  return intArr;
}
