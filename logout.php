<?php
  //destroying session
  session_start();
  $_SESSION=array();
  unset($_SESSION);
  session_destroy();

  //redirecting to login page
  ob_start();
  header('Location: '.'home.php');
  ob_end_flush();
  die();
?>
