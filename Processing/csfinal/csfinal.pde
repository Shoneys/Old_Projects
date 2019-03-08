PFont font;
PImage btc, invert;
PImage[][] diffx;
int x, y, z;
int sum=1;
int g=0;
int l=100;
int gameon=0;
int moves;
int lel;
import ddf.minim.*;
Setup set;
Game gam;
MMenu mmen; 
Winner wen;

Minim minim;
AudioPlayer song;
  
void setup() {
  size(900, 900);
  minim = new Minim(this);
  song = minim.loadFile("DARUDE.mp3");
  song.loop();
  textSize(40);
  btc=loadImage("btc.png");
  set = new Setup();
  gam = new Game();
  mmen = new MMenu();
  wen = new Winner();
  font=loadFont("AgencyFB-Bold-75.vlw");
  fill(190, 190, 0);
  textFont(font);
  invert=loadImage("invert.png");
  textAlign(CENTER, CENTER);
  rectMode(CENTER);
  mmen.difficulty();
}
void draw() {
  if (sum==0) {
    wen.chickendinner();
  }
}

void keyPressed() {
  mmen.doesntcare();
  sum=z*z;
}

void mouseClicked() {
  if (gameon==1) {
    moves++;
    gam.GeorgeBush();
  }
}
