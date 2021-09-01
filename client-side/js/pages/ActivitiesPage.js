import Activities from '../components/Activities';
import "../../css/activities.css"
export default function ActivitiesPage(activities) {
    return `
        <div class="bdrp">
        <h1>Get Involved In Your Mental Health Today!</h1>
        ${Activities(activities)}
        </div>
       
    `;
}