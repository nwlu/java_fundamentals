package labs_examples.objects_classes_methods.labs.oop.C_blackjack.nicolas;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    Card[] cards;
    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    ArrayList<Integer> usedCards = new ArrayList<>();

    public Deck() {
        populateDeck();
//        for(Card c : cards){
//            System.out.println(c.toString());
//        }
    }

    private void populateDeck() {
        cards = new Card[52];
        int count = 0;

        for (int s = 0; s < suit.length; s++){
            for (int n = 1; n <= 13; n++){
                Card obj = new Card(suit[s], n);
                cards[count] = obj;
                count++;
            }
        }
    }

    public void deal(Player player){
        if (usedCards.size() == cards.length){
            throw new RuntimeException("Not enough cards to play");
        }

        Random r = new Random();
        int index;

        do{
            index = r.nextInt(cards.length);
        }
        while(usedCards.contains(index));

        Card card = cards[index];
        player.hand.cards.add(card);

        usedCards.add(index);
    }

    @Override
    public String toString() {
        return "Deck{" +
                "usedCards=" + usedCards +
                '}';
    }
}
