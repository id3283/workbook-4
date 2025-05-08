public class Playa {
    Hand hand;
    String name;

    public Playa(Hand hand, String name) {
        this.hand = hand;
        this.name = name;
    }

    public int getValue() {
        return this.hand.getValue();
    }

    public String getName() {
        return this.name;
    }
}
