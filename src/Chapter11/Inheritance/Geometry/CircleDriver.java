package Chapter11.Inheritance.Geometry;

public class CircleDriver {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println(circle.toString());
        System.out.println(Circle.objectNumber()      //
                + Geometry.objectNumber()); //the superclass static methods are hidden is the same is declared in the subclass
        System.out.println("The color is " + circle.getColor());
        System.out.println("The radius is " + circle.getRadius());
        System.out.printf("The area is %.2f%n", circle.getArea());
        System.out.println("The diameter is " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("\nA rectangle " + rectangle.toString());
        System.out.println("The area is " + rectangle.getArea());
        System.out.println("The perimeter is " + rectangle.getPerimeter());


        // Create and initialize two objects
        Object object1 = new Circle(1);
        Object object2 = new Rectangle(1, 1);

        // Display circle and rectangle
        displayObject(object1);
        displayObject(object2);
    }

    /*A method for displaying an object */
    public static void displayObject(Object object) {
        if (object instanceof Circle) {
            System.out.printf("The circle area is %.2f%nThe circle diameter is %.2f%n",
                    ((Circle) object).getArea(), ((Circle) object).getDiameter());
        } else if (object instanceof Rectangle) {
            System.out.println("The rectangle area is " + ((Rectangle) object).getArea());
        }
    }
}