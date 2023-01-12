import java.io.IOException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        Chain c1 = new GreenFlag();
        Chain c2 = new WhiteFlag();
        Chain c3 = new BlueFlag();
        Chain c4 = new BlackFlag();
        Chain c5 = new RedFlag();

        c1.setNext(c2);
        c2.setNext(c3);
        c3.setNext(c4);
        c4.setNext(c5);
        String keyPress = "";
        String flagColor = "";
        Scanner scan = new Scanner(System.in);

        System.out.println("Press any button to proceed. Press 0 to exit");
        keyPress = scan.nextLine();
        while(!keyPress.equalsIgnoreCase("0")){

            int code = (int) (Math.random()*5) + 1;

            switch(code){
                case 1:
                    flagColor = "Green";
                    break;
                case 2:
                    flagColor = "Blue";
                    break;
                case 3:
                    flagColor = "White";
                    break;
                case 4:
                    flagColor = "Black";
                    break;
                case 5:
                    flagColor = "Red";
                    break;
            }
            c1.process(new Flag(flagColor));

            System.out.println("Press any button to proceed. Press 0 to exit");
            keyPress = scan.nextLine();
        }
    }
}
