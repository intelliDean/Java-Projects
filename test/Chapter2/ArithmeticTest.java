package Chapter2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {
    Arithmetic pikin;

    @BeforeEach
    void toStartWith(){
        pikin = new Arithmetic();
    }

    @Test
    void toTestIfObjectExist(){
        //given that
        pikin = new Arithmetic();
        // I expect that
        assertNotNull(pikin);
    }
    @Test
    void toSquareTwoNumbers(){
        //given that
        pikin.squareTwoNumbers(3,5);
        // I expect
        assertEquals("9:25", pikin.squareTwoNumbers(3,5));
    }
    @Test
    void toSumTheirSquare(){
        //given that
        pikin.sumSquare(3,2);
        // I expect that
        assertEquals(13, pikin.sumSquare(3,2));
    }
    @Test
    void toTestTheirDifference(){
        //given that
        pikin.squareDifferences(5,6);
        // I expect that
        assertEquals(-11, pikin.squareDifferences(5,6));
    }

}