import java.util.ArrayList;

class Game implements Gameable {
    /*
    Game.Java
        Holds the Game loop.
        Assigns AI to dumb or smart computer.
        Allows user to make bets
        Implements the methods in Interface Gameable.

        ArrayList alldice: concatenates player1 and player2's dice in to one list. It is stored within Player1, as that is who is checked when Player2 calls bluff
        DumbComputerBidTurn: chooses randomly
        SmartComputerBidTurn: chooses based on number of dice in hand
        HumanBidTurn: allows human to bid

        dumbComputerLIARTurn: chooses randomly
        smartComputerLIARTurn: chooses to call bluff based on number of dice opponent calls, or raise its guessed number of dice by 1 (Low effort solution)
        humanLIARTurn: allows human to raise (split in to separate methods facevalueChange and numberofdiceChange) or call bluff

        callBluff:
        checkBluff: most important part of program, checks if a player's bluff has been called
     */
    ArrayList alldice = new ArrayList();
    int i = 0;

    public void runningtheGame(Player player1, Player player2) {
        alldice.addAll(player1.dicevalues);
        alldice.addAll(player2.dicevalues);
        //System.out.println(alldice); debug
        if (player1.type == 2) {
            player1.getFV();
            player1.facevalue = player1.smartcompFV;
            player1.numofdice = player1.smartcompND;
        } else if (player2.type == 2) {
            player2.getFV();
            player2.facevalue = player2.smartcompFV;
            player2.numofdice = player2.smartcompND;
        }

        theGame(player1, player2);
    }

    public void theGame(Player player1, Player player2) {
        System.out.println("\nFor this turn, we are starting with: " + player1.gettype());
        if (i > 0) {
            System.out.println("Their previous bid was: " + player1.numofdice + " " + player1.facevalue + "'s");
        }

        if (player1.type == 1) {
            dumbComputerBidTurn(player1);
        } else if (player1.type == 2) {
            smartComputerBidTurn(player1);
        } else if (player1.type == 3) {
            humanBidTurn(player1);
        }

        System.out.println("The second mover is: " + player2.gettype());
        if (i > 0) {
            System.out.println("Their previous bid was: " + player2.numofdice + " " + player2.facevalue + "'s");
        }

        if (player2.type == 1) {
            dumbComputerLIARTurn(player1, player2);
        } else if (player2.type == 2) {
            smartComputerLIARTurn(player1, player2);
        } else if (player2.type == 3) {
            humanLIARTurn(player1, player2);
        }

        System.out.println("\n***Next Round!***\n");
        i++;
        theGame(player2, player1);
    }

    public void dumbComputerBidTurn(Player player) {
        player.facevalue = (int) (Math.random() * 6) + 1;
        player.numofdice = (int) (Math.random() * alldice.size()) + 1;
        System.out.println("I, DUMB COMPUTER, BID: " + player.numofdice + " " + player.facevalue + "'s");
    }

    public void smartComputerBidTurn(Player player) {
        if (i > 0) {
            player.numofdice++;
        }
        System.out.println("I, Smart Computer, bid: " + player.numofdice + " " + player.facevalue + "'s");
    }

    public void humanBidTurn(Player player) {
        System.out.println("The human's dice are: " + player.getDice());
        System.out.println("Human, enter your Bid for face value (1-6): ");
        player.facevalue = MMenu.in.nextInt();
        if (player.facevalue < 1 || player.facevalue > 6) {
            System.out.println("Please enter a valid range!");
            humanBidTurn(player);
        }
        System.out.println("Human, enter min number of dice (1-10): ");
        player.numofdice = MMenu.in.nextInt();
        if (player.numofdice < 1 || player.numofdice > 10) {
            System.out.println("Please enter a valid range!");
            humanBidTurn(player);
        }
    }


    public void dumbComputerLIARTurn(Player player1, Player player2) {
        System.out.println("I MAKE RANDOM ACCUSATIONS");
        int d2 = (int) (Math.random() * 2) + 1;
        if (d2 == 1) {
            player2.numofdice = (int) (Math.random() * 10) + player2.numofdice + 1;
            System.out.println("I RAISE TO: " + player2.numofdice + " " + player2.facevalue + "'s");
        } else {
            System.out.println("I CALL BLUFF!");
            callBluff(player1, player2);
        }
    }

    public void smartComputerLIARTurn(Player player1, Player player2) {
        if (player1.numofdice >= 5) {
            callBluff(player1, player2);
        } else {
            System.out.println("Smart computer raises to: " + player2.numofdice + " dice with value " + player2.facevalue);
        }
    }

    public void humanLIARTurn(Player player1, Player player2) {
        if (i == 0) {
            if (player1.type == 3) {
                humanBidTurn(player1);
            } else if (player2.type == 3) {
                humanBidTurn(player2);
            }
        }
        if (i > 0) {
            System.out.println("Do you raise or call Bluff? (1=Raise, 2=Call Bluff): ");
            int betorbluff = MMenu.in.nextInt();

            if (betorbluff == 1) {
                System.out.println("Want to raise face value, number of dice, or both? (1=Face Value, 2=Number of Dice, 3=Both)");
                int raisechoice = MMenu.in.nextInt();
                if (raisechoice == 1) {
                    facevalueChange(player2);
                } else if (raisechoice == 2) {
                    numberofdiceChange(player2);
                } else if (raisechoice == 3) {
                    facevalueChange(player2);
                    numberofdiceChange(player2);
                }

            } else if (betorbluff == 2) {
                callBluff(player1, player2);
            }
        }
    }

    public void facevalueChange(Player player) {
        System.out.println("Enter how much you raise face value: ");
        int temp = MMenu.in.nextInt();

        if (temp >= player.facevalue && temp <= alldice.size()) {
            player.facevalue = temp;
        } else {
            System.out.println("Please enter a value equal to or larger than: " + player.facevalue);
            facevalueChange(player);
        }
    }

    public void numberofdiceChange(Player player) {
        System.out.println("Enter how much you raise number of dice, or stay: ");
        int temp = MMenu.in.nextInt();
        if (temp >= player.numofdice && temp <= alldice.size()) {
            player.numofdice = temp;
        } else {
            System.out.println("Please enter a value equal to or larger than: " + player.numofdice);
            numberofdiceChange(player);
        }

    }


    public void callBluff(Player player1, Player player2) {
        System.out.println("\n" + player2.gettype() + " calls bluff!");
        System.out.println(player1.gettype() + "'s dice: " + player1.getDice() + "; " + player1.numofdice + " " + player1.facevalue + "'s");
        System.out.println(player2.gettype() + "'s dice: " + player2.getDice() + "; " + player2.numofdice + " " + player2.facevalue + "'s");
        if (checkBluff(player1, player2) == false) {
            System.out.println(player1.gettype() + " is a LIAR!");
            System.out.println(player2.gettype() + " is a winner!");
        } else if (checkBluff(player1, player2) == true) {
            System.out.println(player1.gettype() + " is a winner!");
            System.out.println(player2.gettype() + " is a blasphemer!");
        }
        System.exit(0);
    }

    public Boolean checkBluff(Player player1, Player player2) {
        int bluffcheck = 0;
        for (Object O : alldice) {
            if (O.equals(player1.facevalue)) {
                bluffcheck++;
                if (bluffcheck >= player1.numofdice) {
                    return true;
                }
            }
        }
        return false;
    }
}
