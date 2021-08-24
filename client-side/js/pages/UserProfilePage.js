import "../../css/userProfilePage.css";
import ProfileWorksheet from '../components/ProfileWorksheet';

export default function userWelcome(users) {
  console.log(users);
  return `
  <div class="userClass">
    ${users
      .map((user) => {
        console.log(user);
        return `
        <h2 class="userName">Welcome ${user.firstName}!</h2>
        </br>
        <center><div class="user_tile">
      <h3 class="tile_header"> User Profile:</h3>
      <p class="userFirstName"><b>First Name:</b> ${user.firstName}</p>
      <p class="userLastName"><b> Last Name:</b>  ${user.lastName}</p>
      <p class="userEthnicity"><b> Ethnicity:</b> ${user.ethnicity}</p>
      <p class="userCity"><b>City:</b>  ${user.city}</p>
      <p class="userState"><b>State:</b> ${user.state}</p>
      <p class ="status"><b>Status:</b>  ${user.status}</p>
      <p class ="aboutMe"><b>About Me:</b>  ${user.aboutMe}</p>
      <br />
      <p class ="worksheets"><b>Worksheet Submissions</b></p>
      ${ worksheets(user)}
      <input type='hidden' id='userId' value='${user.id}'></div></center>
        `;

      })
      .join("")}
      </div> 
    `;
}

{/* <p class ="aboutMe"><b>About Me:</b>  ${user.aboutMe}</p> */}

function worksheets(user) {
  if(user.worksheets.length > 0) {
    return `
    <div class="worksheet__title"> 
      <a class="worksheet__link" href='#'>${user.worksheets[0].title}   </a>
      <input type="button" class="delete" value="Delete" />
      <input type='hidden' class='worksheetId' value='${0}'/>
    </div>
    </br>
    `;
    console.log(document.querySelect);
  } else {
    return `
    <p>No activity worksheet submissions yet</p>
    `;
  }
}