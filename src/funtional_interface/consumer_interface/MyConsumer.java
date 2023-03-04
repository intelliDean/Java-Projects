package funtional_interface.consumer_interface;

import java.util.function.Consumer;

public class MyConsumer implements Consumer<MyConsumer.Man> {
    @Override
    public void accept(Man man) {
        System.out.printf("""
                My name is %s and
                I am %d years old
                """, man.getName(), man.getAge());

    }

    static class Man {
        private String name;
        private int age;

        public Man(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}