package labs_examples.objects_classes_methods.labs.oop.C_blackjack.nicolas;

public class Card {
    char suit;
    int cardValue;

    public Card(char suit, int cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", cardValue=" + cardValue +
                '}';
    }
}
