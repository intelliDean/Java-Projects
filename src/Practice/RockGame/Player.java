package Practice.RockGame;

import java.util.Scanner;

public class Player {

    private final int playerID;
    public Player(int id) {
        playerID = id;
    }

    public int getPlayerID() {
        return playerID;
    }

    public int play() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int number = input.nextInt();
        if (number == '1' || number == '2' || number == '0') {
            return number;
        } else return -1;
    }
}
