package chapter12.Abstract.AnimalAbstract;


/*class Plant inherits from class an Abstract class Living Thing
* class Plant overrides method live() in the Living Thing class.
* class Plant is not an abstract class*/
public class Plant extends Living_Thing{

    @Override
    public void live() {
        System.out.println("Though I am a living thing but I am a plant");
    }
}
