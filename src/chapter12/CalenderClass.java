package chapter12;

import chapter8.DatePackage.Date;

import java.math.BigDecimal;
import java.util.Calendar;


public class CalenderClass {
    public static void main(String[] args) {
        Date date = new Date();

        date.setMonth(11);      //set month to be

        //Class Calendar is an abstract class hence it cannot be instantiated via new keyword
        // it could only be instantiated through the factory method Calendar.getInstance
        Calendar calender = Calendar.getInstance();


        if (date.getMonth() == calender.get(Calendar.MONTH) + 1) {      //comparing date month with calendar month
            System.out.println("it's the same month");
        } else {
            System.out.println("it's not the same month");
        }

        calender.add(Calendar.MONTH, 2);

        System.out.println(calender.getTime());

        if (calender.get(Calendar.YEAR) == 2023 &&
                calender.get(Calendar.MONTH ) == Calendar.MAY &&
                calender.get(Calendar.DAY_OF_MONTH) == 28)  {        //this could be used to schedule an action in your program

           BigDecimal pension =  payPension();
        }
        Calendar calender1 = Calendar.getInstance();
        System.out.println(calender.compareTo(calender1));

    }

    private static BigDecimal payPension() {
        return new BigDecimal("45000000000000"); //you could use string in BigDecimal if long cannot take all the values inputted
    }
}
