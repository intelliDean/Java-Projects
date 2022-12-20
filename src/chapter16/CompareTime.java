package chapter16;

import chapter8.Time;

import java.util.Comparator;

public class CompareTime implements Comparator<Time> {


    @Override
    public int compare(Time time1, Time time2) {
        int hourDifference;

        hourDifference = time1.getHour() - time2.getHour();

        if (hourDifference != 0) return hourDifference;

        int minuteDifference;

        minuteDifference = time1.getMinute() - time2.getMinute();

        if (minuteDifference != 0) return minuteDifference;

        int secondDifference;
        secondDifference = time1.getSecond() - time2.getSecond();
         return secondDifference;
    }
}
