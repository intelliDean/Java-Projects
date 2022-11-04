package CHAPTER_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTwoLargestNumberTest {
    @Test
    void toSumTheTwoLargestNumbers() {
        assertEquals(8, SumTwoLargestNumber.twoLargest(new int[]{1,2,3,5}));
    }

}