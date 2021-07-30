import apiActions from "./api-actions/api-actions";
import Footer from "./components/Footer";
import Header from "./components/Header";
import HomePage from "./pages/HomePage";
import user_login from "./pages/LoginPage";
import userWelcome from "./pages/UserProfilePage";
import MoodsPage from "./pages/MoodsPage";
import TriggersPage from "./pages/TriggersPage";
import CopingMechanismsPage from "./pages/CopingMechanismsPage";
import ConsequencesPage from "./pages/ConsequencesPage";
import ResultsPage from "./pages/ResultsPage";
import ResponsesPage from "./pages/ResponsesPage";
import AlternativesPage from "./pages/AlternativesPage";
import ReviewsPage from "./pages/ReviewsPage";
import AboutUsPage from "./pages/AboutUsPage";
import ContactUsPage from "./pages/ContactUsPage";
import LegalPage from "./pages/LegalPage"


const app = document.querySelector("#app");

buildPage();

function buildPage() {
  header();
  footer();
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
  about();
  contact();
  legal();
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
  console.log('firing!');
  apiActions.getRequest('http://localhost:8080/moods', moods => {
  console.log(moods);
  app.innerHTML = MoodsPage(moods);
  })
  })
}

function triggers() {
  const triggerElement = document.querySelector(".nav__list_triggers");
  triggerElement.addEventListener("click", () => {
    console.log('firing!');
    apiActions.getRequest('http://localhost:8080/triggers', triggers => {
    console.log(triggers); 
    app.innerHTML = TriggersPage(triggers);
  })
})
}

function copingMechanisms() {
  const copingElement = document.querySelector(".nav__list_coping_mechanisms");
  copingElement.addEventListener("click", () => {
    console.log('firing!');
    apiActions.getRequest('http://localhost:8080/coping', copingMechanisms => {
    console.log(copingMechanisms);
    app.innerHTML = CopingMechanismsPage(copingMechanisms);
  })
})
}

function consequences() {
  const consequencesElement = document.querySelector(".nav__list_consequences");
  consequencesElement.addEventListener("click", () => {
    console.log('firing!');
    apiActions.getRequest('http://localhost:8080/consequences', consequences => {
    console.log(consequences);
    app.innerHTML = ConsequencesPage(consequences);
  })
})
}

function results() {
  const resultsElement = document.querySelector(".nav__list_results");
  resultsElement.addEventListener("click", () => {
    console.log('firing!');
    apiActions.getRequest('http://localhost:8080/results', results => {
    console.log(results);
    app.innerHTML = ResultsPage(results);
  })
})
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
    console.log('firing!');
    apiActions.getRequest('http://localhost:8080/responses', responses => {
    console.log(responses);
    app.innerHTML = ResponsesPage(responses);
  })
})
}



function reviews() {
  const reviewElement = document.querySelector(".nav__list_reviews");
  reviewElement.addEventListener("click", () => {
    app.innerHTML = ReviewsPage();
  });
}

function about() {
  const aboutElement = document.querySelector(".footer_list_aboutUs");
  aboutElement.addEventListener("click", () => {
    app.innerHTML = AboutUsPage();
  });
}

function contact() {
  const contactElement = document.querySelector(".footer_list_contactUs");
  contactElement.addEventListener("click", () => {
    const app = document.querySelector("#app");
    app.innerHTML = ContactUsPage();
  });
}

function legal() {
  const legalElement = document.querySelector(".footer_list_legal");
  legalElement.addEventListener("click", () => {
    app.innerHTML = LegalPage();
  });
}

