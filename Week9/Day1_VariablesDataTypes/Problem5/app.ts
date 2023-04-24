import * as fs from "fs";

enum Players {
  Hardhik33 = "Hardik Pandya",
  Rishabh47 = "Rishabh Pant",
  Rohit45 = "Rohit Sharma",
  MS7 = "Mahendrasingh Dhoni",
  Virat18 = "Virat Kholi",
  Jasprit59 = "Jasprit Bumrah",
  Lokesh1 = "Lokesh Rahul",
  Prithvi100 = "Prithvi Shaw",
  Shreyas41 = "Shreyas Iyer",
  Rahul19 = "Rahul Dravid",
}

fs.readFile("input.txt", "utf8", (err, data) => {
  if (err) throw err;

  const petName = data.trim();
  const playerName = Players[petName];

  if (playerName) {
    console.log(playerName);
  } else {
    console.log("No player found");
  }
});
