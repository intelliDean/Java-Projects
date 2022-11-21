package Practice;

public class TwoClasses {
    private int age;
    private String name;

    public TwoClasses(int age,String name) {
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
}
class SecondClass{
    public static void main(String[] args) {
        TwoClasses clan = new TwoClasses(25, "Solom");

        System.out.println(clan.getAge());
    }
}
class ThirdClass {
    public static void main(String[] args) {
        for (int i = 1; i <= 13; i++) {
            System.out.printf("% d",i);
        }
    }
}