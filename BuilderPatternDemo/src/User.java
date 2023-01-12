

public class User {

    private String userName;
    private String emailAddress; // Required

    private String firstName; // Optional
    private String lastName;
    private int phoneNumber;
    private String address;



    private User(Builder builder){
        userName = builder.userName;
        emailAddress = builder.emailAddress;
        firstName = builder.firstName;
        lastName = builder.lastName;
        phoneNumber = builder.phoneNumber;
        address = builder.address;
    }


    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                '}';
    }


    public static class Builder{
        private String userName;
        private String emailAddress; // Required

        private String firstName; // Optional
        private String lastName;
        private int phoneNumber;
        private String address;

        public Builder(String userName, String emailAddress) {
            this.userName = userName;
            this.emailAddress = emailAddress;
        }

        public Builder(){}

        public Builder firstName(String value){
            this.firstName = value;


            return this;
        }

        public Builder lastName(String value){
            this.lastName = value;

            return this;
        }

        public Builder phoneNumber(int value){
            this.phoneNumber = value;

            return this;
        }

        public Builder address(String value){
            this.address = value;

            return this;
        }

        @Override
        public String toString() {
            return "User{" +
                    "userName='" + userName + '\'' +
                    ", emailAddress='" + emailAddress + '\'' +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", phoneNumber=" + phoneNumber +
                    ", address='" + address + '\'' +
                    '}';
        }

        public User build(){

            return new User(this);
        }

    }
}
