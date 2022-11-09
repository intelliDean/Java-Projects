package assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class AirTest {
    Air newAc;
    @BeforeEach
    void toTestObject(){
        newAc = new Air();
    }
    @Test
    void testIsOn() {
        newAc.isOn(true);
        assertTrue(newAc.getIsOn());
    }

    @Test
    void testIsOff() {
        newAc.isOn(false);
        assertFalse(newAc.getIsOn());
    }


}