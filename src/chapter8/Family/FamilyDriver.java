package chapter8.Family;

import java.util.EnumSet;

public class FamilyDriver {
    public static void main(String[] args) {
        display();
        Family.LAST_BORN.setName("Felicity Dean");
        System.out.println();
        System.out.printf("%-15s%-17s%-5s%-10s%-15s%n", " ","Name","Age", "Gender", "Occupation");
        for (Family family : EnumSet.range(Family.FIRST_SON,Family.LAST_BORN)) {
            System.out.printf("%-15s%-17s%-5d%-10s%-15s%n",
                    family, family.getName(), family.getAge(), family.getGender(), family.getOccupation());
        }


    }
    public static void display() {
        System.out.printf("%-15s%-17s%-5s%-10s%-15s%n", " ","Name","Age", "Gender", "Occupation");
        for (Family family : Family.values()) {
            System.out.printf("%-15s%-17s%-5d%-10s%-15s%n",
                    family, family.getName(), family.getAge(), family.getGender(), family.getOccupation());
        }
    }
}
