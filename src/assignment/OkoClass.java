package assignment;

import java.util.Scanner;

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
        Scanner input = new Scanner(System.in);
            if (age > 18) {
            } else {
                System.out.println("You are too young to play");
            }this.age = age;
    }

    public void deposit(double depositAmount){
        if (depositAmount >= 500){ deposit = depositAmount;
        } else {
            System.out.println("Your deposit is too low. Minimum deposit is #500");
        }
    }
}
