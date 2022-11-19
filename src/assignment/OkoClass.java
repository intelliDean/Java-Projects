package assignment;

public class OkoClass {
    private String name;
    private int age;
    private double deposit;

    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age) {
        if (age > 18) {
            this.age = age;
        } else {
            System.out.println("You are too young to play");
        }
    }

    public void deposit(double depositAmount){
        if (depositAmount >= 500){
            deposit = depositAmount;
        } else {
            System.out.println("Your deposit is too low. Minimum deposit is #500");
        }
    }
}
