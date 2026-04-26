<?php

	$myemail="abc@yahoo.com";
	$pass="123";
	
	if(isset($_POST['login'])) // isset: if the variable exists and is not null
	{
		$email=$_POST['email'];
		$password=$_POST['password'];
		
		if ($email==$myemail and $password==$pass)
		{
			if (isset($_POST['remember']))
			{
				setcookie('email',$email,time()+15);
				setcookie('password',$password,time()+15);
			}
			//to go across multiple pages using one email/username, start session
			session_start();
			$_SESSION['email']=$email;
			header("location: welcome.php");

		}
		else
		{
			echo "Email or Password is Invalid! <br>	
			click here to <a href='login.php'> login again</a>";
		}
	}
	else
	{
		header("location: login.php");
	}
?>