<!DOCTYPE html>
<html lang="en">

<head>
  <title>New User signUp</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style>
      body{
      
        background-image: url("bg.jpg"); /* The image used */
        background-color: #cccccc; /* Used if the image is unavailable */
        height: 500px; /* You must set a specified height */
        background-position: center; /* Center the image */
        background-repeat: no-repeat; /* Do not repeat the image */
        background-size: cover; /* Resize the background image to cover the entire container */
      
      }
          </style>
</head>

<body>
  <nav class="navbar navbar-inverse">
      <div class="container-fluid">
          <ul class="nav navbar-nav">
         
            <li>
              <a href="Login.html"><button type="button">Home</button></a>
            </li>
          </ul>
        </div>
      </nav>

	<form method="POST" action="" modelAttribute="User"></form>
  <div class="container">
    <h1>New User Signup</h1>
    <table style="width:50%">
        <tr>
          <td>UserName</td>
  
          <td><input type="text" name="userName" placeholder="User Name"></td>
  
        </tr>
        <tr></tr>
        <tr>
          <td>Password</td>
  
          <td><input type="password" name="password" placeholder="Password"></td>
  
        </tr>
        <tr></tr>
        <tr>
          <td>Email</td>
  
          <td><input type="email" name="email" placeholder="email"></td>
        </tr>
        <tr></tr>
        <tr>
          <td>Mobile Number</td>
          <td> <input type="text" name="mobile" placeholder="mob num"></td>
  
        </tr>
        <tr></tr>
        <tr>
          <td>Confirmed</td>
          <td><input type="text" name="confirmed" placeholder="Confirmed"> </td>
  
        </tr>
        <tr></tr>
        <tr>
            <td>User Type</td>
            <td><input type="text" name="userType" placeholder="user Type"> </td>
    
          </tr>
          <tr></tr>
        <tr>
          <td></td>
          <td> </td>
          <td><button type="button" onclick="alert('Signup Successful')">Save</button></td>
  
        </tr>
      </table>
  </div>

</body>

</html>