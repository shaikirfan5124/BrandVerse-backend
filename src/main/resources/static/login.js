document.getElementById("loginForm").addEventListener("submit",async function(e){

    e.preventDefault();

    const email=document.getElementById("email").value;

    const password=document.getElementById("password").value;

    const response=await fetch("http://localhost:8080/api/login",{

        method:"POST",

        headers:{

            "Content-Type":"application/json"

        },

        body:JSON.stringify({

            email,
            password

        })

    });

    const data=await response.json();

    if(data.id){

        localStorage.setItem("user",JSON.stringify(data));

        alert("Login Successful");

        window.location.href="index.html";

    }else{

        alert("Invalid Login");

    }

});