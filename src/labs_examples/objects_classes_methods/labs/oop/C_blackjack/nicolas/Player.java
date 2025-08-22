package labs_examples.objects_classes_methods.labs.oop.C_blackjack.nicolas;

public class Player {
    String name;
    Hand hand;
    int potValue;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hand=" + hand +
                ", potValue=" + potValue +
                '}';
    }
}
