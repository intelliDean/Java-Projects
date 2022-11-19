package Practice.Car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Practice.Car.Cordinate.*;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car car;
    // i planned to make gear go diagonal,  right down
    // from 0,0 to 1,1 and from 1,1 to 2,2, etc

    @BeforeEach
    void beforeEveryTest() {
        car = new Car();
    }
    @Test
    void toTestThatCarExist() {
        assertNotNull(car);
    }
    @Test
    void toTestThatGearIsUp() {
        car.gearUp();
        assertTrue(car.isUp());
    }
    @Test
    void toTestThatGearIsDOwn() {
        car.gearUp();
        assertTrue(car.isUp());
        car.gearDown();
        assertFalse(car.isUp());
    }
    @Test
    void toTestIfGearTurnsRightWhileFacingEast() {
        assertEquals(EAST, car.getsCurrentCordinate());     //at rest
        car.turnsRight();
        assertEquals(SOUTH, car.getsCurrentCordinate());
    }
    @Test
    void toTestThatGearTurnsRightWileFacingSouth() {
        assertEquals(EAST, car.getsCurrentCordinate());     //ar rest
        car.turnsRight();       //a turn from rest
        assertEquals(SOUTH, car.getsCurrentCordinate());
        car.turnsRight();
        assertEquals(WEST, car.getsCurrentCordinate());
    }
    @Test
    void toTestThatGearTurnsRightWhileFacingWest() {
        assertEquals(EAST, car.getsCurrentCordinate());
        car.turnsRight();
        assertEquals(SOUTH, car.getsCurrentCordinate());
        car.turnsRight();
        assertEquals(WEST, car.getsCurrentCordinate());
        car.turnsRight();
        assertEquals(NORTH, car.getsCurrentCordinate());
    }
    @Test
    void toTestThatGearTurnsRightWhileFacingNorth() {
        //given that gear is at rest
        assertEquals(EAST, car.getsCurrentCordinate());
        // if i turn right
        car.turnsRight();
        // my new direction will be to face SOUTH
        assertEquals(SOUTH, car.getsCurrentCordinate());
        //if i turn right
        car.turnsRight();
        // my new direction will be facing WEST
        assertEquals(WEST, car.getsCurrentCordinate());
        // if i turn right
        car.turnsRight();
        //my new direction will be facing NORTH
        assertEquals(NORTH, car.getsCurrentCordinate());
        //if i turn right
        car.turnsRight();
        // my new direction will be facing EAST
        assertEquals(EAST, car.getsCurrentCordinate() );
    }
    @Test
    void toTestThatGearTurnsLeftWhileFacingEast() {
        assertEquals(EAST, car.getsCurrentCordinate());
         car.turnsLeft();
        assertEquals(NORTH, car.getsCurrentCordinate());
    }
    @Test
    void toTestThatGearTurnsLeftWhileFacingNorth() {
        assertEquals(EAST, car.getsCurrentCordinate());
        car.turnsLeft();
        assertEquals(NORTH, car.getsCurrentCordinate());
        car.turnsLeft();
        assertEquals(WEST, car.getsCurrentCordinate());
    }
    @Test
    void toTestThatGearTurnsLeftWhileFacingWest() {
        assertEquals(EAST, car.getsCurrentCordinate());
        car.turnsLeft();
        assertEquals(NORTH,car.getsCurrentCordinate());
        car.turnsLeft();
        assertEquals(WEST, car.getsCurrentCordinate());
        car.turnsLeft();
        assertEquals(SOUTH, car.getsCurrentCordinate());
    }
    @Test
    void toTestThatGearTurnsLeftWhileFacingSouth() {
        assertEquals(EAST, car.getsCurrentCordinate());
        car.turnsLeft();
        assertEquals(NORTH, car.getsCurrentCordinate());
        car.turnsLeft();
        assertEquals(WEST, car.getsCurrentCordinate());
        car.turnsLeft();
        assertEquals(SOUTH, car.getsCurrentCordinate());
        car.turnsLeft();
        assertEquals(EAST, car.getsCurrentCordinate());
    }
    @Test
    void toTestThatGearCanMoveForward() {
        assertEquals(EAST, car.getsCurrentCordinate());
        car.moves(5);
        assertEquals(new State(0,5), car.getsCurrentState());
    }



}