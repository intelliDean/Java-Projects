package Chapter11.Inheritance.Geometry;

public abstract class Geometry {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    private static int object;


    /**
     * Construct a default geometric object
     */
    public Geometry() {
        dateCreated = new java.util.Date();
    }

    /**
     * Construct a geometric object with the specified color
     * 12 * and filled value
     */
    public Geometry(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public static int objectNumber() {
        return ++object;
    }

    /**
     * Return color
     */
    public String getColor() {
        return color;
    }

    /**
     * Set a new color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Return filled. Since filled is boolean,
     * 30 its getter method is named isFilled
     */
    public boolean isFilled() {
        return filled;
    }

    /**
     * Set a new filled
     */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Get dateCreated
     */
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    /**
     * Return a string representation of this object
     */
    public String toString() {
        return String.format("%s%s%n%s%s%n%s%b", "created on ", dateCreated, "color: ", color, "filled: ", filled);
    }

    /**
     * Abstract method getArea
     */
    public abstract double getArea();

    /**
     * Abstract method getPerimeter
     */
    public abstract double getPerimeter();
}