package CHAPTER_7.exercise;

public class ArrowGame {
    private Player[] players;


    public ArrowGame(int numberOfArchers){
        players = new Player[numberOfArchers];
    }
    public Player[] getPlayers() {
        return players;
    }
    private      void addPlayer(int numberOfArchers) {
        for (int i = 0; i < numberOfArchers; i++) {
            players[i] = new Player();
        }
    }
}
