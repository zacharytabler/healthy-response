import apiActions from "./api-actions/api-actions";
import Footer from "./components/Footer";
import Header from "./components/Header";
import HomePage from "./pages/HomePage"
import AboutUsPage from "./pages/AboutUsPage";
import user_login from "./pages/LoginPage";
import userWelcome from "./pages/UserProfilePage";

const app = document.querySelector("#app");

buildPage();

function buildPage() {
  
  header();
  footer();
  home();
  about();
  // mood();
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

function home (){
  const homeElement = document.querySelector(".nav__list_home");
  homeElement.addEventListener("click", ()=>{
    app.innerHTML = HomePage();
  })
}


function about() {
  const aboutElement = document.querySelector(".footer_list_aboutUs");
  aboutElement.addEventListener("click", () => {
    app.innerHTML = AboutUsPage();
  });
}

// function mood() {
//   const moodElement = document.querySelector()
// }

function renderUserLogin() {
  app.innerHTML = user_login();
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
