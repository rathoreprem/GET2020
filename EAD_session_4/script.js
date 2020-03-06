var finalPlan;
var rate;
var x;
value=x;
function validateRegistratioForm() 
{
    var y = 1;
    var x = document.getElementById("empName").value;
    if (x == "") 
    {
        alert("Name must be filled out");
        y = 0;
    }
    var x = document.getElementById("mobilenumber").value;
    if (x.length != 10 || x.length < 10)
    {
        alert("Please Enter a valid number");
        y = 0;
    }
    var email = document.getElementById('email');
    var filter = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    if (!filter.test(email.value))
    {
        alert('Please provide a valid email address');
        email.focus;
        y = 0;
    }
    var password = document.getElementById("psw").value;
    var cpassword = document.getElementById("cpsw").value;
    var special = 0,
        number = 0,
        lower = 0,
        upper = 0;
    for (var i = 0; i < password.length; i++)
    {
        if (password.charCodeAt(i) >= 48 && password.charCodeAt(i) <= 57) 
        {
            number++;
        } 
        if (password.charCodeAt(i) >= 97 && password.charCodeAt(i) <= 123)
        {
            lower++;
        } 
        if (password.charCodeAt(i) >= 65 && password.charCodeAt(i) <= 91) 
        {
            upper++;
        } 
        else 
        {
            special++;
        }
    }
    if (special == 0 || lower == 0 || upper == 0 || number == 0 || password.length < 8) 
    {
        alert("Please Enter a valid password");
        y = 0;
    }
    else if (password != cpassword)
    {
        alert("don't match password");
        y = 0;
    }

    else if (y == 1)
    {  
    	 document.getElementById("empRegisterationForm").submit();
    	 document.getElementById("vehicle").style = "display:block";
    	document.getElementById("empRegisterationForm").style = "display:none";
    	   
       // document.getElementById("rid").value = Math.floor(Math.random(4) * 1000 + 1);
    }
   
}



function cycle(x) 
{
	rate = [5, 100, 500];
	if (x.value == "5") 
	{
       finalPlan = rate[0];
    } 
	else if (x.value == "100") 
	{
		finalPlan = rate[1];
	} 
	else 
	{
       finalPlan = rate[2];
    }
	document.getElementById("rupaye").style = "display:block";
}

function car(x) 
{
	rate = [20, 500, 3500];
	if (x.value == "20") 
	{
       finalPlan = rate[0];
    } 
	else if (x.value == "500") 
	{
		finalPlan = rate[1];
	} 
	else 
	{
       finalPlan = rate[2];
    }
	document.getElementById("rupaye").style = "display:block";
}

function motor(x)
{
	rate = [10, 200, 1000];
	if (x.value == "10") 
    {
        finalPlan = rate[0];
    } 
    else if (x.value == "200") 
    {
    	finalPlan = rate[1];
    } 
    else 
    {
        finalPlan = rate[2];
    }
	document.getElementById("rupaye").style = "display:block";
}

function rupaye(x) 
{
	value=x;
    if (x.value == "INR") 
    {
    	document.getElementById("stoped").value = finalPlan;
    } 
    else if (x.value == "USD")
    {
        document.getElementById("stoped").value =( finalPlan / 71.46);
    }
    else if (x.value == "YEN") 
    {
    	document.getElementById("stoped").value =( finalPlan / 0.66);
    }
}

function store()
{
	 document.getElementById("rupaye").submit();
}

function abc()
{
	if(value=="INR")
	{
		document.getElementById("stoped").value =( finalPlan / 71.46);
	}
	else if(value=="YEN")
	{
		document.getElementById("stoped").value =( finalPlan / 71.46);
	}
	else
	{
		document.getElementById("stoped").value =( finalPlan / 71.46);
	}
	document.getElementById("rupaye").submit();
}
