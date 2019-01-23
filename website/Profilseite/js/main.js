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
    document.getElementById("iframe").style.marginRight = "250px";
  }
  else {
    button.innerHTML = "Mobile View";
    document.getElementById("phone").style.width = "574px";
    document.getElementById("iframe").style.marginRight = "20px";
  }
}


window.onscroll = function() {scrollFunction()};

function scrollFunction() {
  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
    document.getElementById("gotop").style.display = "block"
  } else {
    document.getElementById("gotop").style.display = "none";
  }
}

function gotoTop() {
  document.body.scrollTop = 0;
  document.documentElement.scrollTop = 0;
}
