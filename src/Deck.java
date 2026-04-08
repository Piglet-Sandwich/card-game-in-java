import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<>();

    // Builds the decks {{TYPE 1 == ENEMIES, TYPE 2 == WEAPONS, TYPE 3 == POTS}}
    public void build() {
        String[] black_suits = {"Spades", "Clubs"};
        for (String suit : black_suits) {
            for (int i = 2; i <= 14; i++) {
                deck.add(new Card(i, suit));
            }
        }
        String[] red_suits = {"Diamonds", "Hearts"};
        for (String suit : red_suits) {
            for (int i = 2; i <= 10; i++) {
                deck.add(new Card(i, suit));
            }
        }
    }

    // Ts prints each card in the deck for debugging
    public void print() {
        for (Card card : deck) {
            card.print();
        }
    }
}
