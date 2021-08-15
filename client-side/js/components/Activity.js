export default function Activity(activity) {
    console.log(activity.worksheet.acceptUserInput);
    return `
        <div class="activity__container">
            ${activity.worksheet.title}
            <input type='hidden' id='activityId' value=${activity.id}/>
            <input type='hidden' id='worksheetTitle' value=${activity.worksheet.title} + '.js'/>
            if (activity.worksheet.acceptUserInput) {
                <a href='../worksheet-forms/${activity.worksheet.title}'>
                <h2 class='activity__title'>${activity.title}</h2>
                </a>
                <p class='activities-list__description'>${activity.description}</p>
            } else {
                <a href='../activity-instructions/${activity.worksheet.title}'>
                    <h2 class='activity__title'>${activity.title}</h2>
                    <p class='activities-list__description'>${activity.description}</p>
                </a>
            }
        </div>
    `;
}
