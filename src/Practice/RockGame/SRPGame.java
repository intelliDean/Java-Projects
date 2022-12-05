package Practice.RockGame;

public class SRPGame {

    public Player player;
    public Computer computer;
    public int result;
    public String choice;

    public SRPGame(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void play(Player player, Computer computer) {
        if (player.play() == 1 && computer.play() == 2 ||
                player.play() == 2 && computer.play() == 1 ||
                player.play() == 1 && computer.play() == 0) {
            result = 1;
        } else if (computer.play() == 1 && player.play() == 1 ||
                computer.play() == 2 && player.play() == 2 ||
                computer.play() == 0 && player.play() == 0) {
            result = 2;
        } else {
            result = 3;
        }
    }
    public int getResult() {
        return result;
    }

    public void choice(int number) {
        if (number == 1) {
           choice = "scissors";
        } else if (number == 2) {
            choice = "rock";
        } else {
            choice = "paper";
        }
    }
    public String getChoice() {
        return choice;
    }
}
