var finalPlan:number;
var y: number;
var rate:number[];
function showVehicle() {
    document.getElementById("vehicleDetails").setAttribute("style","display:none");
    document.getElementById("addVehicle").setAttribute("style","display:block");
}

function showEmployee() {
    document.getElementById("employeeDetails").setAttribute("style","display:none");
    document.getElementById("userform").setAttribute("style","display:block");
}


function hideVehicle() {
    document.getElementById("vehicleDetails").setAttribute("style","display:none");
    document.getElementById("addVehicle").setAttribute("style","display:none");
}

function hideEmployee() {
    document.getElementById("employeeDetails").setAttribute("style","display:none");
    document.getElementById("userform").setAttribute("style","display:none");
}

function showFeedback() {
    document.getElementById("feedback").setAttribute("style","display:none");
    document.getElementById("giveFeedback").setAttribute("style","display:block");
}

function showPricing() {
    document.getElementById("pricingLabel").setAttribute("style","display:none");
    document.getElementById("pricing").setAttribute("style","display:block");
}

function hidePricing() {
    document.getElementById("pricingLabel").setAttribute("style","display:none");
    document.getElementById("pricing").setAttribute("style","display:block");
}
function namevalidation() {
   // document.write("hi3");
    var y = 1;
    var x:any;
    x = (<HTMLInputElement>document.getElementById("employeeName")).value;
   // document.write("hi34");
    let pattern = /(^[a-zA-Z ]{2,}$)/;
   /// document.write("hi345");
    if (x.match(pattern) == null) {
     //   document.write("hi3456");
        document.getElementById("employeeName").setAttribute("style","border:4px solid red");
        y = 0;
        return;
    }
    document.getElementById("employeeName").setAttribute("style","border:4px solid red");
    document.getElementById("gender").setAttribute("style","display:block");
    var employeeName =(<HTMLInputElement>document.getElementById("employeeName")).value;
    document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Tell Your Gender..";
    document.getElementById("fullname").setAttribute("style","display:none");
}

function fullname(item,event:KeyboardEvent) {
   //document.write("hi1");
    var x = event.keyCode;
    if (x == 13) {
      //  document.write("hi2");
        namevalidation();
    }
}


function genders() {
    document.getElementById("employeeEmail").setAttribute("style","display:block");
    var employeeName = (<HTMLInputElement>document.getElementById("employeeName")).value;
    document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your Email..";
    document.getElementById("gender").setAttribute("style","display:none");
}

function emailvalidation() {
    var emails = (<HTMLInputElement>document.getElementById('employeeEmails')).value;
    var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if (emails.match(filter) == null) {
        document.getElementById("employeeEmails").setAttribute("style","border:4px solid red");
        y = 0;
        return;
    }
    document.getElementById("password").setAttribute("style","display:block");
    var employeeName = (<HTMLInputElement>document.getElementById("employeeName")).value;
    document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your Password..";
    document.getElementById("employeeEmail").setAttribute("style","display:none");
}
function email(item,event:KeyboardEvent) {
    var x = event.keyCode;
    if (x == 13) {
        emailvalidation();
    }
}

function passvalidation() {
    var passwords= (<HTMLInputElement>document.getElementById("employeePassword")).value;
    var special = 0,
        numbers = 0,
        lower = 0,
        upper = 0;
    for (var i = 0; i < passwords.length; i++) {
        if (passwords.charCodeAt(i) >= 48 && passwords.charCodeAt(i) <= 57) {
            numbers++;
        } else if (passwords.charCodeAt(i) >= 97 && passwords.charCodeAt(i) <= 123) {
            lower++;
        } else if (passwords.charCodeAt(i) >= 65 && passwords.charCodeAt(i) <= 91) {
            upper++;
        } else {
            special++;
        }
    }
    if (special == 0 || lower == 0 || upper == 0 || numbers == 0 || passwords.length < 8) {
        document.getElementById("employeePassword").setAttribute("style","border:4px solid red");
        return;
    }
    document.getElementById("confirmpassword").setAttribute("style","display:block");
    var employeeName = (<HTMLInputElement>document.getElementById("employeeName")).value;
    document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your Confirm Password..";
    document.getElementById("password").setAttribute("style","display:none");

}
    function password(item,event:KeyboardEvent) {
    var x = event.keyCode;
    if (x == 13) {
        passvalidation();
    }

}


function confirmpassvalidation() {
    var password = (<HTMLInputElement>document.getElementById("employeePassword")).value;
    var cpassword = (<HTMLInputElement>document.getElementById("employeeConfirmPassword")).value;
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
        document.getElementById("employeeConfirmPassword").setAttribute("style","border:4px solid red");
        y = 0;
        return;
    }
    document.getElementById("confirmpassword").setAttribute("style","display:none");
    var employeeName = (<HTMLInputElement>document.getElementById("employeeName")).value;
    document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your Conatct number..";
    document.getElementById("number").setAttribute("style","display:block");
}


function confirmpassword(item,event:KeyboardEvent) {
    var x = event.keyCode;
    if (x == 13) {
        confirmpassvalidation();
    }
}

function numbervalidation() {
    var x = (<HTMLInputElement>document.getElementById("employeeContact")).value;
    if (x.length != 10 || x.length < 10) {
        document.getElementById("employeeContact").setAttribute("style","border:4px solid red");
        return;
    }
    document.getElementById("number").setAttribute("style","display:none");
    var employeeName = (<HTMLInputElement>document.getElementById("employeeName")).value;
    document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your vehicle company Name..";
    document.getElementById("vehicleCompanyName").setAttribute("style","display:block");
}

function number(item,event:KeyboardEvent) {
    var x = event.keyCode;
    if (x == 13) {
        numbervalidation();
    }
}

function vehicleCompanyName(item,event:KeyboardEvent) {
    var x = event.keyCode;
    if (x == 13) {
        document.getElementById("vehicleModel").setAttribute("style","display:block");
        var employeeName = (<HTMLInputElement>document.getElementById("employeeName")).value;
        document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your vehicle Model..";
        document.getElementById("vehicleCompanyName").setAttribute("style","display:none");
    }
}

function vehicleModel(item,event:KeyboardEvent) {
    var x = event.keyCode;
    if (x == 13) {
        document.getElementById("Types").setAttribute("style","display:block");
        var employeeName = (<HTMLInputElement>document.getElementById("employeeName")).value;
        document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your Vehicle Type..";
        document.getElementById("vehicleModel").setAttribute("style","display:none");

    }
}

function Type(item,event:KeyboardEvent) {
    var x = event.keyCode;
    if (x == 13) {
        document.getElementById("EmployeeId").setAttribute("style","display:block");
        var employeeName = (<HTMLInputElement>document.getElementById("employeeName")).value;
        document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your EmployeeId..";
        document.getElementById("Types").setAttribute("style","display:none");
    
        (<HTMLInputElement>document.getElementById("empid")).value = (Math.floor(Math.random() * 1000 + 1)).toString();
    }
}

function EmployeeId(item,event:KeyboardEvent) {
    var x = event.keyCode;
    if (x == 13) {
        document.getElementById("identification").setAttribute("style","display:block");
        var employeeName = (<HTMLInputElement>document.getElementById("employeeName")).value;
        document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Enter Your Vehicle Identification..";
        document.getElementById("EmployeeId").setAttribute("style","display:none");
        
    }
}

function vehicleIdentification(item,event:KeyboardEvent) {
    console.log("hi");
    var x = event.keyCode;
    if (x == 13) {
        document.getElementById("identification").setAttribute("style","display:none");
        var employeeName = (<HTMLInputElement>document.getElementById("employeeName")).value;
        document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Choose a plan..";
        var vehicleType = (<HTMLInputElement>document.getElementById("Typess")).value;
        
        if (vehicleType == "cycle") {
            document.getElementById("pass").setAttribute("style","display:block");
            document.getElementById("cycle").setAttribute("style","display:block");
            var employeeName = (<HTMLInputElement>document.getElementById("employeeName")).value;
            var vehicletypes = (<HTMLInputElement>document.getElementById("Typess")).value;
            document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Choose a " + vehicletypes + " plan..";
            rate = [5, 100, 500];
        } else if (vehicleType == "motorcycle") {
            document.getElementById("pass").setAttribute("style","display:block");
            document.getElementById("motor").setAttribute("style","display:block");
            var employeeName = (<HTMLInputElement>document.getElementById("employeeName")).value;
            var vehicletypes = (<HTMLInputElement>document.getElementById("Typess")).value;
            document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Choose a " + vehicletypes + " plan..";
            rate = [10, 200, 1000];
        } else {
            document.getElementById("pass").setAttribute("style","display:block");
            document.getElementById("car").setAttribute("style","display:block");
            var employeeName = (<HTMLInputElement>document.getElementById("employeeName")).value;
            var vehicletypes = (<HTMLInputElement>document.getElementById("Typess")).value;
            document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Choose a " + vehicletypes + " plan..";
            rate = [20, 500, 3500];
        }
    }
}

function getpass(x) {
    
    document.getElementById("pass").setAttribute("style","display:none");
    document.getElementById("rupaye").setAttribute("style","display:block");
    var employeeName = (<HTMLInputElement>document.getElementById("employeeName")).value;
    document.getElementById("heading").innerHTML = "Hi " + employeeName + " ! Choose a Currency type";
    if (x.value == "d10") {
        console.log(rate[0]);
        finalPlan = rate[0];
        
        console.log(finalPlan);
        
    } else if (x.value == "m20") {
        finalPlan = rate[1];
        console.log(finalPlan);
        
    } else {
        finalPlan = rate[2];
        console.log(finalPlan);
        
    }
}

function rupaye(x) {
    if (x.value == "INR") {
       (<HTMLInputElement>document.getElementById("stop")).value = finalPlan.toString();
       document.getElementById("stop").setAttribute("style","display:block");
        document.getElementById("pay").setAttribute("style","display:block");
    } else if (x.value == "USD") {
        (<HTMLInputElement>document.getElementById("stop")).value=(finalPlan / 71.46).toString();
        document.getElementById("stop").setAttribute("style","display:block");
        document.getElementById("pay").setAttribute("style","display:block");
    } else if (x.value == "YEN") {
        (<HTMLInputElement>document.getElementById("stop")).value=(finalPlan / 0.66).toString();
        document.getElementById("stop").setAttribute("style","display:block");
        document.getElementById("pay").setAttribute("style","display:block");
    }
}
