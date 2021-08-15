export default function ResponsesPage(responses) {
  return `
  <h1>Resources Page</h1>
  </br>
  <div class="userClass">
  ${responses.map((response) => {
      return `
    <div class="user_response">
    <span class="mood_response">We hear you! You feel ${response.mood.mood},</span>
    <input type='hidden' id='moodId' value='${response.mood.id}'>
    <span class="trigger_response"> because of ${response.trigger.name},</span>
    <input type='hidden' id='triggerId' value='${response.trigger.id}'>
    <span class="copingMechanism_response">which causes you to ${response.copingMechanism.title}.</span>
    <input type='hidden' id='copingMechanismId' value='${response.copingMechanism.id}'>
    </br>
    </br>
    <h2><center>Resources For Being ${response.mood.mood}</center></h2>
    </br>
    <center><img src = ${response.mood.moodImage} width="300" height="300" ></center>
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
    </div>
  `;
}