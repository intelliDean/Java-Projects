package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import snack.Clock;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class ClockTest {
    Clock ago; //ago is the instance variable

    @BeforeEach
    void toStartWith(){
        ago = new Clock(23,59,59); //
    }

    @Test
    void toTestThatClockExist(){
        ago = new Clock(7,34,5);
        assertNotNull(ago);
    }

    @Test
    void toTestTheHourOfTheClock(){
        ago.setHour(13);
        Assertions.assertEquals(13, ago.getHour());
    }
    @Test
    void toTestTheMinuteOfTheClock(){
        ago.setMinute(60);
        Assertions.assertEquals(0, ago.getMinute());
    }
    @Test
    void toTestTheSecondOfTheClock(){
        ago.setSecond(5);
        Assertions.assertEquals(5, ago.getSecond());
    }
    @Test
    @DisplayName("This test method is supposed to display time in hh:mm:ss format")
    void toTestDisplayTime(){
        ago.setTime(12,43,12);
        Assertions.assertEquals("12:43:12", ago.displayTime());
    }
}