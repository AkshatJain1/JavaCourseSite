<?php $dir = ""; include($dir . "/header.php"); ?>

<form action="addUser" method="post">
    Username: <input type="text" name="user" value="">
    Password: <input type="text" name="pass" value="">
    First Name: <input type="text" name="first" value="">
    Last Name: <input type="text" name="last" value="">

    <input type="submit" name="sub" value="Submit">
</form>

<?php
if(isset($_POST['submit'])) {
   $servername = "localhost";
   $username = "root";
   $password = "admin";
   $dbname = "java_summer";

   // Create connection
   $conn = new mysqli($servername, $username, $password, $dbname);
   // Check connection
   if ($conn->connect_error) {
       die("Connection failed: " . $conn->connect_error);
   }

   $sql = "INSERT INTO users(username, password, first_name, last_name, perm) VALUES('".$_POST['user']."', '".$_POST['pass']."','".$_POST['first']."','".$_POST['last']."', '0');";
     $result = $conn->query($sql);
    $conn->close();

 }
?>
