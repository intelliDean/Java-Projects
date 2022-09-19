package chapter03;
import java.time.LocalDate;

public class HealthProfile {
    /*In this exercise, you’ll design a “starter” HealthProfile class for a person. The class attributes
    should include the person’s first name, last name, gender, date of birth (consisting of separate
attributes for the month, day and year of birth), height (in inches) and weight (in pounds). Your class
should have a constructor that receives this data. For each attribute, provide set and get methods.
The class also should include methods that calculate and return the user’s age in years, maximum
heart rate and target-heart-rate range (see Exercise 3.16), and body mass index (BMI; see
Exercise 2.33). */
    LocalDate myObj = LocalDate.now();

    private String firstName;
    private String lastName;
    private String gender;
    private int day;
    private int month;
    private int year;
    private double height;
    private double weight;


    public HealthProfile (String firstName, String lastName, String gender, int day, int month, int year, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.day = day;
        this.month = month;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getDay() {
        return day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getMonth() {
        return month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public String displayDOB() {
        return getDay()+"/"+getMonth()+"/"+getYear();
    }
    public void setGender (String gender) {
        this.gender = gender;
    }
    public String getGender() {
        return gender;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public int calculateAge() {
        return myObj.getYear() - getYear();// this first getYear is the current year in the java package and the second year is the getYear method in my class
    }
    public int maximunHeartRate() {
        return 220 - calculateAge();
    }
    public double targetHeartRate() {
        return calculateAge() * 0.5;
    }
    public double bodyMassIndex() {
        return (getWeight() * 703)/(getHeight() * getHeight());
    }
}
