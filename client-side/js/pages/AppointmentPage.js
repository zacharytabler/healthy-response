export default function AppointmentPage() {
  return `
  <link rel="stylesheet" href="css/form.css">
    <h1>Schedule an appointment</h1>
    
    <div class="container">
    <div class="card">
       
        <div class="time__container">
            <div class="section">
                <div class="box">
                    
                </div><span>Date &amp; Time</span>
            </div>
            <form action="" class="form__time">
                <div class="date">
                    <label for="date"> Appointment Date</label> <input id="date" type="date">
                </div>
                <div class="time">
                    <label for="time"> Appointment Time</label> <input id="time" type="time">
                </div>
                </div>

    `;
}