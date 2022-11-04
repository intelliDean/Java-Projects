package chapter10.BMI;

public class BMI {
    private final String name;
    private final int age;
    private final double weight; // in pounds
    private final double height; // in inches
    private static int noOfObject = 0;
    private final int myObj;
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    public BMI(String name, int age, double weight, double height) {
        validateAge(age);
        validateHeight(height);
        validateWeight(weight);
        this.name = name.toUpperCase();
        this.age = age;
        this.weight = weight;
        this.height = height;
        myObj = ++noOfObject;
    }

    public BMI(String name, double weight, double height) {
        this(name, 20, weight, height);
    }
    public static void validateAge(int age) {
        boolean ageNotValid = age < 0;
        if (ageNotValid) throw new IllegalArgumentException("Age is not valid");
    }
    public static void validateWeight(double weight) {
        boolean weightNotValid = weight < 0;
        if (weightNotValid) throw new IllegalArgumentException("Weight is not valid");
    }
    public static void validateHeight(double height) {
        boolean heightNotValid = height < 0;
        if (heightNotValid) throw new IllegalArgumentException("Height is not valid");
    }

    public double getBMI() {
        double bmi = weight * KILOGRAMS_PER_POUND / ((height * METERS_PER_INCH) * (height * METERS_PER_INCH));
        return Math.round(bmi * 100) / 100.0;
    }

    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 25)
            return "Normal";
        else if (bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public String getName() {
        return name.toUpperCase();
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
    public int getMyObj() {
        return myObj;
    }
    public static int getNoOfObject() {
        return noOfObject;
    }
}