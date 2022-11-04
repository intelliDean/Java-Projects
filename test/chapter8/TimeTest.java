package chapter8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeTest {

    Time myTime;
    @BeforeEach
    void toStartEveryTest() {
    myTime = new Time(12,23,23);
    }


    @Test
    void toCreateAnObject() {
        myTime = new Time(13, 15, 26);
    }
    @Test
    void toValidateAndSetHour() {
        myTime.setHour(20);
        assertEquals(20, myTime.getHour());
    }
    @Test
    void toValidateAndSetMinute() {
        myTime.setMinute(59);
        assertEquals(59, myTime.getMinute());
    }
    @Test
    void toValidateAndSecond() {
        myTime.setSecond(34);
        assertEquals(34, myTime.getSecond());
    }
    @Test
    void toSetTimeToUniversalString() {
        assertEquals("12:23:23", myTime.toUniversalString());
    }
    @Test
    void toSetTimeToString() {
        assertEquals("12:23:23 PM", myTime.toString());
    }
}