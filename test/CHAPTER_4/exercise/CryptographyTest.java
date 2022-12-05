package CHAPTER_4.exercise;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class CryptographyTest {

    @Test
    void encryption() {
        assertEquals("0189", Cryptography.encryption(1234));
    }

    @Test
    void decryption() {
        BigInteger number =  new BigInteger("0189");
        assertEquals("9767", Cryptography.decryption(3464));
    }
}