<?php
    session_start();
    echo "Hi " . $_SESSION['email'] . ", see you again!";
    echo "<br>";
    echo "<a href='logout.php'>Logout</a>";
?>