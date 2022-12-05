package chapter12.Polymophism.Interfaces.Edible;

public class EdibleDriver {
    public static void main(String[] args) {
        Object[] objects = {new Tiger(), new Chicken(), new Apple(), new Orange()};
        for (Object object : objects) {
            if (object instanceof Edible) {
                System.out.println(((Edible) object).howToEat());
            }
            System.out.println();
            if (object instanceof Animal) {
                System.out.println(((Animal) object).sound());
            }
        }
    }
}
