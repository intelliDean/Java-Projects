package Practice.RockGame;

import java.security.SecureRandom;
import java.util.Scanner;

public class RockGameDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SecureRandom rand = new SecureRandom();
        Player newPlayer = new Player(1);

        SRPGame player = new SRPGame(newPlayer);
        Computer computer = new Computer();

        player.play(newPlayer, computer);

        if (player.result == 1) {
            System.out.println("You wins");
        } else if (player.result == 2) {
            System.out.println("It's a draw");
        } else {
            System.out.println("Computer wins");
        }
    }
}
