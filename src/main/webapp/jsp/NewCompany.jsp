<!DOCTYPE html>
<html lang="en">

<head>
  <title>New Company</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  <style>
      body{
      
        background-image: url("images/bg.jpg"); /* The image used */
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
            <li><a href="user.html">Home</a></li>
            <li><a href="CompareCompany.html">CompareCompany</a></li>
    
            <li><a href="#">CompanySector</a></li>
            <li><a href="#">Other</a></li>
            <li>
              <a href="Login.html"> <p align="right"><button type="button">Log out </button></p></a>
            </li>
          </ul>
        </div>
      </nav>


  <div class="container">
    <h1>New Company</h1>
  <form method="POST" action="/newCompany" modelAttribute="company">
			<table style="width: 50%">
				<tr>
					<td>Company code</td>

					<td><input type="text" name="companyCode"  placeholder="Company Code"></td>

				</tr>
				<tr>
					<td>Company Name</td>

					<td><input type="text" name="companyName"  placeholder="Company Name"></td>

				</tr>
				<tr>
					<td>TurnOver</td>

					<td><input type="text" name="turnOver"  placeholder="TurnOver"></td>
				</tr>
				<tr>
					<td>CEO Name</td>

					<td><input type="text" name="ceo"  placeholder="CeoName"></td>

				</tr>
				<tr>
					<td>Board of directors</td>

					<td><input type="text" name="boardOfDirectors"  placeholder="bod"></td>

				</tr>
				<tr>
					<td>Sector Id</td>
					<td><input type="text" name="sectorId" placeholder="sectorId"></td>

				</tr>
				<tr>
					<td>Brief Description</td>
					<td><input type="text" name="briefWriteUp" placeholder="Brief"></td>

				</tr>
				<tr>
					<td>Stock Code</td>
					<td><input type="text" name="stockPriceId" placeholder="stockcode"></td>

				</tr>

				<tr>
					<td><input type="submit" value="submit"/></td>

				</tr>
			</table>
		</form>

 
  </div>

</body>

</html>