import Worksheet from '../components/Worksheet';

export default function WorksheetPage(worksheet) {
    return `
        <h1>Worksheet Page</h1>
        ${Worksheet(worksheet)}
    `;
}