interface Gameable {
    /*
    Gameable.java
        The interface for Game.java
     */

    void runningtheGame(Player player1, Player player2);
    void theGame(Player player1, Player player2);

    void humanBidTurn(Player player);

    void dumbComputerBidTurn(Player player);

    void smartComputerBidTurn(Player player);


    void dumbComputerLIARTurn(Player player1, Player player2);

    void smartComputerLIARTurn(Player player1, Player player2);

    void humanLIARTurn(Player player1, Player player2);

    void facevalueChange(Player player);

    void numberofdiceChange(Player player);


    void callBluff(Player player1, Player player2);

}
