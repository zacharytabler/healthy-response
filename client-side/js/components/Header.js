import "../../css/header_footer.css";

export default function Header() {
  return `
  <nav>
  	<input type="checkbox">
	<label>&equiv;</label>
        <ul>
            <li class='nav__list_home'>Home</li>
            <li class='nav__list_profile'>Profile</li>
            <li class='nav__list_moods'>Moods</li>
            <li class='nav__list_triggers'>Triggers</li>
<<<<<<< HEAD
            <li class='nav__list_users'>Users</li>
            <li class='nav__list_appointment'>Appointment</li>
            <li class='nav__list_aboutUs'>About Us</li>
            
=======
            <li class='nav__list_coping_mechanisms'>Coping Mechanisms</li>
            <li class='nav__list_consequences'>Consequences</li>
            <li class='nav__list_results'>Results</li>
            <li class='nav__list_alternatives'>Alternatives</li>
            <li class='nav__list_responses'>Responses</li>
            <li class='nav__list_reviews'>Reviews</li>
            <li class='nav__list_appointment'>Appointment</li>

>>>>>>> 51f7ed1789df2af83edac306bfe66458ee02aaf0
        </ul>
    </nav>
        `;
}
