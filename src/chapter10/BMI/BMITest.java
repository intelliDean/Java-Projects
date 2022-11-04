package chapter10.BMI;

public class BMITest {
    public static void main(String[] args) {
        System.out.printf("%-3s%-20s%-10s%-15s%n", " ","Name", "BMI", "Status");
        BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
        System.out.printf("%-3d%-20s%-10.2f%-15s%n", bmi1.getMyObj(), bmi1.getName(), bmi1.getBMI(), bmi1.getStatus());

        BMI bmi2 = new BMI("Susan King", 215, 70);
        System.out.printf("%-3d%-20s%-10.2f%-15s%n", bmi2.getMyObj(), bmi2.getName(), bmi2.getBMI(), bmi2.getStatus());

        BMI bmi3 = new BMI("Michael Dean", 23,150, 72);
        System.out.printf("%-3d%-20s%-10.2f%-15s%n", bmi3.getMyObj(), bmi3.getName(), bmi3.getBMI(), bmi3.getStatus());
    }
}
