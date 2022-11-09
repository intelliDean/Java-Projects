package Practice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ACTest {
    AC myAC;

    @BeforeEach
    void toStartEveryTest() {
        myAC = new AC();
    }
    @Test
    void toTestThatThereIsAnAC() {
        myAC = new AC();
    }
    @Test
    void toTestThatACIsOn() {
        myAC.setOn(true);
        assertTrue(myAC.getOn());
    }
    @Test
    void toTestThatACIsOff() {
        myAC.setOn(false);
        assertFalse(myAC.getOn());
    }
    @Test
    void toTestThatACIncreasesInTemperature() {
        myAC.increaseTemperature();
        assertEquals(1, myAC.getTemperature());
    }

}