
import '../../css/login.css'
import LoginLogo from '../../images/hr-logo-login.png'
import BackgroundLogo from '../../images/login.jpg'

export default function LoginDraft() {
    return `
    <div class="login__body">
    <div class="login__container">
     <img class="loginLogo" src="${LoginLogo}" alt="healthy response logo"/>
      <div class="userNameLogin">
      <input type="text" id="userNameLogin" class="userName" name="username" placeholder="USERNAME">
      <input type="text" id="userPasswordLogin" class="password" name="password" placeholder="PASSWORD">
      <input class="loginButton" type="submit" value="LOGIN"></input>
      <p class="loginTOS">TERMS OF SERVICE</p>
      </div>
   </div>
   </div>
      `;
  }

