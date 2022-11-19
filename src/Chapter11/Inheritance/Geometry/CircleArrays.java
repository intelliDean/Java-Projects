package Chapter11.Inheritance.Geometry;

import java.security.SecureRandom;
import java.util.ArrayList;

public class CircleArrays {
    public static void main(String[] args) {
        SecureRandom rand = new SecureRandom();
        Circle[] circles = new Circle[5];       // this creates 5 arrays space that is to be occupied by Circle objects

        System.out.println("One-Dimensional Array");
        System.out.printf("%-11s%-10s","Radius", "Area");
        for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle();      //this instantiates 5 Circle objects and store them in the arrays created.
            circles[i].setRadius(Math.random() + 1);    //accessing each Circle object, you go through the index
            System.out.printf("%n%-10.2f %-5.2f",circles[i].getRadius(), circles[i].getArea());
        }

        Circle[][] newCircles = new Circle[5][];
        newCircles[0] = new Circle[3];
        newCircles[1] = new Circle[2];
        newCircles[2] = new Circle[4];
        newCircles[3] = new Circle[2];
        newCircles[4] = new Circle[3];

        System.out.println("\n\nMulti-Dimensional array");
        for (int i = 0; i < newCircles.length; i++) {
            System.out.println("Circle "+(i+1));
            System.out.printf("%-11s%-10s%-10s%-13s%-18s%-15s%n","Radius", "Area", "Diameter", "Perimeter", "Color", "Date Created");
            for (int j = 0; j < newCircles[i].length; j++) {
                newCircles[i][j] = new Circle(Math.random() + 1);
                System.out.printf("%-10.2f%s%-10.2f%s%-10.2f%s%-10.2f%s%-10s%s%-30s%n",newCircles[i][j].getRadius()," ",newCircles[i][j].getArea()," ",newCircles[i][j].getDiameter()," ",newCircles[i][j].getPerimeter()," ",newCircles[i][j].getColor()," ",newCircles[i][j].getDateCreated());
            }
            System.out.println();
        }


        ArrayList<Circle> circleList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            circleList.add(new Circle(Math.random() + 1));
        }
        System.out.println("One-Dimensional ArrayList");
        System.out.printf("%-11s%-10s%-10s%-13s%-18s%-15s%n","Radius", "Area", "Diameter", "Perimeter", "Color", "Date Created");
        for (int i = 0; i < circles.length; i++) {
            System.out.printf("%-10.2f%s%-10.2f%s%-10.2f%s%-10.2f%s%-10s%s%-30s%n", circleList.get(i).getRadius()," ",circleList.get(i).getArea()," ",circleList.get(i).getDiameter()," ",circleList.get(i).getPerimeter()," ",circleList.get(i).getColor()," ",circleList.get(i).getDateCreated());
        }

        ArrayList<ArrayList<Circle>> circleLists = new ArrayList<>();

        circleLists.add(new ArrayList<Circle>());
        circleLists.add(new ArrayList<Circle>());
        circleLists.add(new ArrayList<Circle>());

        for (int i = 0; i < circleLists.size() - 1; i++) {
            for (int j = 0; j < (1 + rand.nextInt(2)); j++) {
                circleLists.get(i).add(new Circle(Math.random() + 1));
            }
        }
        for (int i = 0; i < circleLists.size(); i++) {
            for (int j = 0; j < circleLists.get(i).size(); j++) {
                System.out.println(circleLists.get(i).get(j).getArea()+" ");
            }
            System.out.println();
        }




    }
}
