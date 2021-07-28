export default function userWelcome() {
  return `
 <h1>Welcome to HR</h1>
    ${user.map((users) => {
      return `
        <p>${users.userName}</p>
        `;
    })}
    `;
}
