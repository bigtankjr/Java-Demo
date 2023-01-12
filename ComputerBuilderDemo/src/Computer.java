public class Computer {

    private String name;
    private String type; //Required

    private String motherboard; //Optional
    private int memory;

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", motherboard='" + motherboard + '\'' +
                ", memory=" + memory +
                '}';
    }

    private Computer(ComputerBuilder builder){
        this.name = builder.name;
        this.type = builder.type;
        this.motherboard = builder.motherboard;
        this.memory = builder.memory;
    }

    public static class ComputerBuilder{
        private String name;
        private String type; //Required

        private String motherboard; //Optional
        private int memory;
        public ComputerBuilder(String name, String type){
            this.name = name; this.type = type;
        }

        public ComputerBuilder motherboard(String value){
            this.motherboard = value;

            return this;
        }

        public ComputerBuilder memory(int value){
            this.memory = value;

            return this;
        }
        public Computer build(){

            return new Computer(this);
        }
    }
}
