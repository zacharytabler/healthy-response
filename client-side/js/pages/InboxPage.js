export default function InboxPage(reply) {
  return `
  <div class='myInbox'>
  ${reply.map((replies) => {
    return `
      <h1>My Messages</h1>
      <div class="inbox">
      <p class="content">${replies.subject}</p>
      <p class="subject">${replies.title}</p> 
      <p class="subject">${replies.content}</p>
      <input type='hidden' id='messageId' value='${replies.id}>
      </div>
      `;
  })}
  </div>
  
    `;
}
