import '../../css/home_page.css'

import HRLogoLong from '../../images/hr-logo-long.png'
import VHSLogo from '../../images/vhs-logo-black.png'
import Profile from '../../images/1.png'
import Assessment from '../../images/2.png'
import Activities from '../../images/3.png'
import Messages from '../../images/4.png'
import MessageBoard from '../../images/5.png'
import Appointment from '../../images/6.png'
import Resources from '../../images/7.png'
import MemberSpotlight from '../../images/8.png'
import HRBlog from '../../images/9.png'

export default function HomePage() {
  return `
  <div class="home__container">
 <img class="home__HR_logo" src="${HRLogoLong}">
        <div class="inspirational_quote__container"></div>
        <div class="home__card">
        <img class="home_card_img" src="${Profile}">
        <img class="home_card_img round" src="${Assessment}">
        <img class="home_card_img" src="${Activities}">
        <img class="home_card_img" src="${Messages}">
        <img class="home_card_img" src="${MessageBoard}">
        <img class="home_card_img" src="${Appointment}">
        <img class="home_card_img round" src="${Resources}">
        <img class="home_card_img round" src="${MemberSpotlight}">
        <img class="home_card_img" src="${HRBlog}">
        </div>
        </div>
    `;
}
