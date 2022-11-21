package chapter8;

import chapter8.DatePackage.Date;

public class Person {
    private Days birthDay;
    private Date dateOfBirth;


    public Person(Days birthDay) {
        this.birthDay = birthDay;
    }

    public void setBirthDay(Days birthDay) {
        this.birthDay = birthDay;
    }

    public Days getBirthDay() {
        return birthDay;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int day, int month, int year ) {
        dateOfBirth.setDate(day, month, year);
    }
}
