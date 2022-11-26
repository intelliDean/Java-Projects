package chapter12;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalenderGreg {
    public static void main(String[] args) {
        // Construct a Gregorian calendar for the current date and time
        Calendar calendar = new GregorianCalendar();
        System.out.println("Current time is " + new Date());

        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));

        System.out.println("MONTH: " + calendar.get(Calendar.MONTH));

        System.out.println("DATE: " + calendar.get(Calendar.DATE));

        System.out.println("HOUR: " + calendar.get(Calendar.HOUR));

        System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));

        System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));

        System.out.println("SECOND: " + calendar.get(Calendar.SECOND));

        System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));

        System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));

        System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));

        System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));

        System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));

        // Construct a calendar for September 11, 2001
        Calendar calendar1 = new GregorianCalendar(2022, Calendar.NOVEMBER, 26);
        String[] dayNameOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[] monthOfTheYear = {"January", "February","March","April","May","June",
                "July","August","September","October","November","December"};

        System.out.printf("%s %d, %d is a %s%n%n",
                monthOfTheYear[calendar1.get(Calendar.MONTH)],
                calendar1.get(Calendar.DAY_OF_MONTH), calendar1.get(Calendar.YEAR),
                dayNameOfWeek[calendar1.get(Calendar.DAY_OF_WEEK) - 1]);


        calendar = new GregorianCalendar(2013, 2, 1);
        calendar1 = calendar;

        Calendar calendar2 = (Calendar)calendar.clone();

        System.out.println("Playing with clone() method");
         System.out.println("calendar == calendar1 is " + (calendar == calendar1));
         System.out.println("calendar == calendar2 is " + (calendar == calendar2));
         System.out.println("calendar.equals(calendar2) is " + calendar.equals(calendar2));
    }
}
