<?php $dir = ""; include($dir . "/header.php"); ?>
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
  $sql="";

   if(isset($_GET['grade'])) {
       $sql = "UPDATE grades SET grade='".$_GET['grade']."' WHERE grade_id='".$_GET['pos']."';";
       $result = $conn->query($sql);

       $conn->close();

      //  ob_start();
      // if($_GET['stud_filter']!="null")
      //   header('Location: '.'grades.php?stud_filter='.$_GET['stud_filter']);
      // else {
      //     header('Location: '.'grades.php');
      // }
      //  ob_end_flush();
      //  die();
   }
   if(isset($_GET['comments'])) {
     $sql = "UPDATE grades SET comments='".$_GET['comments']."' WHERE grade_id='".$_GET['pos']."';";
     $result = $conn->query($sql);
     $conn->close();

   //   ob_start();
   //   if($_GET['stud_filter']!="null") {
   //    header('Location: '.'grades.php?stud_filter='.$_GET['stud_filter']);
   //  }
   //  else {
   //      header('Location: '.'grades.php');
   //  }
   //   ob_end_flush();
   //   die();
   }

   $conn->close();


?>
