package Practice.Person;

import chapter8.DatePackage.Date;

public class PersonDriver {
    public static void main(String[] args) {
        Date date = new Date(1,8, 1989);
        Person dean = new Person("Michael Dean", "08095729090", 20, 1, 8);
        Person man = new Person("Man O.P", "123456789", 12, date);


        //System.out.println(dean.getDateOfBirth().getMonth());

        System.out.println(dean);
    }
}
