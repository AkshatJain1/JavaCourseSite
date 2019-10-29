<?php $dir = ""; include($dir . "/header.php"); ?>

<?php


if(!is_dir("uploads/".$_SESSION['first_name']."")){
  mkdir("uploads/".$_SESSION['first_name']."");
}
$target_dir = "uploads/".$_SESSION['first_name']."/";
$target_file = $target_dir . basename($_FILES["fileToUpload"]["name"]);
$uploadOk = 1;
if (file_exists($target_file)) {
    echo "Sorry, file already exists.";
    $uploadOk = 0;
}
// Check if $uploadOk is set to 0 by an error
if ($uploadOk == 0) {
    echo "Sorry, your file was not uploaded.";
// if everything is ok, try to upload file
} else {
    if (move_uploaded_file($_FILES["fileToUpload"]["tmp_name"], $target_file)) {

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

        $sql = "INSERT INTO grades(student_first_name, assignment_id, file_name) VALUES ('".$_SESSION['first_name']."', '".$_POST['assignment_id']."', '".$target_file."')";

        $result = $conn->query($sql);

        $conn->close();
        

        echo "The file ". basename( $_FILES["fileToUpload"]["name"]). " has been uploaded.";

        $txt = $_SESSION['first_name'] . " uploaded ";
        $txt .= basename($_FILES["fileToUpload"]["name"]);
        $txt.="\n";

        $file = 'uploadLog.txt';
        // Open the file to get existing content
        $current = file_get_contents($file);
        // Append a new person to the file
        $current .= $txt;
        // Write the contents back to the file
        file_put_contents($file, $current);
    } else {
        echo "Sorry, there was an error uploading your file.";
    }
}
?>
