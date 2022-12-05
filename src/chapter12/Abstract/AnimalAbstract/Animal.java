package chapter12.Abstract.AnimalAbstract;

/*Class Animal inherits abstract class Living Thing
* class Animal overrides method live from class Living Thing
* class Animal makes the overridden method to become abstract
* class Animal is now an abstract class because it has an abstract class.
* class Animal cannot be instantiated
* hence forcing every of its subclass to implement the method */
public abstract class Animal extends Living_Thing{

    @Override
    public abstract void live();
}
