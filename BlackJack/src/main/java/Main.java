public class Main {

    public static void main(String[] args) {
        Hand hand = new Hand();

        Deck deck = new Deck();
        deck.shuffle();

        for (int i = 0; i < 2; i++) {
            Card currentCard = deck.deal();
            currentCard.flip();

            hand.deal(currentCard);
        }

        System.out.println(hand);
    }
}
