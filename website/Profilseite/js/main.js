function extend() {
  var mobile_nav = document.getElementById("gotocontent");
  mobile_nav.classList.toggle("weg");
}

function phone() {
  iframe = document.getElementById("iframe");
  iframe.classList.toggle("smaller");

  button = document.getElementById("phone");
  if (iframe.classList.contains("smaller")) {
    button.innerHTML = "Desktop View";
    document.getElementById("phone").style.width = "344px";
  }
  else {
    button.innerHTML = "Mobile View";
    document.getElementById("phone").style.width = "574px";
  }
}

function accordion() {
  var extend = document.getElementsByClassName("accordionContent");
  extend.classList.toggle("showAccordion");
}
