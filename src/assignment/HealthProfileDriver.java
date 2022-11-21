package assignment;

import chapter03.HealthProfile;

import java.util.Scanner;

class HealthProfileDriver {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*Write a Java app that prompts for the person’s information, instantiates an object of
class HealthProfile for that person and prints the information from that object—including the
person’s first name, last name, gender, date of birth, height and weight—then calculates and prints the
person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display
the BMI values chart from Exercise 2.33.*/

        HealthProfile myProfile = new HealthProfile("Michael", "Dean", "Male", 1,8, 1989,63.6, 50.01);

       // System.out.printf("%n%s, %s %s.%n%s%n%n%s: %s%n%s: %s%n%s: %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %d%n%s: %.2f%n%s: %d%n%s: %.2f%n", "Welcome", myProfile.getFirstName(), myProfile.getLastName(), "These are your information ", "First Name", myProfile.getFirstName(), "Last Name", myProfile.getLastName(), "Gender", myProfile.getGender(), "Birthday", myProfile.displayDOB(), "Height", myProfile.getHeight(), "Weight", myProfile.getWeight(), "Age", myProfile.calculateAge(), "BMI", myProfile.bodyMassIndex(), "Max Heart Rate", myProfile.maximunHeartRate(), "Target HR", myProfile.targetHeartRate());

        System.out.println("Enter first name");
        String fname = input.nextLine();
        myProfile.setFirstName(fname);

        System.out.println(myProfile.getFirstName());
        System.out.printf("%n%s, %s %s.%n%s%n%n%s: %s%n%s: %s%n%s: %s%n%s: %s%n%s: " +
                "%.2f%n%s: %.2f%n%s: %d%n%s: %.2f%n%s: %d%n%s: %.2f%n", "Welcome",
                myProfile.getFirstName(), myProfile.getLastName(), "These are your information ",
                "First Name", myProfile.getFirstName(), "Last Name", myProfile.getLastName(), "Gender",
                myProfile.getGender(), "Birthday", myProfile.displayDOB(), "Height", myProfile.getHeight(),
                "Weight", myProfile.getWeight(), "Age", myProfile.calculateAge(), "BMI", myProfile.bodyMassIndex(),
                "Max Heart Rate", myProfile.maximunHeartRate(), "Target HR", myProfile.targetHeartRate());



    }

}