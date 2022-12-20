package chapter16.card_shuffle;

public class Card {
public enum Face {      //this enum type should actually be in a separate class outside of CARD class  but this is another cool way to do
    Ace, Deuce, Three, Four, Five, Six,
    Seven, Eight, Nine, Ten, Jack, Queen, King
}
public enum Suit {
    Clubs, Diamonds, Hearts, Spades
}
//Fields
    private final Face face;
    private final Suit suit;

    // constructor
    public Card(Face face, Suit suit) {
        this.face = face;
        this.suit = suit;
    }

    // return face of the card
    public Face getFace() {
        return face;
    }

    // return suit of Card
    public Suit getSuit() {
        return suit;
    }

    // return String representation of Card
    public String toString() {
        return String.format("%s of %s", face, suit);
    }
}
