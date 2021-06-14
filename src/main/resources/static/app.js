const button = document.getElementById("myBtn");
const closeButton = document.querySelector(".close");
const modalContent = document.querySelector(".modal");

button.addEventListener("click", () => {
	modalContent.style.display = "block";
});

closeButton.addEventListener("click", () => {
	modalContent.style.display = "none";
});