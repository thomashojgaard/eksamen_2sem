<div class="container">
    <div>
    <label for="navn">Navn *</label>
    <br>
    <input type="text" id="navn">
    </div>

    <div>
    <label for="email">Email *</label>
    <br>
    <input type="email" id="email">
    </div>

    <div>
    <label for="besked">Besked *</label>
    <br>
    <textarea id="besked" rows="3"></textarea>
    </div>

    <div>
    <button onclick="sendEmail()">Send Besked</button>
    </div>
    </div>
    
<style>
    .container {
        background-color: white;
        box-shadow: 2px 2px 2px 2px rgba(0, 0, 0, 0.2);
        border-radius: 5px;
        padding: 5% 0 5% 5%;
    }
    
    input[type=text], select, textarea {
  width: 90%;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  resize: vertical;
}

 input[type=email], select, textarea {
  width: 90%;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  resize: vertical;
}

</style>
    
<script src="script.js"></script>
    <script type="text/javascript" src="https://cdn.jsdelivr.net/npm/@emailjs/browser@3/dist/email.min.js"></script>
<script type="text/javascript">
(function() {
emailjs.init("H9fN83Hpem_fvo8cE");
})();
</script>
    
    
<script>
const serviceID = "service_iabiekk"
const templateID = "template_hhtnhno"
const userID = "H9fN83Hpem_fvo8cE"

function sendEmail() {
    console.log("klikket på")
    const navn = document.getElementById("navn").value
    const email = document.getElementById("email").value
    const besked = document.getElementById("besked").value

    const emailData = {
        name: navn,
        email: email,
        message: besked
    }

    emailjs.send(serviceID, templateID, emailData, userID);
}


</script>
