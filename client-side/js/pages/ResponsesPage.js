export default function ResponsesPage(responses) {
  return `
    <h1>Responses page</h1>
    <div class='responses-constructor'>
    ${responses.map(response => {
      return `
      <p class='responses-constructor__id'><input type='hidden' id='responseId' value='${response.id}'></p>
      ${response.trigger.map(trigger => {
        return `
        <p class='moods-constructor__trigger-title'>Trigger Name: ${trigger.name}
          <input type='hidden' id='triggerId' value='${trigger.id}'>
        </p>
        <p class='moods-constructor__trigger-description'>Trigger Description: ${trigger.description}
      </p>
          `
      }).join('')}  
  `
  }).join('')}
  </div>
    `;
}