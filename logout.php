<html>
<head><title>PHP - A Simple HTML Form Using POST Method </title></head>
<body>

<!-- The example below displays a simple HTML form with two input fields and a submit button. When the user fills out the form above and clicks the submit button, the form data is sent for processing to a PHP file named "welcome.php". The form data is sent with the HTTP POST method.-->

<form name="" action="validate.php" method="post">
Email: <input type="text" name="email" id="email"><br><br>
Password: <input type="password" name="password" id="password"><br><br>
<input type="checkbox" name="remember">Remember Me<br><br>
<input type="Submit" value="Login" name="login">
</form>

<?php
	if (isset ($_COOKIE['email']) and isset($_COOKIE['password']))
	{
		$email=$_COOKIE['email'];
		$password=$_COOKIE['password'];
		//to display in textbox
		echo "<script> 
			document.getElementById('email').value='$email';
			document.getElementById('password').value='$password';
		</script>";
		
	}
?>

</body>
</html>
