import "../../css/response_page.css";

import HRLogoLong from "../../images/hr-logo-long.png";
export default function MoodResourcePage(moods){
    return `
    <div class = "home__container">
    <img class="home__HR_logo" src="${HRLogoLong}">
    <div class="inspirational_quote__container">
    </div>
    <div class="userClassContainer">
  ${moods.map((response) => {
      return `
      <center><h2><center>Resources For Being ${response.mood.mood}</center></h2>
    </br>
    <center><img src = ${response.mood.moodImage} width="400" height="400" ></center>
    <p class = "mood_definition"><center>${response.mood.moodDefinition}</center></p>
    </br>
    <h4>10 Minute Meditation</h4>
    ${response.mood.moodVideo}
    </br>
    </br>
    <h4>Articles</h4>
    <p class = "mood_article">${response.mood.moodArticle1}</p>
    <p class = "mood_article">${response.mood.moodArticle2}</p>
    <p class = "mood_article">${response.mood.moodArticle3}</p>
    </br>
    <h4>Free Support Hotlines</h4>
    <p class = "mood_phoneNumbers">${response.mood.moodPhoneResource1}</p>
    <p class = "mood_phoneNumbers">${response.mood.moodPhoneResource2}</p>
    <p class = "mood_phoneNumbers">${response.mood.moodPhoneResource3}</p>
    `;
    })
    .join("")}
    </div></center> 
  `;
}
