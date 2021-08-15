const startButton = document.querySelector(".startButton"),
  hiddenScreenDiv = document.querySelector(".hiddenScreen"),
  hiddenMessage = document.querySelector(".hiddenMessage");

function showHiddenScreen() {
  startButton.addEventListener("click", () => {
    hiddenScreenDiv.style.display == "block";
    startButton.style.display == "none";
  });
}

