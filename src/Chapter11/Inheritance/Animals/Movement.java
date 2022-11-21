package Chapter11.Inheritance.Animals;

import Turtle.Position;

public class Movement {
    private boolean isMoving;
    private Position currentPosition;

    public Movement() {
        currentPosition = new Position(0,0);
    }

    public void moving() {
        if (currentPosition.getRow() > 0 || currentPosition.getColumn() > 0) {
            isMoving = true;
        }
    }
    public boolean getIsMoving() {
        return isMoving;
    }
    public void notMoving() {
        if (currentPosition.getRow() == 0 || currentPosition.getColumn() == 0) {
            isMoving = false;
        }
    }
    public void move(int numberOfMoves) {
        currentPosition.setColumn(currentPosition.getColumn() + numberOfMoves);
    }
}
