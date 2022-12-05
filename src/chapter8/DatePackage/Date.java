package chapter8.DatePackage;

public class Date {
    private int day; // 1-31 based on month
    private int month; // 1-12
    private int year; // any year
    private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

         // constructor: confirm proper value for month and day given the year

    public Date(int day, int month) {
        this.day = day;
        this.month = month;
    }
    public Date(int day, int month,  int year) {
        validateDay(day, month);
        validateMonth(day, month, year);
        validYear(day, month, year);
        this.day = day;
        this.month = month;
        this.year = year;

         System.out.printf("Date object constructor for date:  %s%n",this);
    }

    public Date() {

    }

    public void setDate(int day, int month, int year) {
        validateDay(day, month);
        validateMonth(day, month, year);
        validYear(day, month, year);
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // return a String of the form month/day/year
    public String toString() {
         return String.format("%02d/%02d/%02d", day, month, year);
    }

    public void validateMonth(int day, int month, int year) {
        boolean isInvalid = month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
        if (isInvalid) throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
    }
    public void validateDay(int day, int month) {
        boolean isInvalid = day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29));
        if (isInvalid) throw new IllegalArgumentException("day (" + day + ") " +
                "out-of-range for the specified month and year");
    }
    public void validYear(int day, int month, int year) {
        boolean isInvalid = month == 2 && day == 29 && !(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
        if (isInvalid) throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year");
    }
}