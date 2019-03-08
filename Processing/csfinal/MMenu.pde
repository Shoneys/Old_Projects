class MMenu {
  int difficulty() {
    gameon=0;
    background(120);
    if (z==10) {
      z--;
    }
    if (z==0) {
      z++;
    }
    x=160;
    text("Choose Difficulty:", width/2, 40);
    for (int p=1; p<=z; p++) {
      image(btc, x, 75);
      x=x+60;
    }
    diffx= new PImage[10][10];
    text("Press DOWN to Begin", width/2, 210);
    return z;
  }
  void doesntcare() {
    if (keyCode==LEFT) {
      z--;
      mmen.difficulty();
    }
    if (keyCode==RIGHT) {
      z++;
      mmen.difficulty();
    }
    if (keyCode==DOWN) {
      if (gameon==0) {
        sum=z*z;
        set.setup1();
      }
    }
  }
}
