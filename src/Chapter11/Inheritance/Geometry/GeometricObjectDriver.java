package Chapter11.Inheritance.Geometry;

public class GeometricObjectDriver {
    public static void main(String[] args) {
        // Create two geometric objects
        Geometry geoObject1 = new Circle(5);
        Geometry geoObject2 = new Rectangle(5, 3);
        System.out.println("The two objects have the same area? " + equalArea(geoObject1, geoObject2));

        // Display circle
        displayGeometricObject(geoObject1);

        // Display rectangle
        displayGeometricObject(geoObject2);
    }

    /**
     * A method for comparing the areas of two geometric objects
     */
    public static boolean equalArea(Geometry object1, Geometry object2) {
        return object1.getArea() == object2.getArea();
    }

    /**
     * A method for displaying a geometric object
     */
    public static void displayGeometricObject(Geometry object) {
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}
