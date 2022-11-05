package MyReusableCodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CapitaliseForLetterTest {
    @Test
    void toTestThatMethodCapitaliseTheFirstLetterOfAWord() {
        assertEquals("Come inside", CapitaliseForLetter.capitaliseFirstLetter("come inside"));
    }
    @Test
    void toTestThatTheSecondMethodWorks() {
        assertEquals("Michael dean", CapitaliseForLetter.capitalise("michael dean"));
    }

}