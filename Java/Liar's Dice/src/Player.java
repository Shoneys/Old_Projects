import java.util.ArrayList;
import java.util.Collections;

public class Player implements Playable {
    /*
    Player.java
        Object that describes a Player
        Can be computer or human
        Stores instance variables and handles the checkBluff

        getFV: used for smartComp, assigns most frequent values to the computer's guesses
        gettype: returns type of player
        getDice: returns dice arraylist
        generateDice: generates Dice
     */
    int type;
    int facevalue;
    int numofdice;
    int smartcompND;
    int smartcompFV;
    ArrayList dicevalues = generateDice();

    public void getFV() {
        int index = 1;
        int freq;
        int tempFV = 0;
        int tempNoD = 0;
        for (Object o: dicevalues) {
            freq = Collections.frequency(dicevalues, index);
            if (freq > tempNoD) {
                tempFV = index;
                tempNoD = freq;
            }
            if (index == dicevalues.size()) {
                smartcompFV = tempFV;
                smartcompND = tempNoD;
            }
            index++;
        }
    }

    public String gettype() {
        if (type == 1) {
            return "Dumb Computer";
        } else if (type == 2) {
            return "Smart Computer";
        } else if (type == 3) {
            return "Human";
        }
        return null;
    }

    public ArrayList getDice() {
        return dicevalues;
    }

    public ArrayList generateDice() {
        ArrayList tempvalues = new ArrayList();
        int index = 0;
        while (index <= 5) {
            tempvalues.add((int) (Math.random() * 6) + 1);
            index++;
        }
        return tempvalues;
    }

}
