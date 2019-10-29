<?php
  if(isset($_POST['sub_manual'])){
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

    $sql = "Insert into grades(student_first_name, grade, comments, assignment_id) VALUES('".$_POST['student_first_name_manual']."'
    ,'".$_POST['grade_manual']."','".$_POST['comments_manual']."','".$_POST['assignment_id_manual']."');";

    $result = $conn->query($sql);
    $conn->close();

    ob_start();
    header('Location: '.'grades.php');
    ob_end_flush();
    die();
  }


 ?>
