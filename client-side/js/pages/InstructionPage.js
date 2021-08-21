import Instruction from '../components/Instruction';

export default function InstructionPage(instruction) {
    return `
        ${Instruction(instruction)}
    `;
}