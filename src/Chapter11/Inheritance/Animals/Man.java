package Chapter11.Inheritance.Animals;

public class Man extends Mammals{
private Living living;
private Movement movement;
private Eating eating;
private Growth growth;
private Death death;

public Man() {}

public Man(Living living, Movement movement, Eating eating, Growth growth, Death death) {
    this(living,movement,eating,growth);
    this.death = death;
}
    public Man(Living living, Movement movement, Eating eating, Growth growth){
        this.living = living;
        this.movement = movement;
        this.eating = eating;
        this.growth = growth;
    }


}
