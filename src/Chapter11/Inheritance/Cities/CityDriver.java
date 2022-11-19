package Chapter11.Inheritance.Cities;

import Chapter11.Inheritance.Geometry.Circle;

import java.security.SecureRandom;

public class CityDriver {
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
//        ArrayList<Object> obj = new ArrayList<>();
//
//        obj.add(23);
//        obj.add("funny");
//        obj.add(12000);
//        obj.add("fried");
//
//        System.out.print(Arrays.toString(obj.toArray()));

//        ArrayList<Circle> circle = new ArrayList<>();
//        for (int i = 0; i < 5; i++) {
//            circle.add(new Circle());
//        }
//
//        circle.get(0).setRadius(1);
//        circle.get(0).setRadius(1);
//        circle.get(0).getArea();

        Circle[] circles = new Circle[5];
        for (int i = 0; i < circles.length; i++) {
            double num = rand.nextDouble();
            circles[i] = new Circle(num);
            System.out.println(circles[i].getRadius());
        }

    }
}
