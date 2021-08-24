import Display from '../activity-instructions/ReframingCriticalSelfTalk';

export default function Instruction(instruction) {
    return `
        ${ getDisplay() }
    `;
}

function getDisplay() {
    return `
        ${ Display() }
    `;
}