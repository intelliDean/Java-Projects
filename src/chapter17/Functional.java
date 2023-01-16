package chapter17;
/*You can create your own Functional Interface
A functional interface is an interface with just one abstract method
as many default methods and static methods*/
@FunctionalInterface        // you can explicitly declare it functional interface like this
                            // with this, compiler prevents you from declaring more than one abstract method else it will generate a compilation error
public interface Functional {
    int count();                // abstract method
    default int numberOfElements() {    //default method
        return 0;
    }
    static int numberOfIndex() {        //static method
        return 0;
    }
}
