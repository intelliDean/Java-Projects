package Practice.Inheritance;

public class Cat extends Animal{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Cat(){

    }

    public String toString(){
        return String.format("Object: %s%nAge: %d%n", name, age);
    }
    public void sound() {
        System.out.println("meow");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Alaska", 12);

        System.out.println(cat.toString());


        Animal pop = new Cat();
        pop.sound();
    }

}
