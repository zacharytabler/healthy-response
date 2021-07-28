export default function userWelcome(user) {
  return `
  <div class="userClass"></div>
    ${user
      .map((users) => {
        return `
      <div class="user_tile">
      <p class="userName">${users.userName}</p>
      <input type='hidden' id='userId' value='${users.id}'>
      </div>
       
        `;
      })
      .join("")}
    `;
}
