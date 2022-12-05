package Chapter2;

import assignment.SquareNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberAndItsSquareTest {
    SquareNumber small;

    @Test
    void testThatClassExist(){
        //To create a new object
        small = new SquareNumber();
        // I expect that
        assertNotNull(small);
    }
    @BeforeEach
    void toBeginEachTest(){
        small = new SquareNumber();
    }

    @Test
    void toTestThatSquareWorks(){
        //given that
        int num1 = 5;
        //when
        small.squareNumber(5);
        //I expect that
        assertEquals(25,small.squareNumber(5));
    }
    @Test
    void toTestTheSumOfIntegerAndItsSquare(){
        //given that
        small.squareAndNumber(2);
        // I expect that
        assertEquals(6, small.squareAndNumber(2));
    }
    @Test
    void toTestThatNumberIsGreatThanOrLessThan100(){
        //given that
        small.numberIsGreaterThan100(10);
        // I expect that
        assertEquals(1, small.numberIsGreaterThan100(10));
    }
    @Test
    void toTestNumberIsEqualTo100(){
        //given that
        small.numberIsEqualsTo100(10);
        // I expect that
        assertEquals(1, small.numberIsEqualsTo100(10));
    }
}