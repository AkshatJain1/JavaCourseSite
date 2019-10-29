<?php $dir = ""; include($dir . "/header.php"); ?>

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
.gradeInput{
  width: 80px;
  float: right;
  text-align: right;
}
.commentInput{
  width: 150px;
  /* height: 50px; */
  float: right;
  text-align: left;

}
.form-wrap{
  background-color: #D00000;
  margin: 20px;
}
.manualGrade {
  padding: 25px;
}
</style>




<link rel="stylesheet" type="text/css" href="css/grades/util.css">
<link rel="stylesheet" type="text/css" href="css/grades/main.css">




 <div class="limiter">
   <div class="container-table100">
     <div>
       <a href = "index.php" id = "home"><i class="fa fa-home" aria-hidden="true" style="margin-left: 1rem"></i></a>
     </div>
     <?php  if($_SESSION['perm'] > 0){?>
          <div class="form-wrap">
            <form class="manualGrade" action="addManualGrade.php" method="post">
                 <br /><h3 style="margin-bottom: 20px;">Enter Manual Grade</h3>
             <table>
             <tr>
               <td>Select Student:</td>
               <td><select class="students selectpicker"  name="student_first_name_manual" onchange = 'showAssignmentForStudent(this.value)'>
                 <option value="">Select Student..</option>
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
                   $sql = "SELECT * FROM users WHERE perm='0';";

                   $result = $conn->query($sql);

                   while($row = $result->fetch_assoc()) {
                      echo "<option value = '".$row['first_name']."'>
                          ".$row['first_name']."
                      </option>";
                   }

                   $conn->close();

                    ?>
               </select></td>
             </tr>
             <tr>
                  <td>Select assignment:</td>
                 <td><select id='assignments' name='assignment_id_manual' required>
                   <option value="">^</option>
                 </select></td>
             </tr>
             <tr>
               <td>Enter Grade: </td>
               <td><input  type = "text" placeholder= "0?" name = 'grade_manual' required></td>
             </tr>
             <tr>
               <td>Comments? : </td>
               <td><textarea  type = "text" placeholder= "None...?" name = 'comments_manual'></textarea></td>
             </tr>
           </table>
           <input type="submit" name="sub_manual" value="Submit" style="margin: 10px;">
            </form>
          </div>
           <?php } ?>
     <div class="wrap-table100">
       <div class="table100">
         <table>
           <thead>
             <tr class="table100-head">
               <th class="column1">Topic</th>
               <th class="column2">Date</th>
               <th class="column3">Assignment</th>
               <th class="column4">Weight</th>
               <?php  if($_SESSION['perm'] > 0){?>
                <th class="column5">Student</th>
                <th class="column6">Grade</th>
                <th class="column7">Comments</th>
                <th class="column8">File Download</th>
              <?php } else { ?>
                <th class="column5">Grade</th>
                <th class="column6">Comments</th>
              <?php } ?>
             </tr>
           </thead>
           <tbody>
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

                if($_SESSION['perm'] > 0) {
                  if(isset($_GET['stud_filter'])) {
                    $sql = "SELECT * FROM grades INNER JOIN assignments ON grades.assignment_id = assignments.assignment_id WHERE student_first_name='".$_GET['stud_filter']."' order by assignments.weight DESC;";
                  }else{
                    $sql = "SELECT * FROM grades INNER JOIN assignments ON grades.assignment_id = assignments.assignment_id order by grades.assignment_id ASC;";
                  }
                } else{
                  $sql = "SELECT * FROM grades INNER JOIN assignments ON grades.assignment_id = assignments.assignment_id WHERE student_first_name = '".$_SESSION['first_name']."' order by assignments.weight DESC;";
                }
                $total =0;
                $other =0;
                $minor =0;
                $major =0;

                $other_arr = array();
                $minor_arr = array();
                $major_arr = array();
                $result = $conn->query($sql);

                while($row = $result->fetch_assoc()) {
                  echo "<tr>";
                    if($_SESSION['perm'] > 0) {
                      echo "<td class = 'column1'>" . $row['topic'] . "</td>";
                      echo "<td class = 'column2'>" . $row['date'] . "</td>";
                      echo "<td class = 'column3'>" . $row['name'] . "</td>";
                      echo "<td class = 'column4'>" . $row['weight'] . "</td>";
                      echo "<td class = 'column5'><a href=grades.php?stud_filter=".$row['student_first_name'].">".$row['student_first_name']."</a></td>";
                      echo "<td class = 'column6'><input value = '".$row['grade']."' placeholder='Enter Grade..' class = 'gradeInput ".$row['grade_id']."'></td>";
                      echo "<td class = 'column7'><textarea placeholder='Enter Comments..' oninput='this.style.height = \"\";this.style.height = this.scrollHeight + \"px\"' class = 'commentInput ".$row['grade_id']."'>".$row['comments']."</textarea></td>";

                      if($row['file_name']!=null){
                        echo "<td class = 'column8'><a target = '_blank' href = '".$row['file_name']."'>".$row['file_name']."</a></td>";
                      }
                      else{
                          echo "<td class = 'column8'><i>No Download</i></td>";
                      }
                    } else{
                      echo "<td class = 'column1'>" . $row['topic'] . "</td>";
                      echo "<td class = 'column2'>" . $row['date'] . "</td>";
                      echo "<td class = 'column3'>" . $row['name'] . "</td>";
                      echo "<td class = 'column4'>" . $row['weight'] . "</td>";
                      echo "<td class = 'column5'>" . $row['grade'] . "</td>";
                      echo "<td class = 'column6'>" . $row['comments'] . "</td>";
                    }


                    if($row['weight'] == "Major"&& $row['grade']!="")
                      array_push($major_arr, $row['grade']);
                    if($row['weight'] == "Minor"&& $row['grade']!="")
                      array_push($minor_arr, $row['grade']);
                    if($row['weight'] == "Other" && $row['grade']!="")
                      array_push($other_arr, $row['grade']);

                  echo "</tr>";
                }

                 $conn->close();


                 for ($i=0; $i < count($other_arr) ; $i++) {
                   $other += $other_arr[$i];
                 }
                 for ($i=0; $i < count($minor_arr) ; $i++) {
                   $minor += $minor_arr[$i];
                 }
                 for ($i=0; $i < count($major_arr) ; $i++) {
                   $major += $major_arr[$i];
                 }

                 if(count($minor_arr) != 0) {
                   $other= ($other/(100*count($other_arr)))*10;
                   // echo "<script>alert('".$other."')</script>";
                 }
                 else{
                   $other = 10;
                 }

                 if(count($minor_arr) != 0) {
                   $minor= ($minor/(100*count($minor_arr)))*30;
                   // echo "<script>alert('".$minor."')</script>";
                 }
                 else{
                   $minor = 30;
                 }

                if(count($major_arr) != 0) {
                 $major= ($major/(100*count($major_arr)))*60;
                 // echo "<script>alert('".$major."')</script>";
                }
                else{
                  $major = 60;
                }

                 $total += $other;
                 $total += $minor;
                 $total += $major;




            ?>
            <?php  if($_SESSION['perm'] == 0|| isset($_GET['stud_filter'])){?>
            <tr>
              <td class = "column1"></td><td class = "column2"></td><td class = "column3"></td><td class = "column4"></td><td class = "column5"></td>
              <td class = "column6">
                <strong>Total Grade: <?php print_r($total) ?></strong>
              </td>
            </tr>
                <?php } ?>
           </tbody>
         </table>
       </div>
     </div>

   </div>
 </div>


 <script type="text/javascript">
 function getParameterByName(name, url) {
    if (!url) url = window.location.href;
    name = name.replace(/[\[\]]/g, "\\$&");
    var regex = new RegExp("[?&]" + name + "(=([^&#]*)|&|#|$)"),
        results = regex.exec(url);
    if (!results) return null;
    if (!results[2]) return '';
    return decodeURIComponent(results[2].replace(/\+/g, " "));
  }


   $('.gradeInput').change(function(){
     pos = this.className.split(' ')[1]
     // var fil = getParameterByName('stud_filter');
     // window.location = ('updateGrade.php?comments='+this.value+"&pos="+pos+"&stud_filter="+fil);
     if (window.XMLHttpRequest) {
         // code for IE7+, Firefox, Chrome, Opera, Safari
         xmlhttp = new XMLHttpRequest();
     } else {
         // code for IE6,
         xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
     }
     xmlhttp.onreadystatechange = function() {
         if (this.readyState == 4 && this.status == 200) {
         }
     };
     xmlhttp.open("GET",'updateGrade.php?grade='+this.value+"&pos="+pos,true);
     xmlhttp.send();
   });

    $(document).ready(function(){
      $('.commentInput').each(function(){
          this.style.height = "";
          this.style.height = (this.scrollHeight+5) + "px";
      });
    });


   $('.commentInput').change(function(){
     pos = this.className.split(' ')[1]
     // var fil = getParameterByName('stud_filter');
     // window.location = ('updateGrade.php?comments='+this.value+"&pos="+pos+"&stud_filter="+fil);
     if (window.XMLHttpRequest) {
         // code for IE7+, Firefox, Chrome, Opera, Safari
         xmlhttp = new XMLHttpRequest();
     } else {
         // code for IE6,
         xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
     }
     xmlhttp.onreadystatechange = function() {
         if (this.readyState == 4 && this.status == 200) {

         }
     };
     xmlhttp.open("GET",'updateGrade.php?comments='+this.value+"&pos="+pos,true);
     xmlhttp.send();
   });

   function showAssignmentForStudent(student) {

     if (student == "") {
       $('#assignments').find('option').remove().end().append('<option value="">^</option>').val('');
       return;
     } else {
        $('#assignments').find('option').remove().end();
       if (window.XMLHttpRequest) {
           // code for IE7+, Firefox, Chrome, Opera, Safari
           xmlhttp = new XMLHttpRequest();
       } else {
           // code for IE6,
           xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
       }
       xmlhttp.onreadystatechange = function() {
           if (this.readyState == 4 && this.status == 200) {
               $('#assignments').append(this.responseText);
           }
       };
       xmlhttp.open("GET","showAssignments.php?stud="+student,true);
       xmlhttp.send();
   }
   }

 </script>
