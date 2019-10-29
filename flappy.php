<?php $dir = ""; include($dir . "/header.php"); ?>

<style media="screen">
  body{
    background-image: url(img/bg.jpg);
  }
  #button_play{
    float: right;
  }
</style>

<button type="button" id="button_play" class="btn" onclick='buttonPlayPress()'>
      <i class="fa fa-play"></i>
    </button>

<script src="vendor/p5/p5.js" charset="utf-8"></script>
<script src="flappy.js" charset="utf-8"></script>
<script src="vendor/d3.v3.min.js"></script>
<script type="text/javascript">
document.getElementById("button_play").style.marginRight = screen.width/3+"px";
var state = 'stop';
  function buttonPlayPress() {
      if(false){
        alert('Please work on your worksheets');
      }
      else {
        if(onkeyupCharCode!=32){
        if(state=='stop'){
          state='play';
          var button = d3.select("#button_play").classed('btn-success', true);
          button.select("i").attr('class', "fa fa-pause");
        }
        else if(state=='play' || state=='resume'){
          state = 'pause';
          d3.select("#button_play i").attr('class', "fa fa-play");
        }
        else if(state=='pause'){
          state = 'resume';
          d3.select("#button_play i").attr('class', "fa fa-pause");
        }
        // console.log("button play pressed, play was "+state);
        start();
      }
    }
  }

  document.onkeyup = handleKeyUp;
  var onkeyupCharCode;
  function handleKeyUp(e)	{
      if(!e)
  	var e = window.event;
      onkeyupCharCode = e.keyCode;
  }
</script>

<style media="screen">


table{
color: white;
border-spacing: 0;
float: right;
margin-right: 70px;
margin-top: 20px;
}

tr:first-child{
background-color: black;
}

tr:nth-child(2) > td{
border-top-width: 0;
}

tr{
background-color: blue;
}
tr:nth-child(even){
background-color: green;
}

th, td{
margin: 0;
padding: .5em 1.5em;
text-align: center;
border-width: 1px 0;
border-color: gray;
border-style: solid;
}

th{
border-bottom-width: 1px;
}

th:nth-child(even){
border-width: 0 4px;
border-color: darken(gray, 20%);
border-style: solid;
}

td:nth-child(even){
border-width: 1px 4px;
border-color: gray;
border-style: solid;
}
</style>
<table>
  <tbody>
    <tr>
    	<th>Rank</th>
    	<th>Username</th>
    	<th>Points</th>
    </tr>
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
    $count =0;
    $sql = "SELECT * from flappy_leaderboard order by score desc limit 5;";
    $result = $conn->query($sql);
    while($row = $result->fetch_assoc()) {
      $count +=1;
      echo "<tr>";
        echo "<td>" .$count. "</td>";
        echo "<td>" .$row['student_first_name']. "</td>";
        echo "<td>" .$row['score']. "</td>";
      echo "</tr>";
    }
    $conn->close();

     ?>
  </tbody>
</table>
