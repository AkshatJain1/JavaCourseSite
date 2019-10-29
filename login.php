<?php
//attempts a log in with entered username and password, sets appropriate session variables, redirects to index if succssessful
function login($user, $pass){
  $servername = "localhost";
  $username = "root";
  $password = "admin";

  $conn = new mysqli($servername, $username, $password, "java_summer");

  if($conn->connect_error){
    die();
  }

  $result = $conn->query("select * from users where username = \"" . $user . "\" and password = \"" . $pass . "\";");

  if($result->num_rows > 0){

    if(session_status()!==2){
        echo "logging in";
        session_start();
    }

    $data = $result->fetch_assoc();
    $_SESSION["dbid"] = $data["user_id"];
    $_SESSION["username"] = $data["username"];
    $_SESSION["first_name"] = $data["first_name"];
    $_SESSION["perm"] = isset($data["perm"]) ? $data["perm"] : 1;

    ob_start();
    header('Location: '.'index.php');
    ob_end_flush();
    die();
  }
  else{
    // wrong login
    ob_start();
    header('Location: '.'index.php');
    ob_end_flush();
    die();
  }
}

// on submit, try to log in
if(isset($_POST["submit"])){
      if(isset($_POST["loginPassword"])&&isset($_POST["loginUser"])){
        login($_POST["loginUser"], $_POST["loginPassword"]);
      }
}
 ?>



<!DOCTYPE html>
<html lang="en">
<head>
	<title>Java Summer Course</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->
	<link rel="icon" type="image/png" href="img/favicon.ico"/>
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/font-awesome/css/font-awesome.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
	<link rel="stylesheet" type="text/css" href="css/login/util.css">
	<link rel="stylesheet" type="text/css" href="css/login/main.css">
<!--===============================================================================================-->
</head>
<body>

	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100">
				<div class="login100-pic js-tilt" data-tilt>
					<img src="img/img-01.png" alt="IMG">
				</div>

				<form class="login100-form validate-form" action="login" method="post">
					<span class="login100-form-title">
						Member Login
					</span>

					<div class="wrap-input100 validate-input" data-validate = "Valid email is required: ex@abc.xyz">
						<input class="input100" type="text" name="loginUser" placeholder="Username">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-envelope" aria-hidden="true"></i>
						</span>
					</div>

					<div class="wrap-input100 validate-input" data-validate = "Password is required">
						<input class="input100" type="password" name="loginPassword" placeholder="Password">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<i class="fa fa-lock" aria-hidden="true"></i>
						</span>
					</div>

					<div class="container-login100-form-btn">
            <input type="submit" value = "Login" name="submit" class="login100-form-btn"></input>
					</div>


				</form>
			</div>
		</div>
	</div>





</body>
</html>
