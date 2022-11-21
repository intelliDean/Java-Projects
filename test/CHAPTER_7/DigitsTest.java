package CHAPTER_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitsTest {
    @Test
    void toTestThatMethodReturnsDigitsInAString() {
        assertEquals(5, Digits.isDigit("0-l+_p754g9?"));
        assertEquals(5, Digits.digits("0-l+_p754g9?"));
    }

}