import apiActions from "./api-actions/api-actions";
import Footer from "./components/Footer";
import Header from "./components/Header";
import user_login from "./pages/LoginPage";
import userWelcome from "./pages/UserProfilePage";

const app = document.querySelector("#app");

buildPage();

function buildPage() {
  renderUserLogin();
}

function header() {
  const headerElement = document.querySelector(".header");
  headerElement.innerHTML = Header();
}
function footer() {
  const footerElement = document.querySelector(".footer");
  footerElement.innerHTML = Footer();
}

function renderUserLogin() {
  app.innerHTML = userWelcome();
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("create_user")) {
      const userName =
        event.target.parentElement.querySelector(".userName").value;
      console.log(userName);
      apiActions.postRequest(
        "http://localhost:8080/create_user",
        {
          userName: userName,
        },
        () => {
          console.log("callback firing");
        }
      );
    }
  });
}

function renderUsers() {}
