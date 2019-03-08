class Setup {
  int setup1() {
    moves=0;
    g=0;
    gameon=1;
    background(0); 
    setup2();
    return g;
  }
  void setup2() {
    pushMatrix();
    translate(-100, -100);
    for (int p=1; p<=z; p++) {
      for (int i=1; i<=z; i++) {
        diffx[i][p]=loadImage("btc.png");
        image(diffx[i][p], i*100, p*100);
      }
    }
    popMatrix();
  }
}
