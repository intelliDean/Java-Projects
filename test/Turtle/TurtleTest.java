package Turtle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Turtle.Direction.*;
import static org.junit.jupiter.api.Assertions.*;

class TurtleTest {
    Turtle turtle;

    @BeforeEach
    void toStartEveryTest() {
        turtle = new Turtle();
    }
    @Test
    void turtleExistTest() {
        Turtle turtle = new Turtle();
        assertNotNull(turtle);
    }
    @Test
    void toTestPen() {
        turtle.penUp();
        assertTrue( turtle.isPenUp());
    }
    @Test
    void toTestPenDown() {
        turtle.penDown();
        assertFalse(turtle.isPenUp());
    }
    @Test
    void turtleCanTurnRightFacingEast(){
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightFacingSouth(){
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightFacingWest(){
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnRightFacingNorth(){
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnRight();
        assertEquals(EAST, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnLeftFacingEast() {
        assertEquals(EAST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnLeftFacingNorth() {
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(WEST, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnLeftFacingWest() {
        turtle.turnLeft();
        turtle.turnLeft();
        assertEquals(WEST, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(SOUTH, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanTurnLeftFacingSouth() {
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        assertEquals(EAST, turtle.getCurrentDirection());
    }
    @Test
    void turtleCanMoveForwardWhileFacingEast() {
        assertEquals(new Position(0,0), turtle.getCurrentPosition());
        turtle.move(5);
        assertEquals(new Position(0,5), turtle.getCurrentPosition() );
    }
    @Test
    void turtleCanMoveBackwardToWestFromEast() {
        turtle.move(12);
        assertEquals(new Position(0,12), turtle.getCurrentPosition());
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.move(7);
        assertEquals(new Position(0, 5), turtle.getCurrentPosition());
    }
    @Test
    void turtleCanMoveToSouthFromInitialPosition() {
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.move(7);
        assertEquals(new Position(7, 0), turtle.getCurrentPosition());
    }
    @Test
    void turtleCanMoveUpFromSouth() {
        turtle.turnRight();
        turtle.move(15);
        assertEquals(SOUTH, turtle.getCurrentDirection());
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.move(3);
        assertEquals(new Position(12,0), turtle.getCurrentPosition());
    }
    @Test
    void turtleCanMoveInAllDirection() {
        turtle.move(12);
        assertEquals(new Position(0,12), turtle.getCurrentPosition());
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.move(5);
        assertEquals(new Position(0,7), turtle.getCurrentPosition());
        turtle.turnLeft();
        turtle.move(6);
        assertEquals(new Position(6,7), turtle.getCurrentPosition());
        turtle.turnLeft();
        turtle.move(7);
        assertEquals(new Position(6, 14), turtle.getCurrentPosition());
    }

}