import AssesmentMenu from "../rendering/AssessMenu";

export default function AssessmentPage() {
  const getMood = new AssesmentMenu();
  return `
        <div class="assessmentMenu">
        <select name="cbtMood" id="assessMood" class="intakeMood">
        <option value="userMood" class="cbt1">I feel..</option>
        <option value="${getMood.getAfraid()}" class="cbt2">Afraid</option>
        <option value="anxious" class="cbt3">Anxious</option>
        <option value="sad" class="cbt4">Sad</option>
        <option value="lonely" class="cbt5">Lonely</option>
        <option value="depressed" class="cbt6">Depressed</option>
        <option value="hopeless" class="cbt7">Hopeless</option>
        <option value="suicidal" class="cbt8">Suicidal</option>
        <option value="violent" class="cbt9">Violent</option>
        <option value="exhausted" class="cbt9">Exhausted</option>        

      </select>
      <select name="cbtTrigger" id="assessTrigger" class="intake">
        <option value="userTrigger" class="cbt10">Beause of...</option>
        <option value="userTrigger" class="cbt11">Financial Issues</option>
        <option value="userTrigger" class="cbt12">Relationship Issues</option>
        <option value="userTrigger" class="cbt13">Occupational Stress</option>
        <option value="userTrigger" class="cbt14">Parental Stress</option>
        <option value="userTrigger" class="cbt15">Gun Violence</option>
        <option value="userTrigger" class="cbt16">Domestic Violence</option>
        <option value="userTrigger" class="cbt17">Bullying</option>
      </select>
      <select name="userCoping" id="assessCoping" class="intake">
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
      <button class="assessBtn">Get Help</button>
      </div>
          `;
}
