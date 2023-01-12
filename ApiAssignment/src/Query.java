public class Query {
    @Override
    public String toString() {
        return "Query{" +
                "bool=" + bool +
                ", must=" + must +
                ", match=" + match +
                '}';
    }

    private Bool bool;
    private Must must;
    private Match match;
    private Query(QueryBuilder builder){

        this.bool = builder.bool;
        this.must = builder.must;
        this.match = builder.match;
    }

    public static class QueryBuilder{
        private Bool bool;
        private Must must;
        private Match match;


        public QueryBuilder(){
            bool = new Bool();
        }

        public QueryBuilder bool(){
            must = new Must();
            match = new Match();
            return this;
        }

        public QueryBuilder mustMatch(String item, String item_type){
            match.item = item;
            match.item_type = item_type;
            return this;
        }

        public QueryBuilder shouldMatch(String product_location, int warehouse_number){
            match.product_location = product_location;
            match.warehouse_number = warehouse_number;
            return this;
        }


        public Query build(){

            return new Query(this);
        }
    }
}
