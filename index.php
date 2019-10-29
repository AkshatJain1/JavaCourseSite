<?php $dir = ""; include($dir . "/header.php"); ?>

  <!-- Custom styles-->
  <link href="css/index.css" rel="stylesheet">

    <div class="overlay"></div>

    <img src="img/javaglasses.jpg" alt="Background for Homepage" id = "video">

    <div class="masthead">
      <div class="masthead-bg"></div>
      <div class="container h-100">
        <div class="row h-100">
          <div class="col-12 my-auto">
            <div class="masthead-content text-white py-5 py-md-0">
              <h1 class="mb-3">Welcome to Java Programming, <?php echo $_SESSION['first_name'] ?></h1>
              <p class="mb-5">With Akshat Jain</p>

              <nav id = "menu">
                  <!-- <a href="index.php">Home</a><br> -->
                  <a href="grades.php">Grades</a><br>
                  <?php if($_SESSION['perm']>0){ ?>
                    <a href="addGrade.php">Add Assignment</a><br>
                  <?php } ?>
                  <a href="downloads.php">Downloads</a><br>
                  <a href="submit.php">Submit Assignment</a><br>
                  <!-- <a href="about.php">About</a><br> -->
                  <a href="flappy.php">Bored?</a>
                  <a href="logout.php" style = "float: right;">Logout</a>
              </nav>


            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="social-icons">
      <ul class="list-unstyled text-center mb-0">
        <li class="list-unstyled-item">
          <!-- <a href="https://www.snapchat.com/add/jain_akshataa">
            <i class="fa fa-snapchat"></i>
          </a> -->
        </li>
        <li class="list-unstyled-item">
          <a href="https://www.github.com/AkshatJain1">
            <i class="fa fa-github"></i>
          </a>
        </li>
        <li class="list-unstyled-item">
          <!-- <a href="https://www.instagram.com/akshat___jain/?hl=en">
            <i class="fa fa-instagram"></i>
          </a> -->
        </li>
      </ul>
    </div>


  </body>
</html>
