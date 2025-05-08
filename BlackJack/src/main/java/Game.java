import java.util.ArrayList;

public class Game {

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffle();

        ArrayList<Playa> table = new ArrayList<>();

        String[] names = {"Izel", "Million", "Noah", "Gio"};

        for(String name: names) {
            Hand hand = new Hand();
            for (int i = 0; i < 2; i++) {
                Card currentCard = deck.deal();
                hand.deal(currentCard);
            }
            Playa playa = new Playa(hand, name);
            table.add(playa);
        }
        Playa winner = null;

        for(Playa playa: table) {
            System.out.println("Player : " + playa.getName() + " has " + playa.getValue() );
            if (playa.getValue() > 21) {
                continue;
            }
            if(winner == null) {
                winner = playa;
            }
            else {
                if(playa.getValue() > winner.getValue()) {
                    winner = playa;
                }
            }
        }

        System.out.println("\n\n");
        if (winner == null) {
            System.out.println("What!?!  Everyone busted!");
        }
        else {
            System.out.println("The winner: " + winner.getName() + " with " + winner.getValue() + "🎉");
        }

    }
}
