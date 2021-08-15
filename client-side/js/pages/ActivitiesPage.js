import Activities from '../components/Activities';

export default function ActivitiesPage(activities) {
    return `
        <h1>Activities Page</h1>
        ${Activities(activities)}
    `;
}