import java.util.ArrayList;
import java.util.List;

public class App {

    public static List<User> users = new ArrayList<User>();

    public static void main(String[] args) {
        User ben = new User.Builder("benlevels","benlevels@gmail.com")
                .firstName("Benjamin").lastName("Levels").phoneNumber("4242121328").address("3477 Maricopa St, Apt 31 Torrance, CA 90503").build();
        User tahira = new User.Builder("tahiralevels","tahiralevels@gmail.com")
                .firstName("Tahira").lastName("Levels").phoneNumber("3104217728").address("3477 Maricopa St, Apt 31 Torrance, CA 90503").build();
        User kiyera = new User.Builder("kiyeralevels","kiyeralevels@gmail.com")
                .firstName("Kiyera").lastName("Levels").phoneNumber("3108638105").address("3477 Maricopa St, Apt 31 Torrance, CA 90503").build();
        User jonah = new User.Builder("jonahlevels","jonahlevels@gmail.com")
                .firstName("Jonah").lastName("Levels").phoneNumber("3103453608").address("3477 Maricopa St, Apt 31 Torrance, CA 90503").build();
        User alanna = new User.Builder("alannalevels","alannalevels@gmail.com")
                .firstName("Alanna").lastName("Levels").phoneNumber("3102788652").address("3477 Maricopa St, Apt 31 Torrance, CA 90503").build();




        System.out.println(tahira);
    }
}
