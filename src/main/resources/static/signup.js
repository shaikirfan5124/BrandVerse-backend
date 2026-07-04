document.getElementById("signupForm").addEventListener("submit", async function(e){

    e.preventDefault();

    const fullname=document.getElementById("fullname").value;
    const email=document.getElementById("email").value;
    const password=document.getElementById("password").value;

    const response=await fetch("http://localhost:8080/api/signup",{

        method:"POST",

        headers:{
            "Content-Type":"application/json"
        },

        body:JSON.stringify({

            fullname,
            email,
            password

        })

    });

    const result=await response.text();

    if(result==="Success"){

        alert("Signup Successful");

        window.location.href="login.html";

    }else{

        alert(result);

    }

});