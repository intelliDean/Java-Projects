package chapter12;

public class House implements Cloneable, Comparable<House> {

    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public java.util.Date getWhenBuilt() {
        return whenBuilt;
    }

    @Override
    /* Override the protected clone method defined in
     the Object class, and strengthen its accessibility */
    public Object clone() throws CloneNotSupportedException {
        try {
// Perform a shallow copy
            House houseClone = (House)super.clone();
// Deep copy on whenBuilt
            houseClone.whenBuilt = (java.util.Date)(whenBuilt.clone());
            return houseClone;
        }
        catch (CloneNotSupportedException ex) {
            return null;
        }
    }
    @Override
    public int compareTo(House house) {
        if (area > house.area)
             return 1;
         else if (area < house.area)
             return -1;
         else
         return 0;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        House house1 = new House(1, 1750.50);
        House house2 = (House)house1.clone();


        System.out.println(house1.whenBuilt == house2.whenBuilt);

    }

}