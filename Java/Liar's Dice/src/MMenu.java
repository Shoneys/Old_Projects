import java.util.Scanner;

class MMenu {
    /*
    MMenu.java:
        Implements main method.
        Assigns move types to each player.
        Chooses the first mover in game, and whether it should be random.
        secret Human vs. Human mode: select 3 for second player after choosing Human for the first.
     */
    static Scanner in = new Scanner(System.in);
    static public Game theGame = new Game();

    public static void main(String[] args) {
        System.out.println("Player 1 is a:\n1.) Dumb Computer\n2.) Smart Computer\n3.) Human");
        int choice1 = in.nextInt();
        //need try-catch for non Int types

        Player player1 = new Player();
        player1.type = choice1;

        System.out.println("Player 2 is a:\n1.) Dumb Computer\n2.) Smart Computer");
        if (player1.type != 3) {
            System.out.print("3.) Human");
        }
        int choice2 = in.nextInt();

        Player player2 = new Player();
        player2.type = choice2;

        choiceofRandom(player1, player2);
    }

    public static void choiceofRandom(Player player1, Player player2) {
        System.out.println("Should first turn be random? (1=yes, 2=no)");
        int randomYN = in.nextInt();

        if (randomYN == 1) {
            firstMover(player1, player2);
        } else if (randomYN == 2) {
            theGame.runningtheGame(player1, player2);
        }
    }

    public static void firstMover(Player player1, Player player2) {
        int d2 = (int) (Math.random() * 2) + 1;
        if (d2 == 1) {
            theGame.runningtheGame(player1, player2);
        } else if (d2 == 2) {
            theGame.runningtheGame(player2, player1);
        }

    }
}
