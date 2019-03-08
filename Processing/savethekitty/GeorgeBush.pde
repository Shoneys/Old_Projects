PImage kitty;
PFont font;
int timestart=5000, timeleft;


void setup() {
  background(0);
  size(1000, 700);
  font=loadFont("asdf1738.vlw");
  kitty=loadImage("kitty.jpg");
  kitty.resize(0, 500);
}
void draw() {
  background(0);
  kitty();
  textSize(50);
  text("LIFE LEFT:", 550, 60);
  timeleft=timestart-millis();
  text(timeleft, 550, 120);

  if (timeleft<=0) {
    gameover();
  }
}
void kitty() {
  textSize(40);
  fill(255, 0, 0);
  text("This is your kitty. Don't let it die! Close out it dies!", 10, 575);
  image(kitty, 0, 0);
  textSize(40);
  fill(255, 0, 0);
  textSize(55);
  text("More ads opening=precious seconds", 10, 650);
}

void gameover() {
  background(255);
  int x;
  textSize(80);
  fill(0, 255, 0);
  if(){
  text("IT'S DEAD!!!!!!!!!!!!!!!!", 10, abs(timeleft)/3);
  }
}
