package Collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Person implements Comparator<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }

    public static void main(String[] args) {
        Person first = new Person("Dean", 23);
        Person second = new Person("Mike", 12);
        Person third = new Person("Tobi", 33);
        Person fourth = new Person("Michael", 15);

        Queue<Person> voters = new PriorityQueue<>((a,b) -> a.age - b.age);
        voters.add(first);
        voters.add(second);
        voters.add(third);
        voters.add(fourth);

        System.out.println(voters);

    }
}
