function showGamePage() {
  document.getElementById("instructions").style.display = "none";
  document.getElementById("gamePage").style.display = "block";
  document.getElementById("start").style.display = "none";
  document.onkeydown = function (event) {
    event = event || window.event;
    if (event.keyCode >= 65 && event.keyCode <= 90) {
      var char = String.fromCharCode(event.keyCode);
      document.getElementById("typedWord").innerHTML += char.toUpperCase();
    } else if (event.keyCode == 13) {
      alert("Submitted: " + document.getElementById("typedWord").innerHTML);
      document.getElementById("typedWord").innerHTML = "";
      document.getElementById("gamePage").style.display = "none";
      document.getElementById("start").style.display = "block";
    }
    if (event.keyCode === 32) {
      document.getElementById("typedWord").innerHTML += " ";
    }
  };
}
