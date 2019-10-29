var started = false;


function setup(){
  createCanvas(400, 600);
  bird = new Bird();
  pipes = [new Pipe()];
  score = 0;

  noLoop();
}

function start(){

    if(!started) {
       started = true;
       loop();
    }
    else{
      started = false;
      noLoop();
    }

}

function draw(){
  background (0);
  if(started) {
    bird.update();
    bird.show();

    if(frameCount % 80 ==0){
      pipes.push(new Pipe());
    }

    textSize(48 +  sin(frameCount*0.1)*36);
    text(score, width/2 -40, 90);

    for(var i=0; i< pipes.length; i++){
        pipes[i].update();
        pipes[i].show();

        if(pipes[i].x < bird.x && pipes[i].x + 30 > bird.x) {
            if(!pipes[i].score){
              score++;
              console.log(score);
              pipes[i].score = true;
            }

            var circle ={x:bird.x, y:bird.y,r:32};
            var rect1   ={x:pipes[i].x,y:0,w:40,h:pipes[i].topHeight-20};
            var rect2   ={x:pipes[i].x,y:(height-pipes[i].botHeight+20),w:40,h:pipes[i].botHeight};

            if(RectCircleColliding(circle,rect1) || RectCircleColliding(circle,rect2)) {
              noLoop();
              window.location = "updateFlappyLeaderboard.php?score="+score;
            }
        }
        if(pipes[i].x < 0) {
          pipes.splice(i,1);
          i--;
        }


    }
  }
}

function keyPressed() {
  if (key == ' ') {
    bird.up();
  }
}

function Bird() {
  this.y = height/2;
  this.x = 50;

  this.gravity  = 0.5;
  this.velocity = 0;
  this.goUp       = -10;

  this.show = function() {
    fill(color(random(255), random(255), random(255)));
    // fill(150);
    ellipse(this.x, this.y, 32, 32);
  }

  this.update = function(){
     this.velocity += this.gravity;
     this.velocity *= 0.95;
     this.y += this.velocity;

     if (this.y >= height) {
       this.y = height;
       this.velocity =0;
     }

     if (this.y <= 0) {
       this.y = 0;
       this.velocity = 0;
     }

  }

  this.up = function(){
    this.velocity += this.goUp;
  }


}

function Pipe() {
  this.topHeight = getRndNum(0,height-120);
  this.spaceInBetween = getRndNum(100,250);
  this.botHeight = height-this.topHeight-this.spaceInBetween;
  this.score = false;
  this.x = width;
  this.velocity = -6;

  this.update = function() {
    this.x += this.velocity
  }

  this.show = function() {
      fill(color(random(255), random(255), random(255)));
    rect(this.x, 0, 40, this.topHeight);
    rect(this.x, (height-this.botHeight), 40, this.botHeight);
  }
}

// return true if the rectangle and circle are colliding
function RectCircleColliding(circle,rect){
    var distX = Math.abs(circle.x - rect.x-rect.w/2);
    var distY = Math.abs(circle.y - rect.y-rect.h/2);

    if (distX > (rect.w/2 + circle.r)) { return false; }
    if (distY > (rect.h/2 + circle.r)) { return false; }

    if (distX <= (rect.w/2)) { return true; }
    if (distY <= (rect.h/2)) { return true; }

    var dx=distX-rect.w/2;
    var dy=distY-rect.h/2;
    return (dx*dx+dy*dy<=(circle.r*circle.r));
}

function getRndNum(min, max) {
    return (Math.random() * (max - min + 1) ) + min;
}
