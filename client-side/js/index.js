import apiActions from "./api-actions/api-actions";
import Footer from "./components/Footer";
import Header from "./components/Header";
import HomePage from "./pages/HomePage";
import user_login from "./pages/LoginPage";
import userWelcome from "./pages/UserProfilePage";
import MoodsPage from "./pages/MoodsPage";
import TriggersPage from "./pages/TriggersPage";
import CopingMechanismsPage from "./pages/CopingMechanismsPage";
import Consequences from "./pages/ConsequencesPage";
import ResultsPage from "./pages/ResultsPage";
import ResponsesPage from "./pages/ResponsesPage";
import AlternativesPage from "./pages/AlternativesPage";
import ReviewsPage from "./pages/ReviewsPage";
import AboutUsPage from "./pages/AboutUsPage";
import ContactUsPage from "./pages/ContactUsPage";
import LegalPage from "./pages/LegalPage"


const app = document.querySelector("#app");
// const affirmation_api_url ="https://zenquotes.io/api/quotes/";
// const affirmation_api_url = 'https://zenquotes.io/api/today';
const affirmation_api_url = 'https://type.fit/api/quotes';

buildPage();

function buildPage() {
  header();
//   footer();
  renderUserLogin();
  home();
  moods();
  triggers();
  copingMechanisms();
  consequences();
  results();
  alternatives();
  responses();
  reviews();
//   about();
//   contact();
//   legal();
  getAffirmationApi(affirmation_api_url);
}

function header() {
  const headerElement = document.querySelector(".header");
  headerElement.innerHTML = Header();
}
// function footer() {
//   const footerElement = document.querySelector(".footer");
//   footerElement.innerHTML = Footer();
// }

function renderUserLogin() {
  app.innerHTML = user_login();
  app.addEventListener("click", (event) => {
    if (event.target.classList.contains("create_user")) {
      const userName =
        event.target.parentElement.querySelector(".userName").value;
      console.log(userName);
      apiActions.postRequest(
        "http://localhost:8080/create_user_profile",
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

function renderUser() {
  app.innerHTML = userProfilePage();
}

function home() {
  const homeElement = document.querySelector(".nav__list_home");
  homeElement.addEventListener("click", () => {
    app.innerHTML = HomePage();
  });
}

function moods() {
  const moodElement = document.querySelector(".nav__list_moods");
  moodElement.addEventListener("click", () => {
    app.innerHTML = MoodsPage();
  });
}

function triggers() {
  const triggerElement = document.querySelector(".nav__list_triggers");
  triggerElement.addEventListener("click", () => {
    app.innerHTML = TriggersPage();
  });
}

function copingMechanisms() {
  const copingElement = document.querySelector(".nav__list_coping_mechanisms");
  copingElement.addEventListener("click", () => {
    app.innerHTML = CopingMechanismsPage();
  });
}

function consequences() {
  const consequencesElement = document.querySelector(".nav__list_consequences");
  consequencesElement.addEventListener("click", () => {
    app.innerHTML = Consequences();
  });
}

function results() {
  const resultsElement = document.querySelector(".nav__list_results");
  resultsElement.addEventListener("click", () => {
    app.innerHTML = ResultsPage();
  });
}

function alternatives() {
  const alternativesElement = document.querySelector(".nav__list_alternatives");
  alternativesElement.addEventListener("click", () => {
    app.innerHTML = AlternativesPage();
  });
}

function responses() {
  const responseElement = document.querySelector(".nav__list_responses");
  responseElement.addEventListener("click", () => {
    app.innerHTML = ResponsesPage();
  });
}

function reviews() {
  const reviewElement = document.querySelector(".nav__list_reviews");
  reviewElement.addEventListener("click", () => {
    app.innerHTML = ReviewsPage();
  });
}

// function about() {
//   const aboutElement = document.querySelector(".footer_list_aboutUs");
//   aboutElement.addEventListener("click", () => {
//     app.innerHTML = AboutUsPage();
//   });
// }

// function contact() {
//   const contactElement = document.querySelector(".footer_list_contactUs");
//   contactElement.addEventListener("click", () => {
//     const app = document.querySelector("#app");
//     app.innerHTML = ContactUsPage();
//   });
// }

// function legal() {
//   const legalElement = document.querySelector(".footer_list_legal");
//   legalElement.addEventListener("click", () => {
//     app.innerHTML = LegalPage();
//   });
// }

function getAffirmationApi(url) {
    apiActions.getRequest(
    url,
    (quotes) => {
      console.log(quotes);
    });
}
