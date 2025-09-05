 <%@ page import="javax.servlet.http.*,javax.servlet.*" %>
 <%@ page session="true" %>
 <%
     String email = (String) session.getAttribute("user_email");
     if(email == null){
         email = ""; // Default to empty if not set
     }
 %>
 <!DOCTYPE html>
 <html lang="en">
 <head>
     <meta charset="UTF-8">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <title>Netflix Login</title>
     <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
     <script src="https://kit.fontawesome.com/a076d05399.js" crossorigin="anonymous"></script>
     <style>
         body {
           background: linear-gradient(to right, #000000, #141414);
           color: white;
           font-family: 'Arial', sans-serif;
           display: flex;
           align-items: center;
           justify-content: center;
           height: 100vh;
         }

         .login-container {
           background: rgba(20, 20, 20, 0.9);
           padding: 40px;
           border-radius: 8px;
           box-shadow: 0px 8px 16px rgba(0, 0, 0, 0.5);
           max-width: 400px;
           width: 100%;
         }
         .form-control {
           background: #333;
           border: none;
           color: white;
         }
         .form-control:focus {
           background: #444;
           color: white;
           box-shadow: none;
         }
         .btn-netflix {
           background: #e50914;
           color: white;
           width: 100%;
           padding: 12px;
           font-size: 16px;
           font-weight: bold;
           transition: 0.3s;
         }
         .btn-netflix:hover {
           background: #f40612;
         }
         .alert {
           display: none;
           margin-top: 10px;
         }
         .logo {
           text-align: center;
           margin-bottom: 20px;
         }
     </style>
 </head>
 <body>
 <div class="login-container">
     <div class="logo">
         <img src="logoNETFLIX.jpg" alt="Netflix Logo" width="150">
     </div>
     <h3 class="text-center">Sign In</h3>
     <div class="mb-3">
         <label class="form-label">Email</label>
         <input type="email" class="form-control" id="email" value="<%= email %>" >
     </div>
     <div class="mb-3">
         <label class="form-label">Password</label>
         <input type="password" class="form-control" id="password" placeholder="Enter your password">
     </div>
     <div class="alert alert-warning" id="alertBox">
         <i class="fas fa-exclamation-triangle"></i> Incorrect password. Try again or reset.
     </div>
     <button class="btn btn-netflix" onclick="checkPassword()">Sign In</button>
     <div class="text-center mt-3">
         <a href="#" class="text-white">Forgot password?</a>
     </div>
 </div>

 <script>
     var correctPassword = 'Fixed@123';
     function checkPassword() {
  var password = document.getElementById('password').value;
  var alertBox = document.getElementById('alertBox');
  if (password !== correctPassword) {
    alertBox.style.display = 'block';
  } else {
    alertBox.style.display = 'none'; //shows error message.
    window.location.href = 'selectProfile.jsp'; // Redirect on success to next page.
  }
}
     
 </script>
 </body>
 </html>
