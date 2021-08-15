import "../../css/header_footer.css";

export default function Header() {
  return `
  <nav>
  	<input type="checkbox">
	<label>&equiv;</label>
  <ul class="nav__header" id="myLinks">
    <li class='nav__list_home link' onclick="myFunction()">Home</li>
    <li class='nav__list_message'>My Messages</li>
    <li class='nav__list_profile'>Profile</li>
    <li class='nav__list_messageBoard'>Message Board</li>
    <li class='nav__list_activities'>Activities</li>
    <li class='nav__list_reviews'>Reviews</li>
    <li class='nav__list_appointment'>Appointment</li>
  </ul>
  <a href="javascript:void(0);" class="icon" onclick="myFunction()">
    <i class="fa fa-bars"></i>
  </a>
</nav>
        `;
}
