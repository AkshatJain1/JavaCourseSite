<?php $dir = ""; include($dir . "/header.php");

$score = $_GET['score'];
$name = $_SESSION['first_name'];

$servername = "localhost";
$username = "root";
$password = "admin";

$conn = new mysqli($servername, $username, $password, "java_summer");

if($conn->connect_error){
  die();
}

$sql = "INSERT into flappy_leaderboard (student_first_name, score) VALUES('" . $name . "', '" . $score . "');";
echo $sql;
$result = $conn->query($sql);

$conn -> close();

ob_start();
header('Location: '.'flappy.php');
ob_end_flush();
die();

?>
