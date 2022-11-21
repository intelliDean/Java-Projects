package Turtle;

public class Pen {
    private boolean isPenUp;

    public void penUp() {
        isPenUp = true;     // to take pen up
    }

    public boolean isPenUp() {
        return isPenUp;     //return pen up
    }

    public void penDown() {
        isPenUp = false;        //  to bring the pen down
    }

}
