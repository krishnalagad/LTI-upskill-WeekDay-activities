function capitalizeFirstLetter(input) {
  var value = input.value;
  input.value = value.charAt(0).toUpperCase() + value.slice(1);
}

function changeBackgroundColor() {
  var button = document.getElementsByTagName("button")[0];
  button.classList.add("focused");
}
