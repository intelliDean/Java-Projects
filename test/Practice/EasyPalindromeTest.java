package Practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EasyPalindromeTest {
    @Test
    void testPali() {
        assertTrue(EasyPalindrome.pali("madam"));
        assertFalse(EasyPalindrome.pali("false"));
        assertFalse(EasyPalindrome.pali("man"));
        assertTrue(EasyPalindrome.pali("1100011"));
    }
    @Test
    void testRev() {
        assertEquals("nam", EasyPalindrome.rev("man"));
    }
    @Test
    void testRevString() {
        assertEquals("Not Palindrome", EasyPalindrome.rev("man"));
        assertEquals("Palindrome", EasyPalindrome.rev("madam"));
    }
}