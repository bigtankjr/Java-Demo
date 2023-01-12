//import com.fasterxml.jackson.*;

public class Test {

    public static void main(String[] args) {
        Query.QueryBuilder builder = new Query.QueryBuilder();

        builder.bool().shouldMatch("Mexico",32).bool().mustMatch("Milk","Dairy").build();

        System.out.println(builder);
    }
}
