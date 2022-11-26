package chapter12.Abstract.AnimalAbstract;

/*Living thing class is declared abstract but without an abstract class.
* It is an abstract class because it cannot instantiate with new keyword
* but the subclass needs its constructor to create their objects*/
public abstract class Living_Thing {

    public void live() {
        System.out.println("I am a living thing");
    }
}
