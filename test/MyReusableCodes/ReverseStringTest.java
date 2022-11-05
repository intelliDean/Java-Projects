package MyReusableCodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {
    @Test
    void toTestThatStringReverses() {
        assertEquals("emoc", ReverseString.reverseString("come"));
    }
    @Test
    void toTestThatMethodDoesNotTakeWordLessThanTwoLetters() {
        assertNull(ReverseString.reverseString("w"));
    }
    @Test
    void toTestThatOneLineStringReverses() {
        assertEquals("naed", ReverseString.reverseStringOneLine("dean"));
    }
    @Test
    void toTestThatMethodOneLineDoesNotTakeWordLessThanTwoLetters() {
        assertNull(ReverseString.reverseStringOneLine("d"));
    }
}