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

  body{
    min-height: 100vh;
    background: #a180e8;
    background: -webkit-linear-gradient(45deg, #1947ab, #a180e8);
    background: -o-linear-gradient(45deg, #1947ab, #a180e8);
    background: -moz-linear-gradient(45deg, #1947ab, #a180e8);
    background: linear-gradient(45deg, #1947ab, #a180e8);
  }
  .wrap-col{
    display: -webkit-box;
    display: -webkit-flex;
    display: -moz-box;
    display: -ms-flexbox;
    display: flex;
     align-items: center;
    justify-content: center;
    flex-wrap: wrap;
    padding: 33px 30px;
  }
  #container1 {
      margin-top: 50px;
      /* float:left; */
      width:80%;
      text-align: center;
  }
  #col1 {
      float:left;
      width:50%;
      /* background:red; */
  }
  #col2 {
      float:left;
      width:50%;
      /* background:yellow; */
  }
</style>

<a href = "index.php" id = "home"><i class="fa fa-home" aria-hidden="true" style="margin-left: 1rem;"></i></a>


<div class="header" style="text-align: center;">
    <h2 style="font-size: 60px; color: blue;">About Me</h2>
</div>

<div class = "wrap-col">
  <div id="container1">
      <div id="col1">
        <h2><u> Instructor Info </u></h2>

        <img src="img/img-01.png" alt="Instructor Picture" style="float: left">
        <p style="float: none; margin-left: 20px; ">text here jflfjdalkfjdaslfj lfjlsfjlfjlajlk jlk jlk jflasjfldkasjf lj kl;asjfl ;ajdlfdjalk jlkfj ladjf sadkl</p>
      </div>
      <div id="col2">
        <h2><u> Class Info </u></h2>



      </div>
  </div>
</div>
