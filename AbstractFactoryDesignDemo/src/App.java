import interfaces.*;

public class App {
    public static void main(String[] args) {
        FactoryProvider f = new FactoryProvider();
        Animal bear = (Animal)f.getFactory("animal").create("bear");

        System.out.println(bear.makeSound());


        FactoryProvider c = new FactoryProvider();
        Color white = (Color)c.getFactory("color").create("white");
        System.out.println(white.getColor());
    }
}
