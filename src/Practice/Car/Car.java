package Practice.Car;

import static Practice.Car.Cordinate.*;

public class Car {
    private Gear gear;

    private boolean isGearUp;
    private Cordinate currentCordinate;
    private State currentState;

    public Car() {
        gear = new Gear();
        currentCordinate = EAST;        //you either declare EAST as Cordinate.EAST or import Cordinate
        currentState = new State(0,0);

    }
    public void gearUp() {
        isGearUp = true;
    }

    public boolean isUp() {
        return isGearUp;
    }

    public void gearDown() {
        isGearUp =false;
    }

    public Cordinate getsCurrentCordinate() {
        return currentCordinate;
    }

    public void turnsRight() {
        switch (currentCordinate) {
            case EAST -> direction(SOUTH);
            case SOUTH -> direction(WEST);
            case WEST -> direction(NORTH);
            case NORTH -> direction(EAST);

        }
    }
    private void direction(Cordinate cordinate) {
        currentCordinate = cordinate;
    }

    public void turnsLeft() {
        switch (currentCordinate) {
            case EAST -> direction(NORTH);
            case NORTH -> direction(WEST);
            case WEST -> direction(SOUTH);
            case SOUTH -> direction(EAST);
        }
    }

    public void moves(int numberOfSteps) {
        switch (currentCordinate) {
            case EAST -> {
                currentState.setColumn(currentState.getColumn() + numberOfSteps);
            }
        }
    }

    public State getsCurrentState() {
        return currentState;
    }
}
