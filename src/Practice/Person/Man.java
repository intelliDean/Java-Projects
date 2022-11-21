package Practice.Person;

import chapter8.DatePackage.Date;
import chapter8.Human;
import chapter8.Time;

public class Man {
    private Human human;
    private Date date;
    private Time time;

    public Man(String firstName, String lastName, int age, String phoneNumber, int day, int month, int year, int second, int minute, int hour) {
        this.human = new Human(firstName, lastName, age, phoneNumber);
        this.date =  new Date(day, month, year);
        this.time = new Time(hour, minute, second);
    }
    public Man(Human human, Date date, Time time) {
        this.human = human;
        this.date =  date;
        this.time = time;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
    public void setAge(int age) {
        human.setAge(age);
    }
    public int getAge() {
        return human.getAge();
    }

    public static void main(String[] args) {
        Man man = new Man("Man", "O",12, "12345678912", 1, 8, 1232, 23, 12, 3);
        Date date =  new Date(1, 8, 2022);
        Human human = new Human("Man", "O", 12, "08099202392");
        Time time = new Time(5, 12, 32);
        Man newMan = new Man(human, date, time);


        System.out.println(newMan.time.toString());
        System.out.println(man.human.getFirstName());
    }

}
