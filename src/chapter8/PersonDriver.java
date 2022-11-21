package chapter8;

import chapter8.DatePackage.Date;

public class PersonDriver {
    public static void main(String[] args) {
        Date birth = new Date(2, 11, 89);
        Person michaelDean = new Person(Days.TUESDAY);

        System.out.printf("%n%s%n",michaelDean.getBirthDay());
        birth.setDate(2,4,03);
        System.out.println();
        System.out.println(birth);

        //michaelDean.setDateOfBirth(12,8,2002);
        System.out.println(birth);

    }
}
