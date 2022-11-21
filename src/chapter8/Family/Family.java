package chapter8.Family;

public enum Family {
    FATHER("Michael Dean", 20, Gender.MALE, "Software Engineer"),
    MOTHER("Jennifer Dean", 21, Gender.FEMALE, "Talent Manager"),
    FIRST_SON("Eliandra Dean", 12, Gender.MALE, "Footballer"),
    DAUGHTER("Paris Dean", 9, Gender.FEMALE, "Athlete"),
    LAST_BORN("Felicia Dean", 3, Gender.FEMALE, "Student");

    private String  name;
    private int age;
    private Gender gender;
    private String occupation;

    Family(String name, int age, Gender gender, String occupation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
