import Activity from './Activity';
import nst from "../../images/nst.jpg"
import "../../css/activities.css"
import sgt from "../../images/strength.jpg"
export default function Activities(activities) {
    return `
    <img class="nst" src="${nst}">
        <div class="activities__container">
            ${activities.map(activity => {
                return `
                    ${Activity(activity)}
                `;
            }).join('')}
        </div>
        <img class="sgt" src="${sgt}">
    `;
}