package snack;

import java.util.Scanner;

public class Clock {
    /*(snack.Clock Class) Create a class called snack.Clock that includes three instance variables—an hour
            (type int), a minute (type int) and a second (type int). Provide a constructor that initializes the
    three instance variables and assumes that the values provided are correct. Provide a set and a get
    method for each instance variable. The set method should set the value of all three variables to 0 if
    the value of hour is more than 23, the value of minute is more than 59, and the value of second is
    more than 59. Provide a method displayTime that display the time in an “hh:mm:ss” format. Write
    a test app named ClockTest that demonstrates class snack.Clock’s capabilities.*/
    private int hour;
    private int minute;
    private int second;
    private String time;

    public Clock(int hour, int minute, int second) {
        if (hour > 23) {
            this.hour = 0;
        } else this.hour = hour;
        if (minute > 59) {
            this.minute = 0;
        } else this.minute = minute;
        if (second > 59) {
            this.second = 0;
        } else this.second = second;
    }

    public void setHour(int hour) {
        if (hour > 23) {
            this.hour = 0;
        } else this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if (minute > 59) {
            this.minute = 0;
        } else this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        if (second > 59) {
            this.second = 0;
        } else this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(int hour, int minute, int second) {
        time = hour + ":" + minute + ":" + second;
    }

    public String displayTime() {
        return time;
        //return getHour()+":"+getMinute()+":"+getSecond();
    }


    public static void main(String[] args) {
        Clock ago = new Clock(4, 34, 14);

        System.out.println("The time is " + ago.displayTime());


        Scanner input = new Scanner(System.in);

        System.out.println("Set the time -> hh:mm:ss ");
        int hour = input.nextInt();
        int minute = input.nextInt();
        int second = input.nextInt();
        ago.setHour(hour);
        ago.setMinute(minute);
        ago.setSecond(second);

        System.out.println("The new set time is " + ago.displayTime());
    }

}
