public class App {

    public static void main(String[] args) {
    User ben = new User.Builder("benlevels","benlevels@gmail.com")
            .firstName("Benjamin").lastName("Levels").address("3477 Maricopa St, Apt 31 Torrance, CA 90503").build();

        System.out.println(ben);

    }
}
