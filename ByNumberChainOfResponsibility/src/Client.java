public class Client {
    public static void main(String[] args) {
        Chain c1 = new SpeedBoat();
        Chain c2 = new Pontoon();
        Chain c3 = new Yacht();
        c1.setNext(c2);
        c2.setNext(c3);

        c1.process(new Boat(56));
        c1.process(new Boat(1));
        c1.process(new Boat(13));
        c1.process(new Boat(12));
        c1.process(new Boat(4));
    }
}
