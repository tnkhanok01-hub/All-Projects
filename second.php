<?php
	session_start();
	
	session_destroy(); // what if we do not put session_destroy?
	
	
	echo "<br> You are successfully logout! Click here to <a href='login.php'>login again</a>";
?>