package labs_examples.objects_classes_methods.labs.oop.C_blackjack.nicolas;

public class BlackjackController {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player bob = new Player("Bob");
        Player alice = new Player("Alice");

        deck.deal(bob);
        System.out.println(bob);
        System.out.println(deck);
        deck.deal(bob);
        System.out.println(bob);
        System.out.println(deck);

        deck.deal(alice);
        System.out.println(alice);
        System.out.println(deck);
        deck.deal(alice);
        System.out.println(alice);
        System.out.println(deck);
    }
}
