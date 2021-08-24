export default function ProfileWorksheet(worksheet) {
    return `
        <div class="profile_worksheet__container">
            <input type='hidden' class='worksheetId' value='${worksheet.id}'/>
            <h2 class="title"> ${worksheet.title} </h2>
            
            <br />
            <p class ="answer"> ${worksheet.answer1}</p>
            <p class ="answer"> ${worksheet.answer2}</p>
            <p class ="answer"> ${worksheet.answer3}</p>
            <p class ="answer"> ${worksheet.answer4}</p>
        </div>
    `;
}

{/* <p>Submitted on ${date.getMonth() + 1}/${date.getDate()}/${date.getFullYear()} </p> */}
