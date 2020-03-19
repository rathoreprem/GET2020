function showVehicle() {
    document.getElementById("vehicleDetails").style = "display:none";
    document.getElementById("addVehicle").style = "display:block";
}

function showEmployee() {
    document.getElementById("employeeDetails").style = "display:none";
    document.getElementById("userform").style = "display:block";
}

function hideVehicle() {
    document.getElementById("vehicleDetails").style = "display:block";
    document.getElementById("addVehicle").style = "display:none";
}

function hideEmployee() {
    document.getElementById("employeeDetails").style = "display:block";
    document.getElementById("userform").style = "display:none";
}

function showFeedback() {
    document.getElementById("feedback").style = "display:none";
    document.getElementById("giveFeedback").style = "display:block";
}

function showPricing() {
    document.getElementById("pricingLabel").style = "display:none";
    document.getElementById("pricing").style = "display:block";
}

function hidePricing() {
    document.getElementById("pricingLabel").style = "display:block";
    document.getElementById("pricing").style = "display:none";
}

function namevalidation() {
    var y = 1;
    var x = document.getElementById("employeeName").value;
    let pattern = /(^[a-zA-Z ]{2,}$)/;
    if (x.match(pattern) == null) {
        document.getElementById("employeeName").style = "border:4px solid red";
        y = 0;
        return;
    }
    document.getElementById("employeeName").style = "border:4px solid green";
    document.getElementById("gender").style = "display:block";
    var employeeName = document.getElementById("employeeName").value;
    document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Tell Your Gender..";
    document.getElementById("fullname").style = "display:none";
}

function fullname() {
    var x = event.keyCode;
    if (x == 13) {
        namevalidation();
    }
}

function genders() {
    document.getElementById("employeeEmail").style = "display:block";
    var employeeName = document.getElementById("employeeName").value;
    document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your Email..";
    document.getElementById("gender").style = "display:none";
}

function emailvalidation() {
    var email = document.getElementById('employeeEmails').value;
    var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if (email.match(filter) == null) {
        document.getElementById("employeeEmails").style = "border:4px solid red";
        y = 0;
        return;
    }
    document.getElementById("password").style = "display:block";
    var employeeName = document.getElementById("employeeName").value;
    document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your Password..";
    document.getElementById("employeeEmail").style = "display:none";
}

function email() {
    var x = event.keyCode;
    if (x == 13) {
        emailvalidation();
    }
}

function passvalidation() {
    var password = document.getElementById("employeePassword").value;
    var special = 0,
        number = 0,
        lower = 0,
        upper = 0;
    for (var i = 0; i < password.length; i++) {
        if (password.charCodeAt(i) >= 48 && password.charCodeAt(i) <= 57) {
            number++;
        } else if (password.charCodeAt(i) >= 97 && password.charCodeAt(i) <= 123) {
            lower++;
        } else if (password.charCodeAt(i) >= 65 && password.charCodeAt(i) <= 91) {
            upper++;
        } else {
            special++;
        }
    }
    if (special == 0 || lower == 0 || upper == 0 || number == 0 || password.length < 8) {
        document.getElementById("employeePassword").style = "border:4px solid red";
        y = 0;
        return;
    }
    document.getElementById("confirmpassword").style = "display:block";
    var employeeName = document.getElementById("employeeName").value;
    document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your Confirm Password..";
    document.getElementById("password").style = "display:none";
}

function password() {
    var x = event.keyCode;
    if (x == 13) {
        passvalidation();
    }

}

function confirmpassvalidation() {
    var password = document.getElementById("employeePassword").value;
    var cpassword = document.getElementById("employeeConfirmPassword").value;
    var special = 0,
        number = 0,
        lower = 0,
        upper = 0;
    for (var i = 0; i < password.length; i++) {
        if (password.charCodeAt(i) >= 48 && password.charCodeAt(i) <= 57) {
            number++;
        } else if (password.charCodeAt(i) >= 97 && password.charCodeAt(i) <= 123) {
            lower++;
        } else if (password.charCodeAt(i) >= 65 && password.charCodeAt(i) <= 91) {
            upper++;
        } else {
            special++;
        }
    }
    if (password != cpassword) {
        document.getElementById("employeeConfirmPassword").style = "border:4px solid red";
        y = 0;
        return;
    }
    document.getElementById("confirmpassword").style = "display:none";
    var employeeName = document.getElementById("employeeName").value;
    document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your Conatct number..";
    document.getElementById("number").style = "display:block";
}


function confirmpassword() {
    var x = event.keyCode;
    if (x == 13) {
        confirmpassvalidation();
    }
}

function numbervalidation() {
    var x = document.getElementById("employeeContact").value;
    if (x.length != 10 || x.length < 10) {
        document.getElementById("employeeContact").style = "border:4px solid red";
        return;
    }
    document.getElementById("number").style = "display:none";
    var employeeName = document.getElementById("employeeName").value;
    document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your vehicle company Name..";
    document.getElementById("vehicleCompanyName").style = "display:block";
}

function number() {
    var x = event.keyCode;
    if (x == 13) {
        numbervalidation();
    }
}

function vehicleCompanyName() {
    var x = event.keyCode;
    if (x == 13) {
        document.getElementById("vehicleModel").style = "display:block";
        var employeeName = document.getElementById("employeeName").value;
        document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your vehicle Model..";
        document.getElementById("vehicleCompanyName").style = "display:none";
    }
}

function vehicleModel() {
    var x = event.keyCode;
    if (x == 13) {
        document.getElementById("Types").style = "display:block";
        var employeeName = document.getElementById("employeeName").value;
        document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your Vehicle Type..";
        document.getElementById("vehicleModel").style = "display:none";


    }
}

function Type() {
    var x = event.keyCode;
    if (x == 13) {
        document.getElementById("EmployeeId").style = "display:block";
        var employeeName = document.getElementById("employeeName").value;
        document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your EmployeeId..";
        document.getElementById("Types").style = "display:none";
        document.getElementById("empid").value = Math.floor(Math.random(4) * 1000 + 1);
    }
}

function EmployeeId() {
    var x = event.keyCode;
    if (x == 13) {
        document.getElementById("identification").style = "display:block";
        var employeeName = document.getElementById("employeeName").value;
        document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your Vehicle Identification..";
        document.getElementById("EmployeeId").style = "display:none";
        document.getElementById("EmployeeId").value = Math.floor(Math.random(4) * 1000 + 1);
    }
}

function vehicleIdentification() {
    var x = event.keyCode;
    if (x == 13) {
        document.getElementById("identification").style = "display:none";
        var employeeName = document.getElementById("employeeName").value;
        document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Choose a plan..";
        var vehicleType = document.getElementById("Typess").value;
        if (vehicleType == "cycle") {
            document.getElementById("pass").style = "display: block";
            document.getElementById("cycle").style = "display:block";
            var employeeName = document.getElementById("employeeName").value;
            var vehicletypes = document.getElementById("Typess").value;
            document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Choose a " + vehicletypes + " plan..";
            rate = [5, 100, 500];
        } else if (vehicleType == "motorcycle") {
            document.getElementById("pass").style = "display: block";
            document.getElementById("motor").style = "display:block";
            var employeeName = document.getElementById("employeeName").value;
            var vehicletypes = document.getElementById("Typess").value;
            document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Choose a " + vehicletypes + " plan..";
            rate = [10, 200, 1000];
        } else {
            document.getElementById("pass").style = "display: block";
            document.getElementById("car").style = "display:block";
            var employeeName = document.getElementById("employeeName").value;
            var vehicletypes = document.getElementById("Typess").value;
            document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Choose a " + vehicletypes + " plan..";
            rate = [20, 500, 3500];
        }
    }
}

function getpass(x) {
    document.getElementById("pass").style = "display: none";
    document.getElementById("rupaye").style = "display: block";
    var employeeName = document.getElementById("employeeName").value;
    document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Choose a Currency type";
    if (x.value == "d10") {
        finalPlan = rate[0];
    } else if (x.value == "m20") {
        finalPlan = rate[1];
    } else {
        finalPlan = rate[2];
    }
}

function rupaye(x) {
    if (x.value == "INR") {
        document.getElementById("stop").value = finalPlan;
        document.getElementById("stop").style = "display:block";
        document.getElementById("pay").style = "display:block";
    } else if (x.value == "USD") {
        document.getElementById("stop").value = finalPlan / 71.46;
        document.getElementById("stop").style = "display:block";
        document.getElementById("pay").style = "display:block";
    } else if (x.value == "YEN") {
        document.getElementById("stop").value = finalPlan / 0.66;
        document.getElementById("stop").style = "display:block";
        document.getElementById("pay").style = "display:block";
    }
}