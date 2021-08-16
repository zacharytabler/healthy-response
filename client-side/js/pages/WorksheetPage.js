import Worksheet from '../components/Worksheet';

export default function WorksheetPage(worksheetId) {
    return `
        <h1>Worksheet Page</h1>
        ${Worksheet(worksheet)}
    `;
}