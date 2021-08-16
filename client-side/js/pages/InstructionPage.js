import Instruction from '../components/Instruction';

export default function InstructionPage(instruction) {
    console.log('hi from instruction page');
    console.log(instruction);
    return `
        <h1>Instruction Page</h1>
        ${Instruction(instruction)}
    `;
}