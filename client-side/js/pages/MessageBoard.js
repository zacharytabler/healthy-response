export default function MessageBoard(messages) {
  return `
  <h1>Message Board</h1>
    <div class="messageBoard">
    ${messages
      .map((post) => {
        return `
        <div class="messageBoardTable">
        <p class="subject">${post.subject}</p>
        <p class="title">${post.title}</p>
        <p class="post">${post.content}</p>
        <div class="reply">
        <input type="text" class="replyTitle" placeholder="Reply Title">
        <input type="text" class="replySubject" placeholder="Reply Subject">
        <input type="text" class="replyContent" placeholder="Reply Content">
        <button class="replyButton">Reply</button>
        <input type='hidden' id='profileId' value='${post.id}'>
        </div>
       
        `;
      })
      .join("")}
    </div> 
    </div>   
    `;
}
