package Chapter2;

import chapter02.Arithmetic;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArithmeticTest {

    @Test
    void toSquareTwoNumbers(){
        assertEquals("9:25", Arithmetic.squareTwoNumbers(3,5));
    }
    @Test
    void toSumTheirSquare(){
        assertEquals(13, Arithmetic.sumSquare(3,2));
    }
    @Test
    void toTestTheirDifference(){
        assertEquals(-11, Arithmetic.squareDifferences(5,6));
    }

}