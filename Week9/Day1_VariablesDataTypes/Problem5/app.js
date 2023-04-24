"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var fs = require("fs");
var Players;
(function (Players) {
    Players["Hardhik33"] = "Hardik Pandya";
    Players["Rishabh47"] = "Rishabh Pant";
    Players["Rohit45"] = "Rohit Sharma";
    Players["MS7"] = "Mahendrasingh Dhoni";
    Players["Virat18"] = "Virat Kholi";
    Players["Jasprit59"] = "Jasprit Bumrah";
    Players["Lokesh1"] = "Lokesh Rahul";
    Players["Prithvi100"] = "Prithvi Shaw";
    Players["Shreyas41"] = "Shreyas Iyer";
    Players["Rahul19"] = "Rahul Dravid";
})(Players || (Players = {}));
fs.readFile("input.txt", "utf8", function (err, data) {
    if (err)
        throw err;
    var petName = data.trim();
    var playerName = Players[petName];
    if (playerName) {
        console.log(playerName);
    }
    else {
        console.log("No player found");
    }
});
