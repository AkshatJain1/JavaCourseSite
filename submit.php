<?php $dir = ""; include($dir . "/header.php"); ?>
<a href = "index.php" id = "home"><i class="fa fa-home" aria-hidden="true" style="margin-left: 1rem"></i></a>
<style media="screen">
  #home {
    display: block;
    color: white;
    background-color: rgba(0, 46, 102, 0.8);
    border-radius: 100%;
    font-size: 2rem;
    line-height: 4rem;
    height: 4rem;
    width: 4rem;
  }
  body{
    background-image: url(img/bg.jpg);
  }

  .upload-btn-wrapper {
    margin: 50px;
    position: relative;
    overflow: hidden;
    display: inline-block;
  }

  .btn {
    border: 2px solid gray;
    color: gray;
    background-color: white;
    padding: 8px 20px;
    border-radius: 8px;
    font-size: 20px;
    font-weight: bold;
  }

  .upload-btn-wrapper input[type=file] {
    font-size: 100px;
    position: absolute;
    left: 0;
    top: 0;
    opacity: 0;
  }
</style>
<form action="upload.php" method="post" enctype="multipart/form-data">
    <h2>Select assignment to upload:</h2>
    <select class="assignments" name="assignment_id" required>
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

          $sql1 = "SELECT * FROM grades WHERE assignment_id='".$row[assignment_id]."' AND student_first_name = '".$_SESSION['first_name']."';";

          $result1 = $conn->query($sql1);

          if($result1->num_rows == 0) {
            echo "<option value = '".$row['assignment_id']."'>
                ".$row['name']."
            </option>";
          }
        }

        $conn->close();

         ?>
    </select> <br>
    <!-- <input type="file" > <br> -->

    <div class="upload-btn-wrapper">
      <button class="btn">Upload a file</button>
      <input type="file" name="fileToUpload" id="fileToUpload" />
    </div>
    <input type="submit" class="btn btn-info" value="Upload Assignment" name="submit">
</form>
