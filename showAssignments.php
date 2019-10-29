<?php


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

    $sql = "SELECT * FROM assignments";

    $result = $conn->query($sql);

    while($row = $result->fetch_assoc()) {

      $sql1 = "SELECT * FROM grades WHERE assignment_id='".$row['assignment_id']."' AND student_first_name = '".$_GET['stud']."';";

      $result1 = $conn->query($sql1);

      if($result1->num_rows == 0) {
        echo "<option value = '".$row['assignment_id']."'>
            ".$row['name']."
        </option>";

        $sql2 = "INSERT into grades(student_first_name, grade, comments, assignment_id) VALUES('".$_GET['stud']."', '0', 'No Submit', '".$row['assignment_id']."');";

        $result2 = $conn->query($sql2);

        echo "<option value = '".$row['assignment_id']."'>
            ".$result2."
        </option>";

      }
    }

    $conn->close();


?>
