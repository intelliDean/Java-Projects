package chapter8;

public class Native {
    private  Human human;
    private String name;
    private String phoneNumber;
    private int age;

    public Native(Human human) {
        this.name = human.getName();
        if (human.getPhoneNumber().length() == 11) {
            this.phoneNumber = human.getPhoneNumber();
        }
        if (human.getAge() > 0) {
            this.age = human.getAge();
        }
    }
}