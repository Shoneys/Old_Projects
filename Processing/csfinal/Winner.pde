class Winner {
  void chickendinner() {
    gameon=0;
    if (g==0) {
      background(0, 255, 0);
    }
    g=g+5;
    if (g<900) {
      image(btc, random(-50, 850), g);
      fill(0);
      rect(width/2, height/2-33, 740, 150);
      fill(190, 190, 0);
      text("You win!", width/2, height/2-70);
      text("Press left/right to restart", width/2, height/2);
      fill(0);
      rect(750, 65,275, 130);
      fill(190, 190, 0);
      text("Moves:"+moves, 750, 30);
      lel=((z*z)*100)/moves;
      text("Score:"+lel, 750, 100);
      if (g>=710) {
        g=0;
      }
    }
  }
}
