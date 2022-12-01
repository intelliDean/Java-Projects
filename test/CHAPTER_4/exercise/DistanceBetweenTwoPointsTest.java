package CHAPTER_4.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceBetweenTwoPointsTest {

    @Test
    void testTheDistanceBetweenXAndY() {
        assertEquals("x-axis is greater than y-axis", DistanceBetweenTwoPoints.comparePoints(7, 4));
    }

    @Test
    void testTheDistanceBetweenYAndX() {
        assertEquals("y-axis is greater than x-axis" , DistanceBetweenTwoPoints.comparePoints(7, 9));
    }


    @Test
    void testTheDistanceBetweenTwoPoints() {
        assertEquals("The points are located on a line", DistanceBetweenTwoPoints.comparePoints(7, 7));
    }
}