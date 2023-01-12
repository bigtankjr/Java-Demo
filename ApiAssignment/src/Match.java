public class Match {

    public String product_location; // Should
    public int warehouse_number;

    public String item;// Must
    public String item_type;

    @Override
    public String toString() {
        return "Match{" +
                "product_location='" + product_location + '\'' +
                ", warehouse_number=" + warehouse_number +
                ", item='" + item + '\'' +
                ", item_type='" + item_type + '\'' +
                '}';
    }
}
