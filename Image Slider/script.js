const images = ["one.jpg", "two.jpg", "third.jpg"];

let currentIndex = 0;
const slider = document.getElementById("slider");
const prevBtn = document.getElementById("prevBtn");
const nextBtn = document.getElementById("nextBtn");

function updateImage() {
  slider.src = images[currentIndex];
}

prevBtn.addEventListener("click", () => {
  currentIndex = currentIndex === 0 ? images.length - 1 : currentIndex - 1;
  updateImage();
});

nextBtn.addEventListener("click", () => {
  currentIndex = currentIndex === images.length - 1 ? 0 : currentIndex + 1;
  updateImage();
});

updateImage();
