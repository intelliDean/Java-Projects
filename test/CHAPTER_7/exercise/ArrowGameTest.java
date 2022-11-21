package CHAPTER_7.exercise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ArrowGameTest {
    ArrowGame game;
    //Player[] players;


    @BeforeEach
    void setUp(){
        game = new ArrowGame(1);
        //players = new Player[];
    }
    @Test
    void tesThatGameExist() {
        assertNotNull(game);

    }
    @Test
    public void toTestThatPlayerExistInGame() {
        Player[] players = game.getPlayers();
        
    }

}