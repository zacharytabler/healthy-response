import ProfileWorksheet from './ProfileWorksheet';

export default function ProfileWorksheet(worksheets) {
    return `
        <div class="profile_worksheets__container">
            ${worksheets.map(worksheet => {
                return `
                    ${ProfileWorksheet(worksheet)}
                `;
            }).join('')}
        </div>
    `;
}