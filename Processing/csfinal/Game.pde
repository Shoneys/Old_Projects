class Game {
  void GeorgeBush() {
      for (int p=0; p<=z-1; p++) {
        for (int i=0; i<=z-1; i++) {
          if (mouseX>i*100 && mouseX<=(i+1)*100 && mouseY>p*100 && mouseY<=(p+1)*100) {
            if (diffx[i][p]==invert) {
              diffx[i][p]=btc;
              image(diffx[i][p], i*100, p*100);
              sum++;
            } else {
              diffx[i][p]=invert;
              image(diffx[i][p], i*100, p*100);
              sum--;
            }
            if (i+1!=z) {
              if (diffx[i+1][p]==invert) {
                diffx[i+1][p]=btc;
                image(diffx[i+1][p], (i+1)*100, p*100);
                sum++;
              } else {
                diffx[i+1][p]=invert;
                image(diffx[i+1][p], (i+1)*100, p*100);
                sum--;
              }
            }
            if (i-1!=-1) {
              if (diffx[i-1][p]==invert) {
                diffx[i-1][p]=btc;
                image(diffx[i-1][p], (i-1)*100, p*100);
                sum++;
              } else {
                diffx[i-1][p]=invert;
                image(diffx[i-1][p], (i-1)*100, p*100);
                sum--;
              }
            }
            if (p+1!=z) {
              if (diffx[i][p+1]==invert) {
                diffx[i][p+1]=btc;
                image(diffx[i][p+1], i*100, (p+1)*100);
                sum++;
              } else {
                diffx[i][p+1]=invert;
                image(diffx[i][p+1], i*100, (p+1)*100);
                sum--;
              }
            }
            if (p-1!=-1) {
              if (diffx[i][p-1]==invert) {
                diffx[i][p-1]=btc;
                image(diffx[i][p-1], i*100, (p-1)*100);
                sum++;
              } else {
                diffx[i][p-1]=invert;
                image(diffx[i][p-1], i*100, (p-1)*100);
                sum--;
              }
            }
          }
        }
      }
   /*debug*/ print(" "+sum+"  "); print("  "+mouseX+" "+mouseY);
  }
  }
