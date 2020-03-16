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

function fullname() {
    var x = event.keyCode;
    if (x == 13) {
        document.getElementById("gender").style = "display:block";
        var employeeName = document.getElementById("employeeName").value;
        document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Tell Your Gender..";
        document.getElementById("fullname").style = "display:none";
    }
}

function genders() {
    document.getElementById("employeeEmail").style = "display:block";
    var employeeName = document.getElementById("employeeName").value;
    document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your Email..";
    document.getElementById("gender").style = "display:none";
}


function email() {
    var x = event.keyCode;
    if (x == 13) {
        document.getElementById("password").style = "display:block";
        var employeeName = document.getElementById("employeeName").value;
        document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your Password..";
        document.getElementById("employeeEmail").style = "display:none";
    }
}

function password() {
    var x = event.keyCode;
    if (x == 13) {
        document.getElementById("confirmpassword").style = "display:block";
        var employeeName = document.getElementById("employeeName").value;
        document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your Confirm Password..";
        document.getElementById("password").style = "display:none";
    }
}

function confirmpassword() {
    var x = event.keyCode;
    if (x == 13) {
        document.getElementById("confirmpassword").style = "display:none";
        var employeeName = document.getElementById("employeeName").value;
        document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your Number..";
        document.getElementById("number").style = "display:block";
    }
}

function number() {
    var x = event.keyCode;
    if (x == 13) {
        document.getElementById("number").style = "display:none";
        var employeeName = document.getElementById("employeeName").value;
        document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your vehicle company name..";
        document.getElementById("vehicleCompanyName").style = "display:block";
    }
}

function vehicleCompanyName() {
    var x = event.keyCode;
    if (x == 13) {
        document.getElementById("vehicleCompanyName").style = "display:block";
        var employeeName = document.getElementById("employeeName").value;
        document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your vehicle model..";
        document.getElementById("vehicleModel").style = "display:none";
    }
}

function vehicleModel() {
    var x = event.keyCode;
    if (x == 13) {
        document.getElementById("Type").style = "display:block";
        var employeeName = document.getElementById("employeeName").value;
        document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your vehicle type..";
        document.getElementById("vehicleModel").style = "display:none";
    }
}

function Type() {
    var x = event.keyCode;
    if (x == 13) {
        document.getElementById("EmployeeId").style = "display:block";
        var employeeName = document.getElementById("employeeName").value;
        document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your employeeid..";
        document.getElementById("Type").style = "display:none";
    }
}

function EmployeeId() {
    var x = event.keyCode;
    if (x == 13) {
        document.getElementById("identification").style = "display:block";
        var employeeName = document.getElementById("employeeName").value;
        document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your vehicle identification..";
        document.getElementById("EmployeeId").style = "display:none";
    }
}

function vehicleIdentification() {
    var x = event.keyCode;
    if (x == 13) {
        document.getElementById("identification").style = "display:none";

    }
}

function getpass() {
    var x = document.getElementById("Type").value;
    document.write(x);
    if (x == "cycle") {

        document.getElementById("pass").style = "display:block";
        document.getElementById("cycle").style = "dispaly:block";
        rate = [5, 100, 500];
    } else if (x == "motorcycle") {
        document.getElementById("vehicle").style = "display:none";
        document.getElementById("pass").style = "display:block";
        document.getElementById("motorcycle").style = "display.block";
        rate = [10, 200, 1000];
    } else if (x == "car") {
        document.getElementById("vehicle").style = "display:none";
        document.getElementById("pass").style = "display:block";
        document.getElementById("car").style = "display:block";
        rate = [20, 500, 3500];
    }
}