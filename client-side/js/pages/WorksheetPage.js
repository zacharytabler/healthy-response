import Worksheet from '../components/Worksheet';

export default function WorksheetPage(worksheet) {
    return `
        ${Worksheet(worksheet)}
    `;
}