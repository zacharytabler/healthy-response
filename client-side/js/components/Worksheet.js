import Form from '../worksheet-forms/StrengthsSpottingByExceptionFinding';

export default function Worksheet(worksheet) {
    return `
        ${ getForm(worksheet) }
    `;
}

function getForm(worksheet) {
    return `
        ${ Form(worksheet) }
    `;
}