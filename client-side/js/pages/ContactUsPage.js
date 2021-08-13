export default function ContactUsPage() {
    return `
  
      <h1> Talk To Us !! </h1> 
      <div class="container">
    
    <div class="row">
      <div class="column">

       <form action="/action_page.php" method="post" target="_blank">
          <label for="fname">First Name</label>
          <input type="text" id="fname" name="firstname" placeholder="Your name..">
          <span class="invalid" id="name-status"></span>
          <label for="lname">Last Name</label>
          <input type="text" id="lname" name="lastname" placeholder="Your last name..">
          <span class="invalid" id="name-status"></span>
          <label for="email">Email</label>
          <input type="text" id="email" name="email placeholder="Your email..">
          <span class="invalid" id="email-status"></span>
          <label for="email"> Your Thoughts </label>
          <textarea id="subject" name="subject" placeholder="Write something.." style="height:170px"></textarea>
          
          <div class="star-rating" >
          <div class="thanks-msg">Thank you for your feedback !!!</div>
            <div class="star-input">
                <input type="radio" name="rating" id="rating-5">
                <label for="rating-5" class="fas fa-star">Fully recommend</label>
                <input type="radio" name="rating" id="rating-4">
                <label for="rating-4" class="fas fa-star">Likely recommend </label>
                <input type="radio" name="rating" id="rating-3">
                <label for="rating-3" class="fas fa-star">Indifferent</label>
                <input type="radio" name="rating" id="rating-2">
                <label for="rating-2" class="fas fa-star">Unlikely to recommend</label>
                <input type="radio" name="rating" id="rating-1">
                <label for="rating-1" class="fas fa-star"> Do not recommend</label>

  
                    <span class="rating-reaction"></span>
                    <button onclick="submit" class="submit-rating">Submit</button>

                    
                
          </div>
        </form>
      </div>
    </div>
      `;
  }