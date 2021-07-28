export default function user_login(user) {
  return `
  
<h1 class="test">
      Healthy Response
      <h2>Your Personal HR</h2>
    </h1>
    <section class="login">
      <input type="text" class="userName" placeholder="Username" />
      <input type="text" class="password" placeholder="Password" />
      <input type="text" class="age" placeholder="Age" />
      <select name="cbtMood" id="assessMood" class="intake">
        <option value="userMood" class="cbt">I feel..</option>
        <option value="userMood" class="cbt">Lonely</option>
        <option value="userMood" class="cbt">Sad</option>
        <option value="userMood" class="cbt">Depressed</option>
        <option value="userMood" class="cbt">Hopeless</option>
        <option value="userMood" class="cbt">Suicidal</option>
        <option value="userMood" class="cbt">Violent</option>
        <option value="userMood" class="cbt">Exhausted</option>
        <option value="userMood" class="cbt">Misunderstood</option>
      </select>
      <select name="cbtTrigger" id="assessTrigger" class="intake">
        <option value="userTrigger" class="cbt">Beause of...</option>
        <option value="userTrigger" class="cbt">Financial Issues</option>
        <option value="userTrigger" class="cbt">Realtionship Issues</option>
        <option value="userTrigger" class="cbt">Occupational Stress</option>
        <option value="userTrigger" class="cbt">Parental Stress</option>
        <option value="userTrigger" class="cbt">Gun Violence</option>
        <option value="userTrigger" class="cbt">Domestic Violence</option>
        <option value="userTrigger" class="cbt">Bullying</option>
      </select>
      <select name="userCoping" id="assessCoping" class="cbt">
        <option value="userCoping" class="cbt">
          Which makes me want to...
        </option>
        <option value="userCoping" class="cbt">Do Drugs</option>
        <option value="userCoping" class="cbt">Consume Alcohol</option>
        <option value="userCoping" class="cbt">Commit Violence</option>
        <option value="userCoping" class="cbt">Commit Suicide</option>
        <option value="userCoping" class="cbt">Isolate</option>
        <option value="userCoping" class="cbt">Eating/Starve</option>
        <option value="userCoping" class="cbt">File for Divorce</option>
      </select>
      <button class="create_user">Continue</button>
      </section>
`;
}

   
