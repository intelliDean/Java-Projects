package Practice.RockGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SRPGameTest {
    SRPGame srp;
    Player player;
    Computer computer;

    @BeforeEach
    void setUp() {
        srp = new SRPGame(player);
        player = new Player(1);
        computer = new Computer();
    }
    @Test
    void toTestThatPlayerExist() {
        player = new Player(1);
        assertNotNull(player);
    }
    @Test
    void toTestThatPlayerIsInTheGame() {
        srp.setPlayer(player);
        assertNotNull(srp.getPlayer());
    }
    @Test
    void toTestThatPlayerCanPlayGame() {
        srp.play(player, computer);
        assertTrue(srp.getResult() > 0);
    }
    @Test
    void toTestChoices() {
        srp.choice(1);
        assertEquals("scissors", srp.getChoice());
    }

}