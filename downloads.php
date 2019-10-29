<?php include("header.php"); ?>
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
    background-image: url("img/bg.jpg");
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
    width:70%;
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
a {
  color: white;
  font-family: helvetica;
  text-decoration: none;

}

a:hover {
    color: yellow;
  text-decoration: underline;
}

a:active {
  color: black;
}

a:visited {
  color: black;
}

</style>

<a href = "index.php" id = "home"><i class="fa fa-home" aria-hidden="true" style="margin-left: 1rem"></i></a>

<div class = "wrap-col">
  <div id="container1">
      <div id="col1">
        <!-- <h2><u>Installation & Terms: </u></h2>
        <ul class="fa-ul">
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = " http://www.jcreator.org/download.htm#page2">JCreator</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "http://www.oracle.com/technetwork/java/javase/downloads/jdk10-downloads-4416644.html">Java</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 1 - Setup\Installing Java.pdf">Installation Directions</a></li><br>

          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 1 - Setup\assignment_other.txt">Intro to Class Questions</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 1 - Setup\assignment_minor">Java Terms Questions</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 1 - Setup\Vocab.doc">Java Vocab Game Questions</a></li>

        </ul>

        <h2><u>If Statements: </u></h2>
        <ul class="fa-ul">
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 3 - Methods  IF\IF statements.pptx" download >If Statements Powerpoint</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 3 - Methods  IF\if_statments__wks.pdf" download>If Statements Game</a></li><br>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 3 - Methods  IF\ifws2.pdf" download>If Statements Worksheet</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 3 - Methods  IF\greatest.txt" download>Greatest Assignment</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 3 - Methods  IF\posOrNeg.txt" download>Positive or Negative Assignment</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 3 - Methods  IF\weekday.txt" download>Weekday Assignment</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 3 - Methods  IF\salaryComputing.txt" download>Salary Computing Assignment</a></li><br>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 3 - Methods  IF\AgeInfo.txt" download>Age Information Assignment</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 3 - Methods  IF\conditionals.pdf" download>If Statements Worksheet 2</a></li>


        </ul>

        <h2><u>Loops: </u></h2>
        <ul class="fa-ul">
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 4 - Loops\RepetitionStatements.pptx" download >Loops Powerpoint</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "https://www.geeksforgeeks.org/loops-in-java/" >Loops Reference</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 4 - Loops\Loops.doc" download >Loops Worksheet</a></li><br>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 4 - Loops\loopssolutions.pdf" download >Loops Game</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 4 - Loops\repetition.txt" download >Repetition</a></li>


        </ul>

        <h2><u>Arrays </u></h2>
        <ul class="fa-ul">
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "https://www.geeksforgeeks.org/arrays-in-java/">Reference Page</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 7 - Arrays\Arrays.pptx" download>Arrays PowerPoint</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 7 - Arrays\Arrays2D worksheet.doc" download>Arrays WS - In Class</a></li>
          <br>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 7 - Arrays\arraysws1.txt" download>Arrays WS1</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 7 - Arrays\arraysws2.pdf" download>Arrays WS2</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 7 - Arrays\battleship.txt" download>Battleship Assignment</a></li>

          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 7 - Arrays\Problem1.txt" download>Arrays Competition Problem 1</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 7 - Arrays\Problem2.txt" download>Arrays Competition Problem 2</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 7 - Arrays\Problem3.txt" download>Arrays Competition Problem 3</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 7 - Arrays\Problem4.txt" download>Arrays Competition Problem 4</a></li>
          <br />
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "https://mathbits.com/MathBits/Java/arrays/arrays.htm">Arrays Review Reference</a></li>



        </ul>

        <h2><u>ArrayLists </u></h2>
        <ul class="fa-ul">
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 9 - Wrappers, ArrayLists\ArrayLists.pptx" download>ArrayLists PowerPoint</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 9 - Wrappers, ArrayLists\arraylistWS1.pdf" download>ArrayLists WS1</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 9 - Wrappers, ArrayLists\arrayListWS2.pdf" download>ArrayLists WS2</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 9 - Wrappers, ArrayLists\arrayListWS3.pdf" download>ArrayLists WS3</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 9 - Wrappers, ArrayLists\ArrayWS.pdf" download>ArrayLists WS4</a></li>
          <br>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 9 - Wrappers, ArrayLists\Hangman.txt" download>Hangman Game</a></li>
          <br>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 9 - Wrappers, ArrayLists\HangmanSol.txt" download>Hangman Solution</a></li>


        </ul> -->


      </div>
      <div id="col2">
        <!-- <h2><u>Console Apps Basics: </u></h2>
        <ul class="fa-ul">
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = " files\Day 2 - Console Apps, var, input, math\assignment_minor.txt" >Print Statements TV Symbol</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 2 - Console Apps, var, input, math\in_class_minor.txt">Data Type Preferences</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 2 - Console Apps, var, input, math\variables_worksheet.docx">Variables Worksheet</a></li><br />
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 2 - Console Apps, var, input, math\VARIABLES, INPUT & MATH.pptx">Variables/Input/Math PowerPoint</a></li>


          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 2 - Console Apps, var, input, math\Worksheet 0.1 - Basics.pdf">Basics Worksheet</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 2 - Console Apps, var, input, math\Worksheet 1.1 - Scanner Practice.pdf">Scanner Practice Worksheet</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 2 - Console Apps, var, input, math\ThreeNumberAverage.txt">Three Number Average</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 2 - Console Apps, var, input, math\NumbersAndMath.txt">Numbers and Math</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 2 - Console Apps, var, input, math\DataBlender_Major.txt">Data Blender</a></li>
        </ul>

        <h2><u>Methods: </u></h2>
        <ul class="fa-ul">
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 3 - Methods  IF\Methods.pptx" download >Methods Powerpoint</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 3 - Methods  IF\Method Practice Worksheet_wks.pdf" download>Methods Worksheet</a></li>
          <br>
           <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 3 - Methods  IF\Java Quiz.docx" download>Java Basics, If Statements, Methods Quiz</a></li><br>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 3 - Methods  IF\methodsWKS.pdf" download>Methods Worksheet</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 3 - Methods  IF\Methods_Wks_CommentsAndHints.txt" download>Methods Worksheet Comments And Hints</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 3 - Methods  IF\Math_Calulcator.txt" download>Math Calculator</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "http://www.cs.fsu.edu/~myers/cgs3416/notes/methods.html" target = "_blank" >Reference Notes</a></li>

        </ul>

        <h2><u>Base Numbers: </u></h2>
        <ul class="fa-ul">
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "http://www.purplemath.com/modules/numbbase.htm">Reference Page</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 5 - Base Nums; Statement Count\WorksheetWorks_Number_System_Conversions_1.pdf" download>Conversion Problems - In Class</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 5 - Base Nums; Statement Count\Conversion_Worksheet.pdf" download>Conversion Game</a></li><br>

          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 5 - Base Nums; Statement Count\binaryNumsWksheet.doc" download>Binary WS</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 5 - Base Nums; Statement Count\binary_conversion.txt" download>Binary Conversion Assignment</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 5 - Base Nums; Statement Count\binAdd.pdf" download>Binary Addition Worksheet</a></li>



        </ul>

        <h2><u>Classes </u></h2>
        <ul class="fa-ul">
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 8 - Classes\Classes.pptx" download>Classes PowerPoint</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 8 - Classes\class_worksheet_1.docx" download>Classes WS1</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 8 - Classes\Ch4_Worksheet_Classes.doc" download>Classes WS2</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 8 - Classes\MovieTheater.txt" download>Movie Theater</a></li>
          <br>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 8 - Classes\elevatortxt.txt" download>Elevator</a></li>
          <br>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "https://www.caveofprogramming.com/java/beginners-java-test-your-knowledge-of-classes-and-objects.html">Classes Tutorial</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "https://www.geeksforgeeks.org/java-gq/class-and-object-2-gq/">Classes Quiz</a></li>

        </ul>

        <h2><u>Inheritance </u></h2>
        <ul class="fa-ul">
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 10,11 - Inheritance\Inheritance.pptx" download>Inheritance PowerPoint</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 10,11 - Inheritance\Inheritance2.pdf" download>Inheritance WS1</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 10,11 - Inheritance\InheritanceQuestionsWeb.txt" download>Inheritance WS2</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 10,11 - Inheritance\Inheritance.pptx" download>Inheritance WS3</a></li>
          <br>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "https://www.geeksforgeeks.org/inheritance-in-java/">Inheritance Reference</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "http://www.learnjavaonline.org/en/Inheritance">Inheritance Interactive Practice</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "https://www.hackerrank.com/challenges/java-inheritance-2/problem">Inheritance Exercise 1</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "https://www.hackerrank.com/challenges/java-method-overriding/problem">Inheritance Exercise 2</a></li>
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "https://www.hackerrank.com/challenges/java-method-overriding-2-super-keyword/problem">Inheritance Exercise 3</a></li>
          <br />
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\Day 10,11 - Inheritance\EmployeeProgramDirections.txt" download>Employee Program</a></li>
        </ul> -->

        <h2><u>Final Exam</u></h2>
        <ul class="fa-ul">
          <li><i class="fa-li fa fa-spinner fa-spin"></i><a href = "files\final_exam_questions.doc" download>Final Exam</a></li>
        </ul>

      </div>
  </div>
</div>
