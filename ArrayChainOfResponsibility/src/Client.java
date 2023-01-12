public class Client {

    public static void main(String[] args) {
        Chain c1 = new OneDimension();
        Chain c2 = new TwoDimension();
        Chain c3 = new ThreeDimension();

        c1.setNext(c2);
        c2.setNext(c3);

        c1.process(new Dimension(12));
        c1.process(new Dimension(12,3));
        c1.process(new Dimension(12,3,7));
        c1.process(new Dimension(1));
        c1.process(new Dimension(2,3));
        c1.process(new Dimension(5,55,12));
    }
}
