package chapter8;

public class Time {
    private int hour; // 0 - 23
    private int minute; // 0 - 59
    private int second; // 0 - 59

        //Creating a constructor for class Time
    public Time(int hour, int minute, int second) {
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public static void validateSecond(int second) {
        boolean secondIsInvalid = second < 0 || second > 59;
        if (secondIsInvalid)
            throw new IllegalArgumentException("Minute is invalid. Minute is between 0 & 59");
    }

    public static void validateMinute(int minute) {
        boolean minuteIsInvalid = minute < 0 || minute >  59;
        if (minuteIsInvalid)
            throw new IllegalArgumentException("Minute is invalid. Minute is between 0 & 59");
    }

    public static void validateHour(int hour) {
        boolean hourIsInvalid = hour > 23 || hour < 0;
        if (hourIsInvalid) throw new IllegalArgumentException("Hour is invalid. Hour is between 0 & 23");
    }
    public void setHour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }
    public void setMinute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }
    public void setSecond(int second) {
        validateSecond(second);
        this.second = second;
    }

         // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
        //return hour+ ":"+minute+":"+second;
    }

         // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString() {
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM"));
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }
}
