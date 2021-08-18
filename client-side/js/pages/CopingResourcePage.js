import "../../css/response_page.css";

import HRLogoLong from "../../images/hr-logo-long.png";
export default function CopingResourcePage(coping){
    return `
    <div class = "home__container">
    <img class="home__HR_logo" src="${HRLogoLong}">
    <div class="inspirational_quote__container">
    </div>
  ${coping.map((response) => {
      return `
     <h2 class = "copingHeader">${response.copingMechanism.title} Resources</h2>
    <div class="userClassContainer">
    <div class="userDiv1">
    <img src = ${response.copingMechanism.copingMechanismImage} width="400" height="400" >
    </div>
    <div class="userDiv2">
    <h4>Articles</h4>
    <p class = "coping_article">${response.copingMechanism.copingMechanismArticle1}</p>
    <p class = "coping_article">${response.copingMechanism.copingMechanismArticle2}</p>
    <p class = "coping_article">${response.copingMechanism.copingMechanismArticle3}</p>
    </br>
    <h4>Free Resources For Support</h4>
    <p class = "coping_phoneNumber">${response.copingMechanism.copingMechanismPhoneResource1}</p>
    <p class = "coping_phoneNumber">${response.copingMechanism.copingMechanismPhoneResource2}</p>
    <p class = "coping_phoneNumber">${response.copingMechanism.copingMechanismPhoneResource3}</p>
    </div>
    </div>
    <h3 class = "coping_disclaimer"><center>Disclaimer: ${response.copingMechanism.copingDisclaimer}</center></h3>
    `;
    })
    .join("")}
    
  `}