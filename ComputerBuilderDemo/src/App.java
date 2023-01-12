public class App {

    public static void main(String[] args) {
        Computer laptop = new Computer.ComputerBuilder("HP","laptop").memory(500).motherboard("AMD550").build();

        System.out.println(laptop);
    }
}
