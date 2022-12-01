package CHAPTER_4.exercise;
/*(Distance between two points) Write an application that reads the x and y coordinates of
two points on a plane and prints whether the points are located on a line perpendicular to an axis.*/
public class DistanceBetweenTwoPoints {


    public static String comparePoints(int x, int y) {
        return (x < y) ? "y-axis is greater than x-axis"  :
                ((x == y) ? "The points are located on a line" :
                        "x-axis is greater than y-axis");
    }
}
