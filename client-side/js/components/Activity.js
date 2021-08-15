export default function Activity(activity) {
    return`
        <div class="activity__container">
        <input type='hidden' id='activityId' value=${activity.url}/>
        <h2 class='activities-list__title'>${activity.title}</h2>
        <p class='activities-list__description'>${activity.description}</p>
        </div>
    `;
}
