export default function user_login(user) {
  return `
    <h1>Welcome to HR</h1>
    ${user.map((users) => {
      return `
        <p>${users.userName}</p>
        <p>${users.password}</p>
        `;
    })}
    `;
}
