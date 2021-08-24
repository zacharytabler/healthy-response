import ProfileWorksheet from './ProfileWorksheet';

export default function ProfileWorksheets(user) {
    return `
        <div class="profile_worksheets__container">
            ${user.worksheets.map(worksheet => {
                const date = new Date(worksheet.timestamp);
                return `
                
                    ${ProfileWorksheet(worksheet)}
                `;
            }).join('')}
        </div>
    `;
}