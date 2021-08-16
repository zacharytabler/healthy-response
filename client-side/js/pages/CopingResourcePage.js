import "../../css/home_page.css";

import HRLogoLong from "../../images/hr-logo-long.png";
export default function CopingResourcePage(coping){
    return `
    <div class = "home__container">
    <img class="home__HR_logo" src="${HRLogoLong}">
    <div class="inspirational_quote__container">
    </div>
    `;
}